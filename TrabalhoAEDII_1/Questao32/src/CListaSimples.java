public class CListaSimples {
    public CCelula primeira, ultima;

    public CListaSimples() {// Código da função construtora
        primeira = null;
        ultima = primeira;
    }

    public boolean vazia() {// Código para verificar se a Lista está vazia
        return ultima == null;
    }

    public void insereComeco(Object valorItem) {// Código para inserir valorItem no início da Lista
        if (ultima == null) {
            primeira = new CCelula();
            ultima = primeira;
            ultima.item = (int) valorItem;
        } else {
            CCelula aux = new CCelula();
            aux.item = (int) valorItem;
            aux.prox = primeira;
            primeira = aux;
        }
    }

    public Object removeComeco() {// Código para remover e retornar o elemento do início da Lista
        if (ultima != null) {
            if (ultima != primeira) {
                CCelula aux;
                aux = primeira;
                primeira = primeira.prox;
                return aux.item;
            } else {
                CCelula aux = primeira;
                primeira = null;
                ultima = null;
                return aux.item;
            }
        } else return null;
    }

    public void insereFim(Object valorItem) {// Código para inserir valorItem no fim da Lista
        if (ultima == null) {
            primeira = new CCelula();
            ultima = primeira;
            ultima.item = (int) valorItem;
        } else {
            CCelula aux = new CCelula();
            aux.item = (int) valorItem;
            ultima.prox = aux;
            ultima = aux;
        }
    }

    public Object removeFim() {// Código para remover e retornar o elemento do fim da Lista
        if (ultima != null) {
            if (primeira == ultima) {
                CCelula aux = primeira;
                primeira = null;
                ultima = null;
                return aux.item;
            } else {
                CCelula aux = primeira;
                while (aux.prox.prox != null) {
                    aux = aux.prox;
                }
                ultima = aux;
                aux = aux.prox;
                ultima.prox = null;
                return aux.item;
            }
        } else return null;
    }

    public void imprime() {// Código para imprimir todos os elementos da Lista
        if (ultima != null) {
            if (primeira == ultima) {
                System.out.println("[ " + primeira.item + " ]");
            } else {
                CCelula aux = primeira;
                System.out.print("[ ");
                while (aux != null) {
                    System.out.print(aux.item + " ");
                    aux = aux.prox;
                }
                System.out.print("]\n");
            }
        }
    }

    public boolean contem(Object elemento) {// Código para verifica se a Lista contem o elemento passado como parâmetro
        boolean achou = false;
        CCelula aux = primeira;
        while (aux != null && !achou) {
            if (aux.item == (int) elemento) {
                achou = true;
            }
            aux = aux.prox;
        }
        return achou;
    }

}

