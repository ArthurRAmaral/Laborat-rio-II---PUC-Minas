import java.util.Random;

public class Questao02 {
    public static void main(String[] args) {
        CFila fila = new CFila();
        Random r = new Random();
        final int TAM = 10;
        int soma = 0;
        for (int i = 0; i < TAM; i++) {
            fila.enfileira(r.nextInt(100));
        }
        for (int i = 0; i < TAM; i++) {
            System.out.print(fila.peek() + " ");
            soma += (int) fila.desenfileira();
            if (i == TAM - 1) System.out.print("= ");
            else System.out.print("+ ");
        }
        System.out.print(soma);
    }
}
