package dataEstructures;

import dataEstructures.exeptions.DicionaryDupKeyAreadyExists;

import java.io.Serializable;

/**
 * @author Arthur Rocha Amaral
 * @version 1.0 2019/10/31
 * @(#)DupDicionario.java
 */

public class DupDicionario<K, V> implements Serializable {
    private String titulo;
    private DupDicionaryCell<K, V> primeira;
    private DupDicionaryCell<K, V> ultima;
    private int quantidade = 0;

    public DupDicionario(String titulo) {
        this.titulo = titulo;
        primeira = new DupDicionaryCell<K, V>();
        ultima = primeira;
    }

    public boolean vazio() {
        return ultima == primeira;
    }

    public void adiciona(K chave, V valor) throws DicionaryDupKeyAreadyExists {
        if (recebeValor(chave) == null) {
            ultima.prox = new DupDicionaryCell<K, V>(chave, valor, null, ultima);
            ultima = ultima.prox;
            quantidade++;
        } else throw new DicionaryDupKeyAreadyExists();
    }

    public boolean chaveJaExiste(K chave) {
        if (retornaCelula(chave) == null) return false;
        else return true;
    }

    public V recebeValor(K chave) {
        DupDicionaryCell<K, V> aux = retornaCelula(chave);
        if (aux == null) return null;
        else return aux.value;
    }

    public V recebeValor(int index) {
        DupDicionaryCell<K, V> aux = retornaCelula(index);
        if (aux == null) return null;
        else return aux.value;
    }

    public void imprime() {
        DupDicionaryCell<K, V> aux = primeira;
        while (aux.prox != null) {
            System.out.println(aux.prox.value.toString());
            aux = aux.prox;
        }
    }

    private DupDicionaryCell<K, V> retornaCelula(K chave) {
        DupDicionaryCell<K, V> aux = primeira;
        boolean achou = false;
        while (aux != null && !achou) {
            aux = aux.prox;
            if (aux != null)
                if (aux.key.equals(chave)) {
                    achou = true;
                }
        }
        if (achou) return aux;
        else return null;
    }

    private DupDicionaryCell<K, V> retornaCelula(int index) {
        DupDicionaryCell aux = primeira;
        int i = 0;
        while (i <= index && aux != null) {
            aux = aux.prox;
            i++;
        }
        return aux;
    }

    public void remove(K chave) {
        DupDicionaryCell aux = retornaCelula(chave);
        if (aux != null) {
            if (aux.ant != null)
                aux.ant.prox = aux.prox;
            if (aux.prox != null)
                aux.prox.ant = aux.ant;
            quantidade--;
            if (quantidade == 0) {
                primeira = ultima;
            }
        }
    }

    public void recebePrimeiro() {
        DupDicionaryCell aux = primeira.prox;
        assert aux != null;
        aux.ant.prox = aux.prox;
        aux.prox.ant = aux.ant;
        quantidade--;
    }

    public V retornaPrimeiro() {
        if (!vazio()) return primeira.prox.value;
        else return null;
    }

    public int getQuantidade() {
        return quantidade;
    }

    private void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}