import java.util.Scanner;

public class Exercicio_21 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.printf("1 - Versão 1;\n2 - Versão 2;\n--> ");
        switch (leia.nextInt()) {
            case 1:
                versao1();
                break;
            case 2:
                versao2();
                break;
            default:
                break;
        }
    }
    public static void versao1() {
        Scanner leia = new Scanner(System.in);
        System.out.print("A variação dos lados dos triagulos será de 1 à n.\nn: ");
        int n = leia.nextInt();
        int certo = 0;
        int errado = 0;
        for (int a = 1; a<=n; a++)
            for (int b = 1; b<=n; b++)
                for (int c = 1; c<=n; c++) {
                    if (a < b + c & b < a + c && c < b + a && a > Math.abs(b - c) && b > Math.abs(a - c) && c > Math.abs(a - b)) {
                        System.out.printf("( %d, %d, %d ) forma um triangulo\n",a,b,c);
                        certo++;
                    }
                    else {
                        System.out.printf("( %d, %d, %d ) nao forma um triangulo\n",a,b,c);
                        errado++;
                    }
                }
        System.out.println("\nForam achados "+certo+" combinações possíveis para triangulos\n e "+errado+" combinações que não formão triangulos.");
    }
    public static void versao2() {
        Scanner leia = new Scanner(System.in);
        System.out.print("A variação dos lados dos triagulos será de 1 à n.\nn: ");
        int n = leia.nextInt();
        int certo = 0;
        int errado = 0;
        for (int a = 1; a<=n; a++)
            for (int b = 1; b<=n; b++)
                for (int c = 1; c<=n; c++) {
                    if (a < b + c & b < a + c && c < b + a && a > Math.abs(b - c) && b > Math.abs(a - c) && c > Math.abs(a - b))
                        certo++;
                    else
                        errado++;
                }
        System.out.println("\nForam achados "+certo+" combinações possíveis para triangulos\n e "+errado+" combinações que não formão triangulos.");

    }
}

/* Questão 21:
        O tempo de processamento varia pois é uma combinação,
        ou seja ele tentará n^3 combinações e cada valor a mais
        isso será feito, por exemplo:
        n = 10, combinações = 1.000;
        n = 50, combinações = 125.000;
        n = 100, combinações = 1.000.000;
        n = 500, combinações = 125.000.000;
        n = 1000, combinações = 1.000.000.000;
 */
