import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o valor da altura: ");
		int altura = ler.nextInt();
		System.out.print("Digite o valor do comprimento: ");
		int comprimento = ler.nextInt();
		int area = Math.multiplyExact(altura, comprimento);
		int perimetro = (2*altura + 2*comprimento);
		System.out.print("A área e o perimetro do retangulo inserido são respectivamente: " + area + " e " + perimetro);
	}

}
