public class Exercicio_10 {
    public static void main(String[] args) {
        for (int x=1;x<=5;x++)
            for (int z = 3; z <= 6; z++)
                for (int h = 2 ; h <= 4; h++) {
                    double y = 3 / (4 * x) + 5 * z - 7 * h;
                    System.out.println("f(x,z,h) = f(" + x + "," + z + "," + h + ") = 3/4x + 5z - 7h = " + y);
                }
    }
}
