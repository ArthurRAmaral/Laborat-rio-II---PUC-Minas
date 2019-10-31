package dataEstructures;

/**
 * @author Arthur Rocha Amaral
 * @version 1.0 2019/10/31
 * @(#)RandomQueue.java
 */

public class RandomQueue<T> {
    private Cell<T> front;
    private Cell<T> back;
    private int size;

    public int getSize() {
        return size;
    }

    public RandomQueue() {
        front = new Cell<T>();
        back = front;
        size = 0;
    }

    public boolean isEmpty() {
        return front == back;
    }

    public void enqueue(T item) {
        back.next = (new Cell<T>(item));
        back = back.next;
        size++;
    }

    public T dequeue() {
        if (!isEmpty()) {
            int rnd = randomIdx();
            Cell<T> aux = front;
            int i = 0;
            while (i < rnd) {
                aux = aux.next;
                i++;
            }
            T item = aux.next.item;
            if (aux.next == back) {
                back = aux;
                back.next = null;
            } else aux.next = aux.next.next;
            size--;
            return item;
        } else return null;


    }

    public T sample() {
        if (!isEmpty()) {
            int rnd = randomIdx();
            Cell<T> cellAux = front.next;
            for (int i = 1; i < (rnd - 1); i++) {
                cellAux = cellAux.next;
            }
            T item = cellAux.next.item;
            return item;
        } else return null;
    }

    private int randomIdx() {
        int rnd = (int) (Math.random() * (size - 1));
        return rnd;
    }
}
