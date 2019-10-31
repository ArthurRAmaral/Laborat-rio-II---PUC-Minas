import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int x1,y1,p1;
        int x2,y2,p2;

        System.out.print("Insira o incio da base: ");
        x1 = ler.nextInt();
        System.out.print("Insira o fim da base: ");
        y1 = ler.nextInt();
        System.out.print("Insira o incrementeo da base: ");
        p1 = ler.nextInt();
        System.out.print("Insira o incio da altura: ");
        x2 = ler.nextInt();
        System.out.print("Insira o fim da altura: ");
        y2 = ler.nextInt();
        System.out.print("Insira o incrementeo da altura: ");
        p2 = ler.nextInt();

        for(int i=x1;i<=y1&&p1!=0&&p2!=0;i+=p1)
            for(int j=x2;j<=y2;j+=p2)
                System.out.println("Perímetro do retângulo de base "+i+" e altura "+j+" = "+(2*i+2*j));
    }
}
