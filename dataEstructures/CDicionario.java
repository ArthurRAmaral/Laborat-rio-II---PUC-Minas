package dataEstructures;

/**
 * @author Arthur Rocha Amaral
 *      *incomplete*
 * @version 0.01 2019/10/31
 * @(#)CDicionario.java
 */

class CDicionario<K, V> {
    private CelulaDicionario<K, V> primeira, ultima;
    private int size;

    public CDicionario() {
        primeira = new CelulaDicionario();
        ultima = primeira;
        size = 0;
    }

    public boolean vazio() {
        return ultima == primeira;
    }

    public boolean add(K key, V value) {
        if (recebeValor(key) == null) {
            ultima.prox = new CelulaDicionario(key, value);
            ultima = ultima.prox;
            size++;
            return true;
        } else return false;
    }

    public V recebeValor(K chave) {
        CelulaDicionario<K, V> aux = primeira;
        boolean achou = false;
        while (aux != null && !achou) {
            aux = aux.prox;
            if (aux != null)
                if (aux.key.equals(chave)) {
                    achou = true;
                }
        }
        if (achou)return aux.value;
        else return null;
    }
}