public class Questao09 {
    public static void main(String[] args) {
        CFila fila = new CFila();
        for (int i = 1;i<=10;i++)
            fila.enfileira(i);
        System.out.println("fila.quantidade() = " + fila.quantidade());
        fila.limpa();
        /*
        public void limpa() {
            frente = tras;
            qtde = 0;
        }
        */
        System.out.println("fila.quantidade() = " + fila.quantidade());
    }
}
