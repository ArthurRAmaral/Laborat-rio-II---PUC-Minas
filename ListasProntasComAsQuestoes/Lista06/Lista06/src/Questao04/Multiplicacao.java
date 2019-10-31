package Questao04;

import Questao02.StopWatchNano;

public class Multiplicacao {
    public static long multRec(long x, long n) {
        if (n==1) {
            return x;
        } else {
            return x + multRec(x,n-1);
        }
    }

    public static long mult(long x, long n) {
        long soma = 0;
        for (int i = 0; i<n;i++)
            soma += x;
        return soma;
    }

    public static void main(String[] args) {
        StopWatchNano tmp = new StopWatchNano();
        tmp.start();
        System.out.println("mult(3,715827881) = " + mult(3, 715827881));
        tmp.stop();
        System.out.println("tmp.getElapsedTime() = " + tmp.getElapsedTimeMili());

        System.out.println();
        System.out.println();

        tmp.start();
        System.out.println("multRec(3,715827881) = " + multRec(3, 715827881));
        tmp.stop();
        System.out.println("tmp.getElapsedTime() = " + tmp.getElapsedTimeMili());
    }
    /**     Iterativo
     * -----------------------------------
     * mult(3,715827881) = 2147483643
     * tmp.getElapsedTime() = 300
     *
     *
     *      Recursivo
     * -----------------------------------
     * Lança um erro de SrackOverflowError
     * ou seja estoura a pilha de execução
     */
}