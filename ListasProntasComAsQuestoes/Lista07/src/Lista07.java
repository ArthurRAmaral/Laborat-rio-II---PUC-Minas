import java.io.*;
import java.util.Scanner;

public class Lista07 {
    private static int hanoiMoves = 0;

    public static int mdc(int x, int y) {
        if (x % y == 0) {
            return y;
        } else {
            return mdc(y, (x % y));
        }
    }

    private static void mover(int origem, int destino) {
        System.out.println(origem + " -> " + destino);
        hanoiMoves++;
    }

    static void hanoi(int n) {
        hanoiMoves = 0;
        hanoi(n, 1, 3, 2);
    }

    static void hanoi(int n, int torre1, int torre2, int torre3) {
        if (n > 0) {
            hanoi(n - 1, torre1, torre3, torre2);
            mover(torre1, torre2);
            hanoi(n - 1, torre3, torre2, torre1);
        }
    }

    private static int repeteDigito(int dig, int num) {
        int i = 0;
        char digS = String.valueOf(dig).charAt(0);
        String numS = String.valueOf(num);
        return repeteDigito(digS, numS, i);
    }

    private static int repeteDigito(char dig, String num, int i) {
        if (i == num.length()) {
            return 0;
        } else {
            if (dig != num.charAt(i)) return repeteDigito(dig, num, i + 1);
            else return 1 + repeteDigito(dig, num, i + 1);
        }
    }

    private static int[] retornaVetIntGravado(String arq) {
        int[] num = null;
        try {
            FileInputStream file = new FileInputStream(arq);
            ObjectInputStream objfile = new ObjectInputStream(file);
            num = ((int[]) objfile.readObject());
            objfile.close();
            file.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return num;
    }

    private static void grava10NumerosEmArq(String nomeDoArq) {
        Scanner leia = new Scanner(System.in);
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Insira o " + (i + 1) + "º número: ");
            num[i] = leia.nextInt();
        }

        try {
            FileOutputStream file = new FileOutputStream(nomeDoArq);
            ObjectOutputStream objfile = new ObjectOutputStream(file);
            objfile.writeObject(num);
            objfile.flush();
            objfile.close();
            file.flush();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        String arq = "vetor10Numeros.bin";
        grava10NumerosEmArq(arq);
        int[] num = retornaVetIntGravado(arq);
        for (int i = 0; i < num.length; i++)
            System.out.println((i + 1) + "º valor: " + num[i]);
    }
}
