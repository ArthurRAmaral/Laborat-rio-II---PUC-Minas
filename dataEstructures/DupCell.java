package dataEstructures;

import java.io.Serializable;

/**
 * @author Arthur Rocha Amaral
 * @version 1.0 2019/10/31
 * @(#)DupCell.java
 */

public class DupCell<T> implements Serializable {
    public T item;
    public DupCell<T> prev;
    public DupCell<T> next;

    public DupCell() {
        item = null;
        prev = null;
        next = null;
    }

    public DupCell(T itemVal) {
        item = itemVal;
        prev = null;
        next = null;
    }

    public DupCell(T itemVal, DupCell<T> prvCell, DupCell<T> nextCell) {
        item = itemVal;
        prev = prvCell;
        next = nextCell;
    }
}