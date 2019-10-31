public class Exercicio_6 {
    public static void main(String[] args) {
        for (double raio = 1.0;raio <= 10; raio += 0.1) {
            double circun = raio * raio * Math.PI;
            System.out.println("Circunferência de raio "+raio+" = "+circun);
        }
    }
}
