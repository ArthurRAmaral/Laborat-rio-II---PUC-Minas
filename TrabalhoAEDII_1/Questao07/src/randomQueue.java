import java.util.Random;

public class randomQueue {
    private CCelula frente;
    private CCelula tras;
    private int qtde;

    public randomQueue() {//Construtora –cria uma randomQueue vazia
        frente = new CCelula();
        tras = frente;
        qtde = 0;
    }
    public boolean isEmpty() {// Retorna true se a randomQueue estiver vazia
        return frente == tras;
    }
    public void enqueue(Object item) {// Adiciona um item
        tras.setNext(new CCelula(item));
        tras = tras.getNext();
        qtde++;
    }
    public Object dequeue() {// Remove e retorna um elemento aleatório da randomQueue
        if (!isEmpty()) {
            int rnd = randomIdx();
            CCelula celAux = frente.getNext();
            for (int i = 1; i < (rnd - 1); i++) {
                celAux = celAux.getNext();
            }
            Object item = celAux.getNext().getItem();
            celAux.setNext(celAux.getNext().getNext());
            qtde--;
            return item;
        }else return null;
    }

    public Object sample() {// Retorna um elemento aleatório sem removê-lo da randomQueue
        if (!isEmpty()) {
            int rnd = randomIdx();
            CCelula celAux = frente.getNext();
            for (int i = 1; i < (rnd - 1); i++) {
                celAux = celAux.getNext();
            }
            Object item = celAux.getNext().getItem();
            return item;
        }else return null;
    }

    private int randomIdx() {
        Random randomTax = new Random();
        int rnd = Math.abs(randomTax.nextInt() % qtde);
        return rnd;
    }
}
