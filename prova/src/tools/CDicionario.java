package tools;

import java.util.Scanner;

public class CDicionario {
    private CCelulaDicionario primeira, ultima;

    public CDicionario() {
        primeira = new CCelulaDicionario();
        ultima = primeira;
    }

    public boolean vazio() {
        return ultima == primeira;
    }

    public void adiciona(Object chave, Object valor) {
        if (recebeValor(chave) == null) {
            ultima.prox = new CCelulaDicionario(chave, valor);
            ultima = ultima.prox;
        } else return;
    }

    public Object recebeValor(Object chave) {
        CCelulaDicionario aux = primeira;
        boolean achou = false;
        while (aux != null && !achou) {
            aux = aux.prox;
            if (aux != null)
                if (aux.key.equals(chave)) {
                    achou = true;
                }
        }
        if (achou) return aux.value;
        else return null;
    }

    @Override
    public String toString() {
        return toString(0);
    }

    public String toString(int i) {
        String retorno = "";
        CCelulaDicionario aux = primeira.prox;
        while (aux != null) {
            for (int j = 0; j < i; j++) {
                retorno += "\t";
            }
            retorno += aux.key + "\n";
            if (aux.value instanceof CDicionario)
                retorno += ((CDicionario) aux.value).toString(++i) + "\n";
            else if (aux.value instanceof CLista)
                retorno += ((CLista) aux.value).toString(++i) + "\n";
            aux = aux.prox;
            --i;
        }
        return retorno;
    }
}