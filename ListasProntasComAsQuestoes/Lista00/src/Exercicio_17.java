import java.util.Scanner;

public class Exercicio_17 {
    public static long factorial(long n) {
        if (n<0)
            return 0;
        if (n==0)
            return 1;
        if (n == 1)
            return 1;
        else
            return n* factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Fatorial: ");
        int n = leia.nextInt();
        long fatn = factorial(n);
        System.out.println("Fatoria de "+n+" = "+fatn);
    }
}
