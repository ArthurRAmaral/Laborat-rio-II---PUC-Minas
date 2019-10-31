import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("A X B = ?");
        System.out.print("A: ");
        float a = leia.nextFloat();
        System.out.print("B: ");
        int b = leia.nextInt();

        float sum = 0;
        for (int i = 1; i<=b; i++) {
            sum += a;
        }

        System.out.printf("%.0f x %d = %.0f",a,b,sum);
    }
}
