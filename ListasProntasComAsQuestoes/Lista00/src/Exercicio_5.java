import java.util.Scanner;;
public class Exercicio_5 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int x,y,p;
		double circun;
		
		System.out.print("Insira o incio: ");
		x = ler.nextInt();
		System.out.print("Insira o fim: ");
		y = ler.nextInt();
		System.out.print("Insira o incrementeo: ");
		p = ler.nextInt();
		
		for(int i=x;i<=y&&p!=0;i=i+p)
		{
			circun = i*i*Math.PI;
			System.out.println("A circunferência de raio " + i +" = " + circun + ";");
		}
	}

}
