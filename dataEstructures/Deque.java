package dataEstructures;

/**
 * @author Arthur Rocha Amaral
 * @version 1.0 2019/10/31
 * @(#)Deque.java
 */

public class Deque<T> {
    private DupCell<T> left;
    private DupCell<T> rigth;
    private int size;

    public Deque() {
        left = new DupCell<T>(null, null, null);
        rigth = new DupCell<T>(null, left, null);
        left.next = rigth;
        size = 0;
    }

    public boolean isEmpty() {
        return left.next == rigth;
    }

    public int getSize() {
        return size;
    }

    public void pushLeft(T item) {
        if (left.next != rigth) {
            left.next.prev = new DupCell<T>(item, left, left.next);
            left.next = left.next.prev;
        } else {
            left.next = new DupCell<T>(item, left, rigth);
            rigth.prev = left.next;
        }
        size++;
    }

    public void pushRight(T item) {
        if (left.next != rigth) {
            rigth.prev.next = new DupCell<T>(item, rigth.prev, rigth);
            rigth.prev = rigth.prev.next;
        } else {
            left.next = new DupCell<T>(item, left, rigth);
            rigth.prev = left.next;
        }
        size++;
    }

    public T popLeft() {
        if (left.next != rigth) {
            DupCell<T> returnAux = left.next;
            left.next = left.next.next;
            left.next.prev = left;
            size--;
            return returnAux.item;
        } else return null;
    }

    public T popRight() {
        if (left.next != rigth) {
            DupCell<T> returnAux = rigth.prev;
            rigth.prev = rigth.prev.prev;
            rigth.prev.next = rigth;
            size--;
            return returnAux.item;
        } else return null;
    }
}