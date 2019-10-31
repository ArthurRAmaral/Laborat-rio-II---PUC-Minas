import java.util.Scanner;

public class Exercicio_19 {
    public static double hseq(int n) {
        if(n==1)
            return 1;
        else
            return ((double) 1/n)+hseq(n - 1);
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("H(n) = 1/1 + 1/2 + 1/3 + 1/4 +...+ 1/n \nn: ");
        int n = leia.nextInt();
        double hseqn = hseq(n);
        System.out.println("H("+n+") = 1/1 + 1/2 + 1/3 + 1/4 +...+ 1/n = "+hseqn);
    }
}
