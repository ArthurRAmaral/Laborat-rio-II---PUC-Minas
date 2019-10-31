public class Questao11 {
    public static void main(String[] args) {
        CFila fila = new CFila();
        for (int i = 1;i<=10;i++)
            fila.enfileira(i);
        System.out.println("fila.quantidade() = " + fila.quantidade());
        furaFila(fila,15);

        System.out.println("fila.quantidade() = " + fila.quantidade());
        CFila.imprimeFila(fila);
    }

    public static void furaFila(CFila f, Object valorItem) {
        int qtde = f.quantidade();
        f.enfileira(valorItem);
        for (int i = 0; i<qtde;i++)
            f.enfileira(f.desenfileira());
    }
}
