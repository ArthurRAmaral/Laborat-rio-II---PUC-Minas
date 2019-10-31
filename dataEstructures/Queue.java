package dataEstructures;

import java.io.Serializable;

/**
 * @author Arthur Rocha Amaral
 * @version 1.0 2019/10/31
 * @(#)CFila.java
 */

public class Queue<T> implements Serializable {
    private Cell<T> front;
    private Cell<T> back;
    private int size;

    public Queue() {
        front = new Cell<T>();
        back = front;
    }

    public boolean isEmpty() {
        return front == back;
    }

    public boolean enqueue(T itemVal) {
        back.next = new Cell<T>(itemVal);
        back = back.next;
        size++;
        return true;
    }

    public T dequeue() {
        T item = null;
        if (front != back) {
            front = front.next;
            item = front.item;
            size--;
        }
        return item;
    }

    public T peek() {
        if (front != back)
            return front.next.item;
        else
            return null;
    }

    public boolean contains(T valorItem) {
        boolean found = false;
        for (Cell aux = front.next; aux != null && !found; aux = aux.next)
            found = aux.item.equals(valorItem);
        return found;
    }

    public int getSize() {
        return size;
    }

    public int getManyMatchs(T itemVal) {
        if (!isEmpty()) {
            Cell<T> aux = front.next;
            int i = 0;
            while (aux != null) {
                if (aux.item.equals(itemVal)) {
                    i++;
                }
                aux = aux.next;
            }
            return i;
        } else return 0;
    }

    public boolean clear() {
        front = new Cell();
        back = front;
        size = 0;
        return true;
    }

    public boolean removeAfter(T itemVal) {
        if (!isEmpty()) {
            Cell aux = new Cell();
            Cell ult = new Cell();
            boolean found = false;
            aux = front.next;
            int difSize = 0;
            while (aux != null) {
                if (found) difSize++;
                if (aux.item.equals(itemVal) && !found) {
                    ult = aux;
                    found = true;
                }
                aux = aux.next;
            }
            if (found) {
                ult.next = null;
                back = ult;
                size -= difSize;
                return true;
            } else return false;
        } else return false;
    }

    @Override
    public String toString() {
        String string = "[";
        for (Cell cell = front.next; cell != null; cell = cell.next) {
            string += cell.item;
            if (cell.next != null)
                string += ", ";
        }
        string += "]";
        return string;
    }
}