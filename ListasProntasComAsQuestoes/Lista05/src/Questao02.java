import java.util.Scanner;

public class Questao02 {
    public static void procedimento(CLista lista) {
        Scanner leia = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.print("Insira o número da atividade: ");
        int atv = leia.nextInt();
        System.out.print("Insira o número do aluno: ");
        int aln = leia.nextInt();
        if (lista.retornaIndice(atv) != null && ((CLista) lista.retornaIndice(atv)).retornaIndice(aln) != null) {
            double nota = (int) ((CLista) lista.retornaIndice(atv)).retornaIndice(aln);
            System.out.println();
            System.out.printf("Atividade %d : Aluno %d: %d\n", atv, aln, nota);
        } else System.out.println("Não existe essa nota nos registros");
        System.out.println("-------------------------------------------------");
    }
}
