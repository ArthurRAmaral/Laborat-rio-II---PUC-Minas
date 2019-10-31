public class Aplication {
    public static void main(String[] args) {
        randomQueue RQ = new randomQueue();
        for (int i = 15; i >= 0; i--)
            RQ.enqueue(i);
        System.out.print("Remove e retorna um elemento qualquer= " + RQ.dequeue());
        System.out.print("\nRetorna um elemento sem remover = " + RQ.sample());
    }
}
