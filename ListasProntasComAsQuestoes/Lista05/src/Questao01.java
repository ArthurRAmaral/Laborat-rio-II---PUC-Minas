import java.util.Random;
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        final int QNT_ALUNOS = 10;
        final int QNT_ATIVIDADES = 3;
        Scanner leia = new Scanner(System.in);
        Random r = new Random();
        CLista listaAtividades = new CLista();
        for (int i = 0; i < QNT_ATIVIDADES; i++) {
            System.out.printf("%dº Atividade:\n", i + 1);
            CLista notas = new CLista();
            for (int j = 0; j < QNT_ALUNOS; j++) {
                System.out.printf("Insira a nota do %dº aluno: ", j + 1);
                //notas.insereFim(leia.nextDouble());
                notas.insereFim(r.nextInt(10));
            }
            listaAtividades.insereFim(notas);
        }
        int opc;
        do {
            System.out.print("Escolha  o modo de impressão:\n" +
                    "1 - Letra A - por atividade\n" +
                    "2 - Letra B - por aluno\n" +
                    "3 - Letra C - media de cada atividade\n" +
                    "4 - Questao 02 - aluno x na atividade y\n" +
                    "0 - Sair\n" +
                    "--> ");
            opc = leia.nextInt();

            switch (opc) {

                /*
                    A
                */
                case 1:
                    for (int i = 0; i < QNT_ATIVIDADES; i++) {
                        System.out.println("\n" + (i + 1) + "º atividade:");
                        CLista aux = (CLista) listaAtividades.retornaPrimeiro();
                        listaAtividades.insereFim(listaAtividades.removeRetornaComeco());
                        for (int j = 0; j < QNT_ALUNOS; j++) {
                            System.out.printf("nota aluno %d: %d\n", j + 1, aux.retornaPrimeiro());
                            aux.insereFim(aux.removeRetornaComeco());
                        }
                    }
                    break;

                /*
                    B
                */
                case 2:
                    for (int i = 0; i < QNT_ALUNOS; i++) {
                        System.out.printf("%dº Aluno:\n", i + 1);
                        for (int j = 0; j < QNT_ATIVIDADES; j++) {
                            System.out.println("Atividade " + (j + 1) + ": " + ((CLista) listaAtividades.retornaIndice(j + 1)).retornaIndice(i + 1));
                        }
                        System.out.println();
                    }
                    break;
                /*
                     C - Médias
                */
                case 3:
                    int soma = 0;
                    double media;
                    for (int i = 0; i < QNT_ATIVIDADES; i++) {
                        for (int j = 0; j < QNT_ALUNOS; j++) {
                            soma += (int) ((CLista) listaAtividades.retornaIndice(i + 1)).retornaIndice(j + 1);
                        }
                        media = soma / QNT_ALUNOS;
                        soma = 0;
                        System.out.printf("Média atividade %d: %.2f\n", i + 1, media);
                    }
                    break;

                /*
                    Questao 2 - Pesquisa de aluno e atividade
                */
                case 4:
                    Questao02.procedimento(listaAtividades);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opição inválida tente de outra");
                    break;
            }
        } while (opc != 0);
    }
}
