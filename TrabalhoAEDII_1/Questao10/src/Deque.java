public class Deque {
    private CCelulaDup esquerda;
    private CCelulaDup direita;
    private int qnt;

    public Deque() { // Construtora    cria uma Deque vazia
        esquerda = new CCelulaDup(null, null, null);
        direita = new CCelulaDup(null, esquerda, null);
        esquerda.prox = direita;
        qnt = 0;
    }

    boolean isEmpty() {// Retorna true se a Deque estiver vazia
        return esquerda.prox == direita;
    }

    int size() { // Retorna a quantidade de itens da Deque
        return qnt;
    }

    void pushLeft(Object item) { // Adiciona um item no lado esquerdo da Deque
        if (esquerda.prox!=direita) {
            esquerda.prox.ant = new CCelulaDup(item, esquerda, esquerda.prox);
            esquerda.prox = esquerda.prox.ant;
        } else {
            esquerda.prox = new CCelulaDup(item,esquerda,direita);
            direita.ant = esquerda.prox;
        }
        qnt++;
    }

    void pushRight(Object item) { // Adiciona um item no lado direito da Deque
        if (esquerda.prox!=direita) {
            direita.ant.prox = new CCelulaDup(item, direita.ant, direita);
            direita.ant = direita.ant.prox;
        } else {
            esquerda.prox = new CCelulaDup(item,esquerda,direita);
            direita.ant = esquerda.prox;
        }
        qnt++;
    }

    Object popLeft() { // Remove e retorna um item do lado esquerdo da Deque
        if (esquerda.prox != direita) {
            CCelulaDup retorno = esquerda.prox;
            esquerda.prox = esquerda.prox.prox;
            esquerda.prox.ant = esquerda;
            qnt--;
            return retorno.item;
        } else return null;
    }

    Object popRight() { // Remove e retorna um item do lado direito da Deque
        if (esquerda.prox != direita) {
            CCelulaDup retorno = direita.ant;
            direita.ant = direita.ant.ant;
            direita.ant.prox = direita;
            qnt--;
            return retorno.item;
        } else return null;
    }
}