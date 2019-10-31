import java.util.Random;
import java.util.Scanner;

public class Questao09 {
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

            if(tipo!=0) {
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
                        CLista lista = criaCLista(opc, n);
                        lista.imprime();
                        break;
                    case 2:
                        CFila fila = criaCFila(opc, n);
                        fila.mostra();
                        break;
                    case 3:
                        CPilha pilha = criaCPilha(opc, n);
                        pilha.imprime();
                        break;
                    default:
                        break;
                }
            }
        } while (tipo!=0);
    }

    static CLista criaCLista(int opcao, int n) {
        Random r = new Random();
        CLista lista = new CLista();
        switch (opcao) {
            case 1:
                for (int i=0;i<n;i++) {
                    lista.insereFim(i);
                }
                return lista;
            case 2:
                for (int i=n;i>0;i--) {
                    lista.insereFim(i-1);
                }
                return lista;
            case 3:
                for (int i=0;i<n;i++) {
                    lista.insereFim(r.nextInt(1000));
                }
                return lista;
            default:
                return null;
        }
    }

    static CFila criaCFila(int opcao, int n) {
        Random r = new Random();
        CFila fila = new CFila();
        switch (opcao) {
            case 1:
                for (int i=0;i<n;i++) {
                    fila.enfileira(i);
                }
                return fila;
            case 2:
                for (int i=n;i>0;i--) {
                    fila.enfileira(i-1);
                }
                return fila;
            case 3:
                for (int i=0;i<n;i++) {
                    fila.enfileira(r.nextInt(1000));
                }
                return fila;
            default:
                return null;
        }
    }

    static CPilha criaCPilha(int opcao, int n) {
        Random r = new Random();
        CPilha pilha = new CPilha();
        switch (opcao) {
            case 1:
                for (int i=0;i<n;i++) {
                    pilha.empilha(i);
                }
                return pilha;
            case 2:
                for (int i=n;i>0;i--) {
                    pilha.empilha(i-1);
                }
                return pilha;
            case 3:
                for (int i=0;i<n;i++) {
                    pilha.empilha(r.nextInt(1000));
                }
                return pilha;
            default:
                return null;
        }
    }
}
