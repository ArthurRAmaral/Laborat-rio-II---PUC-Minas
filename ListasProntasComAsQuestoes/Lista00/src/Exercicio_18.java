import java.util.Scanner;

public class Exercicio_18 {
    public static long fibonacci(long n) {
        if (n == 1 || n == 2)
        {
            return 1;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Fibonacci n: ");
        int n = leia.nextInt();
        long fibn = fibonacci(n);
        System.out.println("O "+n+"º termo da série Fabonacci = "+fibn);
    }
}
