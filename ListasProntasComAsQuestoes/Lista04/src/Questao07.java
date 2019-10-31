import com.sun.javafx.iio.png.PNGImageLoader2;

import java.util.Random;

public class Questao07 {
    public static void main(String[] args) {
        CLista lista = new CLista();
        CFila fila = new CFila();
        CPilha pilha = new CPilha();
        Random r = new Random();

        final int TAM =10;
        int soma = 0;

        for (int i =0;i<TAM;i++) {
            lista.insereFim(r.nextInt());
            fila.enfileira(r.nextInt());
            pilha.empilha(r.nextInt());
        }

        lista.insereFim(-234);
        lista.insereFim(34);
        lista.insereFim(-3324);

        System.out.println("Soma lista = "+calcPositivos(lista));
        System.out.println("Soma fila = "+calcPositivos(fila));
        System.out.println("Soma pilha = "+calcPositivos(pilha));
    }
    public static int calcPositivos(CLista lista) {
        int cont = 0;
        int qnt = lista.quantidade();
        for (int i=0;i<qnt;i++) {
            if ((int) lista.retornaPrimeiro() >= 0)
                cont++;
            lista.insereFim(lista.removeRetornaComeco());
        }
        return cont;
    }
    public static int calcPositivos(CPilha pilha) {
        int cont = 0;
        CPilha pilha2 = new CPilha();
        int qnt = pilha.quantidade();
        for (int i=0;i<qnt;i++) {
            if ((int) pilha.peek() >= 0)
                cont++;
            pilha2.empilha(pilha.desempilha());
        }
        for (int i =0;i<qnt;i++)
            pilha.empilha(pilha2.desempilha());
        return cont;
    }
    public static int calcPositivos(CFila fila) {
        int cont = 0;
        int qnt = fila.quantidade();
        for (int i=0;i<qnt;i++) {
            if ((int) fila.peek() >= 0)
                cont++;
            fila.enfileira(fila.desenfileira());
        }
        return cont;
    }
}
