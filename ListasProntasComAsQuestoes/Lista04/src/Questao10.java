import java.util.Random;
import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int tipo;

        do {
            System.out.printf("-----------------------------------------------------\n");
            System.out.printf("     Escolha uma opção para armazeenar os dados:     \n");
            System.out.printf("-----------------------------------------------------\n");
            System.out.printf("0 - Sair\n");
            System.out.printf("1 - Lista\n");
            System.out.printf("2 - Fila\n");
            System.out.printf("3 - Pilha\n");
            System.out.printf("-----------------------------------------------------\n");
            System.out.printf("--> ");
            tipo = leia.nextInt();

            if (tipo != 0) {
                System.out.printf("-----------------------------------------------------\n");
                System.out.printf("        Escolha uma opção para criar a lista:        \n");
                System.out.printf("-----------------------------------------------------\n");
                System.out.printf("1 - Gera a coleção com n elementos, de 0 até n-1\n");
                System.out.printf("2 - Gera a coleção em ordem decrescente, de n-1 até 0\n");
                System.out.printf("3 - Gera a coleção com n elementos aleatórios\n");
                System.out.printf("-----------------------------------------------------\n");
                System.out.printf("--> ");
                int opc = leia.nextInt();
                System.out.printf("-----------------------------------------------------\n");

                System.out.printf("Insira um numero de termos: ");
                int n = leia.nextInt();
                System.out.printf("-----------------------------------------------------\n");

                switch (tipo) {
                    case 1:
                        CLista lista = Questao09.criaCLista(opc, n);
                        imprimeCLista(lista);
                        break;
                    case 2:
                        CFila fila = Questao09.criaCFila(opc, n);
                        imprimeCFila(fila);
                        break;
                    case 3:
                        CPilha pilha = Questao09.criaCPilha(opc, n);
                        imprimeCPilha(pilha);
                        break;
                    default:
                        break;
                }
            }
        } while (tipo != 0);
    }

    static void imprimeCLista(CLista a) {
        int qnt = a.quantidade();
        int linhas;
        if (qnt % 10 == 0) linhas = qnt;
        else linhas = qnt/10 + 1;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < 10; j++) {
                if (i < linhas-1 || (i == linhas-1 && j < qnt % 10)) {
                    System.out.print(a.retornaPrimeiro());
                    if (j != 9)
                        System.out.print(" | ");
                    a.insereFim(a.removeRetornaComeco());
                }
            }
            System.out.println();
        }
    }

    static void imprimeCFila(CFila q) {
        int qnt = q.quantidade();
        int linhas;
        if (qnt % 10 == 0) linhas = qnt;
        else linhas = qnt/10 + 1;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < 10; j++) {
                if (i < linhas - 1 || (i == linhas - 1 && j < qnt % 10)) {
                    System.out.print(q.peek());
                    if (j != 9)
                        System.out.print(" | ");
                    q.enfileira(q.desenfileira());
                }
            }
            System.out.println();
        }
    }

    static void imprimeCPilha(CPilha s) {
        int qnt = s.quantidade();
        CPilha s2 = new CPilha();
        int linhas;
        if (qnt % 10 == 0) linhas = qnt;
        else linhas = qnt/10 + 1;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < 10; j++) {
                if (i < linhas - 1 || (i == linhas - 1 && j < qnt % 10)) {
                    System.out.print(s.peek());
                    if (j != 9)
                        System.out.print(" | ");
                    s2.empilha(s.desempilha());
                }
            }
            System.out.println();
        }
        for (int i=0;i<qnt;i++)
            s.empilha(s2.desempilha());
    }
}