import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner inserir = new Scanner(System.in);
		int base, altura, area, sumArea = 0, perimetro, i = 0;
		do 
		{
			i++;
			System.out.print("Digite o valor da altura do " + i +"� ret�ngulo: ");

			altura = inserir.nextInt();
			System.out.print("Digite o valor do comprimento do " + i + "�: ");
			base = inserir.nextInt();
			area = Math.multiplyExact(altura, base);
			perimetro = (2*altura + 2*base);
			if (base>=0&&altura>=0) {
				System.out.println("A �rea e o per�metro do " + i + "� ret�ngulo inserido s�o respectivamente: " + area + " e " + perimetro);
				sumArea = sumArea + area;
			}
		}
		while(base>=0&&altura>=0);
		if (i == 1) {
			System.out.print("Nenhum ret�ngulo inserido");
		}
	}

}
