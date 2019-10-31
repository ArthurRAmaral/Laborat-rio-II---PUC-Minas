import java.util.Scanner;

class CDicionario {
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
        if (achou)return aux.value;
        else return null;
    }
}