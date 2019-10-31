import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        CFila fila = new CFila();
        Scanner leia = new Scanner(System.in);
        for (int i =0; i<10;i++){
            System.out.print("Insira o "+(i+1)+"º nome: ");
            fila.enfileira(leia.nextLine());
        }
        for (int i = 0;i<10;i++) {
            System.out.println((i+1)+"º - "+fila.desenfileira());
        }
    }
}
