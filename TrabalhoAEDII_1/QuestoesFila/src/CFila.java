/**
 * @author Rodrigo Richard Gomes
 * @version 1.00 2018/3/16
 * @(#)CFila.java
 */

public class CFila {
    private CCelula frente; // Celula cabeca.
    private CCelula tras; // Ultima celula.
    private int qtde;

    // Funcao construtora. Cria a celula cabeca e faz as referencias frente e tras apontarem para ela.
    public CFila() {
        frente = new CCelula();
        tras = frente;
    }

    // Verifica se a fila esta vazia. Retorna TRUE se a fila estiver vazia e FALSE caso contrario.
    public boolean vazia() {
        return frente == tras;
    }

    public void mostra() {
        System.out.print("[ ");
        for (CCelula c = frente.prox; c != null; c = c.prox)
            System.out.print(c.item + " ");
        System.out.println("] ");
    }

    // Insere um novo Item no fim da fila.
    // O parametro "valorItem" e um Object contendo o elemento a ser inserido no final da fila.
    public void enfileira(Object valorItem) {
        tras.prox = new CCelula(valorItem);
        tras = tras.prox;
        qtde++;
    }

    // Retira e retorna o primeiro elemento da fila.
    // Retorna um Object contendo o primeiro elemento da fila. Caso a fila esteja vazia retorna null.
    public Object desenfileira() {
        Object item = null;
        if (frente != tras) {
            frente = frente.prox;
            item = frente.item;
            qtde--;
        }
        return item;
    }

    // Retorna o primeiro Item da fila sem remove-lo.
    // Retorna um Object contendo o primeiro Item da fila.
    public Object peek() {
        if (frente != tras)
            return frente.prox.item;
        else
            return null;
    }

    // Verifica se o Item passado como parametro esta contido na fila.
    // O parametro "valorItem" e um object contendo o Item a ser localizado.
    // O metodo retorna TRUE caso o item esteja presente na fila.
    public boolean contem(Object valorItem) {
        boolean achou = false;
        CCelula aux = frente.prox;
        while (aux != null && !achou) {
            achou = aux.item.equals(valorItem);
            aux = aux.prox;
        }
        return achou;
    }

    // Verifica se o Item passado como parametro esta contido na fila. (Obs: usa o comando FOR)
    // Recebe como parametro um object contendo o Item a ser localizado.
    // Retorna TRUE caso o Item esteja presente na fila.
    public boolean contemFor(Object valorItem) {
        boolean achou = false;
        for (CCelula aux = frente.prox; aux != null && !achou; aux = aux.prox)
            achou = aux.item.equals(valorItem);
        return achou;
    }

    // Metodo que retorna a quantidade de itens da fila.
    public int quantidade() {
        return qtde;
    }

    //Questao13
    public int qtdeOcorrencias(Object elemento) {
        if (!vazia()) {
            CCelula aux = frente.prox;
            boolean achou = false;
            int i = 0;
            while (aux != null) {
                if (aux.item.equals(elemento)) {
                    i++;
                }
                aux = aux.prox;
            }
            return i;
        } else return 0;

    }

    //Questao20 - Fila
    public void Limpar() {
        frente = new CCelula();
        tras = frente;
        qtde = 0;
    }

    //Questao23
    public CFila(CFila fila) {
        frente = new CCelula();
        tras = frente;
        if (!fila.vazia()) {
            CCelula aux = new CCelula();
            aux = fila.frente.prox;
            while (aux != null) {
                enfileira(aux.item);
                aux = aux.prox;
            }
        }
    }

    //Questao25
    public void removerApos(Object item) {
        if (!vazia()) {
            CCelula aux = new CCelula();
            CCelula ult = new CCelula();
            boolean achou = false;
            aux = frente.prox;
            int difQnt = 0;
            while (aux != null) {
                if (achou) difQnt++;
                if (aux.item.equals(item)&&!achou) {
                    ult = aux;
                    achou = true;
                }
                aux = aux.prox;
            }
            if (achou) {
                ult.prox = null;
                tras = ult;
                qtde -= difQnt;
            }
        }
    }

    public static void main(String[] args) {
        CFila fila = new CFila();
        fila.enfileira(1);
        fila.enfileira(1);
        fila.enfileira(1);
        fila.enfileira(5);
        fila.enfileira(3);
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(7);
        fila.enfileira(6);
        fila.enfileira(2);
        System.out.println("fila.qtdeOcorrencias(1) = " + fila.qtdeOcorrencias(1));
        System.out.println("fila.qtdeOcorrencias(2) = " + fila.qtdeOcorrencias(2));
        CFila filaClone = new CFila(fila);
        fila.mostra();
        System.out.println("=");
        filaClone.mostra();
        System.out.println(filaClone.quantidade());
        filaClone.removerApos(1);
        filaClone.mostra();
        System.out.println(filaClone.quantidade());
    }
}