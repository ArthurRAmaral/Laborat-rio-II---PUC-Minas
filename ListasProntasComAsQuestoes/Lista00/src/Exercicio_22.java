import java.util.Scanner;

public class Exercicio_22 {
    public static void main(String[] args) {
        int QUANTIDADE_DE_PESSOAS = 3;
        int NOME = 0;
        int ANO = 1;
        int ALTURA = 2;
        Object[][] bd = new Object[QUANTIDADE_DE_PESSOAS][3];

        for (int i = 0; i < QUANTIDADE_DE_PESSOAS; i++) {
            for (int j = 0; j < 3; j++) {
                Scanner leia = new Scanner(System.in);
                if (j == NOME) {
                    System.out.printf("Insira o nome da %dº pessoa: ", i + 1);
                    bd[i][j] = leia.nextLine();
                }
                if (j == ANO) {
                    System.out.printf("Insira o ano de nascimento da %dº pessoa: ",i+1);
                    bd[i][j] = leia.nextInt();
                }
                if (j == ALTURA) {
                    System.out.printf("Insira a altura da %dº pessoa: ",i+1);
                    bd[i][j] = leia.nextFloat();
                }
            }
        }

        float somaCima = 0;
        int c = 0;
        float somaBaixo = 0;
        int b = 0;
        int abaixoAno = 0;
        int iDaPessoaMaisNova = 0;
        for (int i = 0; i < QUANTIDADE_DE_PESSOAS; i++) {
            if ((int) bd[i][ANO] < 2005)
                abaixoAno++;
            if ((int) bd[i][ANO] >= 1985) {
                somaCima += (float) bd[i][ALTURA];
                c++;
            }
            else {
                somaBaixo += (float) bd[i][ALTURA];
                b++;
            }
            if ((int) bd[iDaPessoaMaisNova][ANO] < (int) bd[i][ANO])
                iDaPessoaMaisNova = i;
        }

        float mediaBaixo = somaBaixo/b;
        float mediaCima = somaCima/c;

        System.out.printf("%d pessoas nasceram antes de 2005;\n" +
                "A media das alturas antes de 1985 = %.2f;\n" +
                "A media das alturas depois de 1985 = %.2f;\n" +
                "A pessoa mais nova é a %s que tem %d anos." +
                "",abaixoAno,mediaBaixo,mediaCima,bd[iDaPessoaMaisNova][NOME].toString(),(2019 - (int) bd[iDaPessoaMaisNova][ANO]));
    }
}
