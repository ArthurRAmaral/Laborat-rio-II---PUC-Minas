import java.util.Scanner;

public class Exercicio_3 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int raio;
		double circunferencia;
		for (raio = 10; raio <= 100; raio ++)
		{
			circunferencia = raio * Math.PI * raio;
			System.out.println("A circunferência de raio " + raio +" = " + circunferencia + ";");
		}
		
	}
}
