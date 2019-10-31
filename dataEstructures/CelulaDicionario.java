package dataEstructures;

/**
 * @author Arthur Rocha Amaral
 * *incomplete*
 * @version 0.01 2019/10/31
 * @(#)CCelulaDicionario.java
 */

class CelulaDicionario<K, V> {
    K key;
    V value;
    
    public CelulaDicionario<K, V> prox;

    public CelulaDicionario() {
        key = null;
        value = null;
        prox = null;
    }

    public CelulaDicionario(K key, V value) {
        this.key = key;
        this.value = value;
        prox = null;
    }

    public CelulaDicionario(K key, V value, CelulaDicionario<K, V> proxima) {
        this.key = key;
        this.value = value;
        prox = proxima;
    }
}