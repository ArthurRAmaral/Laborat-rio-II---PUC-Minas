import java.util.Random;

public class Questao08 {
    public static void main(String[] args) {
        CLista lista = new CLista();
        CFila fila = new CFila();
        CPilha pilha = new CPilha();
        Random r = new Random();

        final int TAM =10;
        int soma = 0;

        for (int i =0;i<TAM;i++) {
            lista.insereFim(r.nextInt(5));
            fila.enfileira(r.nextInt(5));
            pilha.empilha(r.nextInt(5));
        }

        System.out.println("Soma lista obj 4 = "+contadorItem(lista,4));
        System.out.println("Soma fila obg 3 = "+contadorItem(fila, 3));
        System.out.println("Soma pilha obj 2 = "+contadorItem(pilha,2));

        lista.imprime();
        fila.mostra();
        pilha.imprime();
    }

    public static int contadorItem(CLista lista, Object item) {
        int cont = 0;
        int qnt = lista.quantidade();
        for(int i=0;i<qnt;i++) {
            if (item.equals(lista.retornaPrimeiro())) {
                cont++;
            }
            lista.insereFim(lista.removeRetornaComeco());
        }
        return cont;
    }

    public static int contadorItem(CFila fila, Object item) {
        int cont = 0;
        int qnt = fila.quantidade();
        for(int i=0;i<qnt;i++) {
            if (item.equals(fila.peek())) {
                cont++;
            }
            fila.enfileira(fila.desenfileira());
        }
        return cont;
    }

    public static int contadorItem(CPilha pilha, Object item) {
        int cont = 0;
        CPilha pilha2 = new CPilha();
        int qnt = pilha.quantidade();
        for(int i=0;i<qnt;i++) {
            if (item.equals(pilha.peek())) {
                cont++;
            }
            pilha2.empilha(pilha.desempilha());
        }
        for(int i=0;i<qnt;i++) {
            pilha.empilha(pilha2.desempilha());
        }
        return cont;
    }
}
