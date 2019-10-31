import java.util.Scanner;

public class Exercicio_20 {
    public static double lseq(int n) {
        if (n==1)
            return 1;
        else
            return n/Math.sqrt(n*2-1) + lseq(n-1);
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("L(n) = 1/√1 + 2/√3 + 3/√5... \nn: ");
        int n = leia.nextInt();
        double lseqn = lseq(n);
        System.out.println("L("+n+") = 1/√1 + 2/√3 + 3/√5... = "+lseqn);
    }
}
