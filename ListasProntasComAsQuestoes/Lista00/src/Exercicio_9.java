import java.util.Scanner;

public class Exercicio_9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("y=ax²+bx+c");
        System.out.print("a = ");
        int a = ler.nextInt();
        System.out.print("b = ");
        int b = ler.nextInt();
        System.out.print("c = ");
        int c = ler.nextInt();
        System.out.println("y = "+a+"x² + "+b+"x + "+c);
        System.out.print("Início = ");
        int x1 = ler.nextInt();
        System.out.print("Fim = ");
        int x2 = ler.nextInt();

        for(int i=x1;i<=x2;i++) {
            int x = i;
            int y = a*x*x+b*x+c;
            System.out.println("( "+x+" "+y+" )");
        }

    }
}
