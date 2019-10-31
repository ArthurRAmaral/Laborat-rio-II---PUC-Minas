import org.omg.CORBA.PUBLIC_MEMBER;

public class Questao10 {
    public static void main(String[] args) {
        CFila fila = new CFila();
        for (int i = 1;i<=10;i++)
            fila.enfileira(i);
        System.out.println("fila.quantidade() = " + fila.quantidade());
        fila.furaFila(11);
        System.out.println("fila.quantidade() = " + fila.quantidade());
        CFila.imprimeFila(fila);
    }
    /*
    public void furaFila(Object valorItem) {
        if (!vazia()) {
            CCelula celula = new CCelula(valorItem, frente.prox);
            frente.prox = celula;
            qtde++;
        } else enfileira(valorItem);
    }
    */
}
