import java.util.Scanner;

public class Exercicio_16 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("A % B = ?");
        System.out.print("A: ");
        int a = leia.nextInt();
        System.out.print("B: ");
        int b = leia.nextInt();

        int rest = a;
        int i = 0;
        for (i = 0; rest >= b&&b!=0; i++) {
            rest -= b;
        }

        if (b!=0)
            System.out.printf("Resto de %d / %d = %d",a,b,i);
        else
            System.out.println("Não divisível po 0");
    }
}
