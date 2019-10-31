package Questao03;

import Questao02.StopWatchNano;

public class Fibonacci {
    private static long fibonacciRec(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacciRec(n-1) + fibonacciRec(n-2);
        }
    }

    public static long fibonacciRec(int n, boolean imprime) {
        long r = fibonacciRec(n);
        if (imprime)
            System.out.println("Fibonacci("+n+") = "+r);
        return r;
    }

    private static long fibonacci(int n) {
        int f = 0;
        int ant = 0;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                f = 1;
                ant = 0;
            } else {
                f += ant;
                ant = f - ant;
            }
        }
        return f;
    }

    public static long fibonacci(int n, boolean imprime) {
        long r = fibonacci(n);
        if (imprime)
            System.out.println("Fibonacci("+n+") = "+r);
        return r;
    }

    public static void main(String[] args) {
        final int MAX = 46;
        StopWatchNano tmp = new StopWatchNano();

        for (int i = 0; i < MAX + 1; i++) {
            System.out.println("________________________________");
            tmp.start();
            Fibonacci.fibonacci(i, true);
            tmp.stop();
            System.out.println("time: " + tmp.getElapsedTime() + " nano segundos");
            System.out.println("________________________________");
        }

        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println();

        for (int i = 0; i < MAX + 1; i++) {
            System.out.println("________________________________");
            tmp.start();
            Fibonacci.fibonacciRec(i, true);
            tmp.stop();
            System.out.println("time: " + tmp.getElapsedTimeMili() + " mili segundos");
            System.out.println("________________________________");
        }
    }
}

/** Maior fator para long Fibonacci(46) = 1836311903.
 *  Não aconteceu nenhum erro.
 *
 *      Recursivo
 *  ---------------------------
 *  Fibonacci(46) = 1836311903
 *  time: 8339 mili segundos
 *  ---------------------------
 *
 *      Iterativa
 *  ---------------------------
 *  Fibonacci(46) = 1836311903
 *  time: 57800 nano segundos
 *  ---------------------------
 */
