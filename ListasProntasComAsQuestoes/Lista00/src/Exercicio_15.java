import java.util.Scanner;

public class Exercicio_15 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("A % B = ?");
        System.out.print("A: ");
        float a = leia.nextFloat();
        System.out.print("B: ");
        int b = leia.nextInt();
        float rest = a;
        for (int i = 0; rest >= b&&b!=0; i++) {
            rest -= (float) b;
        }

        if (b!=0)
            System.out.printf("Resto de %.0f / %d = %.0f",a,b,rest);
        else
            System.out.println("Não divisível po 0");
    }
}
