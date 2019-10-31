package dataEstructures;

import java.io.Serializable;

/**
 * @author Arthur Rocha Amaral
 * @version 1.0 2019/10/31
 * @(#)Cell.java
 */

public class Cell<T> implements Serializable {
    public T item;
    public Cell<T> next;

    public Cell(T itemVal, Cell nextCell) {
        item = itemVal;
        next = nextCell;
    }

    public Cell(T itemVal) {
        item = itemVal;
        next = null;
    }

    public Cell() {
        item = null;
        next = null;
    }
}