package Questao02;

public class Fatorial {
    public static long fat(int n) {
        long soma = 1;
        if(n!=0) {
            for (int i = 1; i <= n; i++) {
                soma = i * soma;
            }
        }
        return soma;
    }

    public static long fatr(int n) {
        if (n==1||n==0) {
            return 1;
        } else {
            return n * fatr(n-1);
        }
    }
    public static void imprfat(int n) {
        long r = fat(n);
        System.out.println(n+"! = "+r);
    }

    public static void imprfatr(int n) {
        long r = fatr(n);
        System.out.println(n+"! = "+r);
    }

    public static void main(String[] args) {
        final int qnt = 20;
        StopWatchNano tmp = new StopWatchNano();

        for (int i = 0; i<=qnt;i++) {
            System.out.println("________________________________");
            tmp.start();
            imprfat(i);
            tmp.stop();
            System.out.println("time: "+tmp.getElapsedTime()+" nano segundos");
            System.out.println("________________________________");
        }

        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println();

        for (int i = 0; i<=qnt;i++) {
            System.out.println("________________________________");
            tmp.start();
            imprfatr(i);
            tmp.stop();
            System.out.println("time: "+tmp.getElapsedTime()+" nano segundos");
            System.out.println("________________________________");
        }
    }
}
