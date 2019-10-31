package dataEstructures;

/**
 * @author Arthur Rocha Amaral
 * @version 1.0 2019/10/31
 * @(#)Stack.java
 */

public class Stack<T> {
    private Cell<T> topo = null;
    private int size;

    public Stack() {

    }

    public boolean ïsEmpty() {
        return topo == null;
    }

    public void stackUp(T itemVal) {
        topo = new Cell<T>(itemVal, topo);
        size++;
    }

    public T unstack() {
        T item = null;
        if (topo != null) {
            item = topo.item;
            topo = topo.next;
            size--;
        }
        return item;
    }

    public boolean contains(T itemVal) {
        boolean achou = false;
        for (Cell<T> aux = topo; aux != null && !achou; aux = aux.next)
            achou = aux.item.equals(itemVal);
        return achou;
    }

    public T peek() {
        return (topo != null) ? topo.item : null;
    }

    public int getSize() {
        return size;
    }

    public void clear() {
        topo = null;
        size = 0;
    }
}