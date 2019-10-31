import java.util.Random;

public class Questao04 {
    public static void main(String[] args) {
        CPilha pilha = new CPilha();
        Random r = new Random();
        for (int i=0;i<10;i++) {
            pilha.empilha(r.nextInt());
        }
    }
}
