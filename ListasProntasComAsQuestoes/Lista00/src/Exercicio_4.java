
public class Exercicio_4 {

    public static void main(String[] args) {
        double circun;
        for (int raio = 1; raio <=50; raio++) {
            if (raio%2!=0) {
                circun = raio*raio*Math.PI;
                System.out.println("A circunferência de raio " + raio +" = " + circun + ";");
            }
        }
    }

}
