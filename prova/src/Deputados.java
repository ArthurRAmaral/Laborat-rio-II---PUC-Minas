import tools.CDicionario;
import tools.CLista;

import java.util.Scanner;

public class Deputados {
    private static Scanner leia = new Scanner(System.in);
    static CDicionario estados = new CDicionario();

    public static void main(String[] args) {
        addEstado(estados, "MG");
        addPartido(estados, "MG", "PART1");
        addDeputado(estados, "MG", "PART1", "MATHEUS");
        addDeputado(estados, "MG", "PART1", "GOA");
        addPartido(estados, "MG", "PART2");
        addDeputado(estados, "MG", "PART2", "DANIEL");
        addDeputado(estados, "MG", "PART2", "IAN");
        addEstado(estados, "SP");
        addPartido(estados, "SP", "PART3");
        addDeputado(estados, "SP", "PART3", "JOAO");
        addDeputado(estados, "SP", "PART3", "MARIA");
        addDeputado(estados, "SP", "PART3", "RICARDO");
        addPartido(estados, "SP", "PART4");
        addDeputado(estados, "SP", "PART4", "GABRIEL");
        addDeputado(estados, "SP", "PART4", "BIGODE");
        addEstado(estados, "RJ");
        addPartido(estados, "RJ", "PART5");
        addEstado(estados, "ES");

        System.out.println(estados);
    }

    public static void menu() {
        int opc;
        do {
            System.out.print("1 - Inserir estado");
            System.out.print("2 - Inserir partido");
            System.out.print("3 - Inserir deputado");
            System.out.print("4 - Pesquisar deputado");
            System.out.print("0 - Sair");
            opc = leia.nextInt();
            switch (opc) {
                case 1:
                    addEstado(estados);
                    break;
                case 2:
                    addPartido(estados);
                    break;
                case 3:
                    addDeputado(estados);
                    break;
                case 4:
                    pesquisaDeputado(estados);
                case 0:
                    break;
                default:
                    System.out.println("Inválido tente de novo.");
                    leia.nextLine();
                    break;
            }
        } while (opc != 0);
    }

    private static void pesquisaDeputado(CDicionario estados) {
        System.out.printf("Insra a sigla do estado do deputado: ");
        String est = leia.nextLine();
        Object estado = estados.recebeValor(est);
        if (estado != null) {
            System.out.printf("Insra a sigla do partido do deputado: ");
            String part = leia.nextLine();
            Object partido = ((CDicionario) estado).recebeValor(part);
            if (partido != null) {
                System.out.printf("Insra o nome do deputado: ");
                String dep = leia.nextLine();
                ((CLista) partido).insereComeco(dep);
            } else {
                System.out.println("Partido não cadastrado");
            }
        } else {
            System.out.println("Estado não cadastrado");
        }
    }

    private static void addDeputado(CDicionario estados) {
        System.out.printf("Insra a sigla do estado do deputado: ");
        String est = leia.nextLine();
        Object estado = estados.recebeValor(est);
        if (estado != null) {
            System.out.printf("Insra a sigla do partido do deputado: ");
            String part = leia.nextLine();
            Object partido = ((CDicionario) estado).recebeValor(part);
            if (partido != null) {
                System.out.printf("Insra o nome do deputado: ");
                String dep = leia.nextLine();
                ((CLista) partido).insereFim(dep);
            } else {
                System.out.println("Partido não cadastrado");
            }
        } else {
            System.out.println("Estado não cadastrado");
        }
    }

    private static void addPartido(CDicionario estados) {
        System.out.printf("Insra a sigla do estado do partido: ");
        String est = leia.nextLine();
        Object estado = estados.recebeValor(est);
        if (estado != null) {
            System.out.printf("Insra a sigla do partido: ");
            String part = leia.nextLine();
            ((CDicionario) estado).adiciona(part, new CLista());
        } else {
            System.out.println("Estado não cadastrado");
        }
    }

    private static void addEstado(CDicionario estados) {
        System.out.printf("Insra a sigla do estado: ");
        String est = leia.nextLine();
        Object aux = estados.recebeValor(est);
        if (est.length() == 2 && aux == null) {
            estados.adiciona(est, new CDicionario());
        } else {
            System.out.println("Sigla muito grande ou já existe, operacao cancelada");
        }
    }

    private static void addDeputado(CDicionario estados, String estadoSigla, String nomePartido, String nomeDeputado) {
        Object estado = estados.recebeValor(estadoSigla);
        if (estado != null) {
            Object partido = ((CDicionario) estado).recebeValor(nomePartido);
            if (partido != null) {
                ((CLista) partido).insereFim(nomeDeputado);
            } else {
                System.out.println("Partido não cadastrado");
            }
        } else {
            System.out.println("Estado não cadastrado");
        }
    }

    private static void addPartido(CDicionario estados, String estadoSigla, String partido) {
        Object estado = estados.recebeValor(estadoSigla);
        if (estado != null) {
            ((CDicionario) estado).adiciona(partido, new CLista());
        } else {
            System.out.println("Estado não cadastrado");
        }
    }

    private static void addEstado(CDicionario estados, String estadoSigla) {
        if (estadoSigla.length() == 2) {
            estados.adiciona(estadoSigla, new CDicionario());
        } else {
            System.out.println("Sigla muito grande, operacao cancelada");
        }
    }
}
