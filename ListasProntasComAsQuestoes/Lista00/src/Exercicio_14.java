import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("A ^ B = ?");
        System.out.print("A: ");
        float a = leia.nextFloat();
        System.out.print("B: ");
        int b = leia.nextInt();

        float sum = 1;
        for (int i = 1; i<=b; i++) {
            sum *= a;
        }
        if (b>=0)
            System.out.printf("%.0f ^ %d = %.0f",a,b,sum);

    }
}
