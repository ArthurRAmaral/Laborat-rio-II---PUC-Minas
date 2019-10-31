import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Qual o número da tabuada: ");
        int num = leia.nextInt();

        for (int i=1;i<=10;i++) {
            System.out.println(num +" x "+ i +" = "+ (i*num));
        }
    }
}
