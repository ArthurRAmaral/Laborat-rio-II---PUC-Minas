import java.util.Random;

public class Questao05 {
    public static void main(String[] args) {
        CPilha pilha = new CPilha();
        Random r = new Random();
        for (int i=0;i<10;i++) {
            pilha.empilha(r.nextInt(100));
        }
        int soma = 0;
        int denominador = 0;
        for (int i=0;i<10;i++) {
            soma += (int) pilha.desempilha();
            denominador++;
        }
        double media = (double) soma/denominador;
        System.out.println("media = " + media);
    }
}
