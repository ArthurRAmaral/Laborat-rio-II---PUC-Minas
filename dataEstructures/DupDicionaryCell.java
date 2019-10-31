package dataEstructures;

import java.io.Serializable;

/**
 * @author Arthur Rocha Amaral
 * @version 1.0 2019/10/31
 * @(#)DupDicionaryCell.java
 */

class DupDicionaryCell<K, V> implements Serializable {
    K key;
    V value;
    DupDicionaryCell<K, V> prox;
    DupDicionaryCell<K, V> ant;

    DupDicionaryCell() {
        key = null;
        value = null;
        prox = null;
        ant = null;
    }

    public DupDicionaryCell(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public DupDicionaryCell(K key, V value, DupDicionaryCell<K, V> prox, DupDicionaryCell<K, V> ant) {
        this.key = key;
        this.value = value;
        this.prox = prox;
        this.ant = ant;
    }
}