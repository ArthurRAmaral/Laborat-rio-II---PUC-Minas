public class RandomQueue {
    private CCelula frente;
    private CCelula tras;
    private int qtde;

    public int getQtde() {
        return qtde;
    }

    public RandomQueue() {//Construtora –cria uma RandomQueue vazia
        frente = new CCelula();
        tras = frente;
        qtde = 0;
    }

    public boolean isEmpty() {// Retorna true se a RandomQueue estiver vazia
        return frente == tras;
    }

    public void enqueue(Object item) {// Adiciona um item
        tras.prox = (new CCelula(item));
        tras = tras.prox;
        qtde++;
    }

    public Object dequeue() {// Remove e retorna um elemento aleatório da RandomQueue
        if (!isEmpty()) {
            int rnd = randomIdx();
            CCelula aux = frente;
            int i = 0;
            while (i < rnd) {
                aux = aux.prox;
                i++;
            }
            Object item = aux.prox.item;
            if (aux.prox == tras) {
                tras = aux;
                tras.prox = null;
            } else aux.prox = aux.prox.prox;
            qtde--;
            return item;
        } else return null;


//        if (!isEmpty()) {
//            int rnd = randomIdx();
//            CCelula celAux = frente.prox;
//            for (int i = 1; i < (rnd - 1); i++) {
//                celAux = celAux.prox;
//            }
//            Object item = celAux.prox.item;
//            celAux.prox = (celAux.prox.prox);
//            qtde--;
//            return item;
//        } else return null;

    }

    public Object sample() {// Retorna um elemento aleatório sem removê-lo da RandomQueue
        if (!isEmpty()) {
            int rnd = randomIdx();
            CCelula celAux = frente.prox;
            for (int i = 1; i < (rnd - 1); i++) {
                celAux = celAux.prox;
            }
            Object item = celAux.prox.item;
            return item;
        } else return null;
    }

    private int randomIdx() {
        int rnd = (int) (Math.random() * (qtde - 1));
        return rnd;
    }
}
