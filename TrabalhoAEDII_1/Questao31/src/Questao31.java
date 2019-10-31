import java.util.Scanner;

public class Questao31 {
    public static void main(String[] args) {
        CDicionario dicionario = new CDicionario();
        Scanner leia = new Scanner(System.in);
        int opc;

        dicionario = dicionarioAminoacidos();

        do {
            System.out.printf("Insira uma opção:\n" +
                    "1 - Procurar trinca;\n" +
                    "0 - Sair\n" +
                    "--> ");
            opc = leia.nextInt();
            switch (opc) {
                case 1:
                    System.out.printf("Insira a trinca: ");
                    leia.nextLine();
                    Object teinca = leia.nextLine();
                    System.out.printf("O aminoácido da trinca "+teinca+" é o(a) "+dicionario.recebeValor(teinca)+"\n");
                    break;
                case 0:
                    break;
                default:
                    System.out.printf("Opção inválida!\n");
                    break;
            }
        }while (opc!=0);
    }

    public static CDicionario dicionarioAminoacidos() {
        CDicionario dicionario = new CDicionario();

        {
            dicionario.adiciona("UUU", "Fenilalanina");
            dicionario.adiciona("UUC", "Fenilalanina");
            dicionario.adiciona("UUA", "Leucina");
            dicionario.adiciona("UUG", "Leucina");

            dicionario.adiciona("UCU", "Serina");
            dicionario.adiciona("UCC", "Serina");
            dicionario.adiciona("UCA", "Serina");
            dicionario.adiciona("UCG", "Serina");

            dicionario.adiciona("UAU", "Tirosina");
            dicionario.adiciona("UAC", "Tirosina");
            dicionario.adiciona("UAA", "Parada");
            dicionario.adiciona("UAG", "Parada");

            dicionario.adiciona("UGU", "Cisteína");
            dicionario.adiciona("UGC", "Cisteína");
            dicionario.adiciona("UGA", "Parada");
            dicionario.adiciona("UGG", "Triptofano");
        }

        {
            dicionario.adiciona("CUU", "Leucina");
            dicionario.adiciona("CUC", "Leucina");
            dicionario.adiciona("CUA", "Leucina");
            dicionario.adiciona("CUG", "Leucina");

            dicionario.adiciona("CCU", "Prolina");
            dicionario.adiciona("CCC", "Prolina");
            dicionario.adiciona("CCA", "Prolina");
            dicionario.adiciona("CCG", "Prolina");

            dicionario.adiciona("CAU", "Histidina");
            dicionario.adiciona("CAC", "Histidina");
            dicionario.adiciona("CAA", "Glutamina");
            dicionario.adiciona("CAG", "Glutamina");

            dicionario.adiciona("CGU", "Arginina");
            dicionario.adiciona("CGC", "Arginina");
            dicionario.adiciona("CGA", "Arginina");
            dicionario.adiciona("CGG", "Arginina");
        }

        {
            dicionario.adiciona("AUU", "Isoleucina");
            dicionario.adiciona("AUC", "Isoleucina");
            dicionario.adiciona("AUA", "Isoleucina");
            dicionario.adiciona("AUG", "Mationina");

            dicionario.adiciona("ACU", "Treonina");
            dicionario.adiciona("ACC", "Treonina");
            dicionario.adiciona("ACA", "Treonina");
            dicionario.adiciona("ACG", "Treonina");

            dicionario.adiciona("AAU", "Asparagina");
            dicionario.adiciona("AAC", "Asparagina");
            dicionario.adiciona("AAA", "Lisina");
            dicionario.adiciona("AAG", "Lisina");

            dicionario.adiciona("AGU", "Serina");
            dicionario.adiciona("AGC", "Serina");
            dicionario.adiciona("AGA", "Arginina");
            dicionario.adiciona("AGG", "Arginina");
        }

        {
            dicionario.adiciona("GUU", "Valina");
            dicionario.adiciona("GUC", "Valina");
            dicionario.adiciona("GUA", "Valina");
            dicionario.adiciona("GUG", "Valina");

            dicionario.adiciona("GCU", "Alanina");
            dicionario.adiciona("GCC", "Alanina");
            dicionario.adiciona("GCA", "Alanina");
            dicionario.adiciona("GCG", "Alanina");

            dicionario.adiciona("GAU", "Aspartato");
            dicionario.adiciona("GAC", "Aspartato");
            dicionario.adiciona("GAA", "Glutamato");
            dicionario.adiciona("GAG", "Glutamato");

            dicionario.adiciona("GGU", "Glicina");
            dicionario.adiciona("GGC", "Glicina");
            dicionario.adiciona("GGA", "Glicina");
            dicionario.adiciona("GGG", "Glicina");
        }

        return dicionario;
    }
}
