import java.util.Random;

public class Questao01 {
    public static void main(String[] args) {
        CLista lista = new CLista();
        Random r = new Random();
        final int TAM =10;
        int soma = 0;
        for (int i =0 ; i < TAM ; i++) {
            lista.insereComeco(r.nextInt(100));
        }
        for (int i =0;i<TAM;i++){
            System.out.print(lista.retornaPrimeiro()+" ");
            soma += (int) lista.removeRetornaComeco();
            if (i==TAM-1) System.out.print("= ");
            else System.out.print("+ ");
        }
        System.out.print(soma);
    }
}
