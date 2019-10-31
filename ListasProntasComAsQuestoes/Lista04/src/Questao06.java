import java.util.Random;

public class Questao06 {
    public static void main(String[] args) {
        CLista lista = new CLista();
        CFila fila = new CFila();
        CPilha pilha = new CPilha();
        Random r = new Random();

        final int TAM =10;
        int soma = 0;

        for (int i =0 ; i < TAM ; i++) {
            lista.insereComeco(r.nextInt(100));
            fila.enfileira(r.nextInt(100));
            pilha.empilha(r.nextInt(100));
        }

        System.out.println("Soma lista = "+soma(lista));
        System.out.println("Soma fila = "+soma(fila));
        System.out.println("Soma pilha = "+soma(pilha));
    }

    public static int soma(CLista lista) {
        int soma =0;
        int qtd = lista.quantidade();
        for (int i=0;i<qtd;i++) {
            soma += (int) lista.retornaPrimeiro();
            lista.insereFim(lista.removeRetornaComeco());
        }
        return soma;
    }

    public static int soma(CPilha pilha) {
        int soma =0;
        CPilha pilha2 = new CPilha();
        int qtd = pilha.quantidade();
        for (int i=0;i<qtd;i++) {
            soma += (int) pilha.peek();
            pilha2.empilha(pilha.desempilha());
        }
        for (int i=0;i<qtd;i++)
            pilha.empilha(pilha2.desempilha());
        return soma;

    }

    public static int soma(CFila fila){
        int soma =0;
        int qtd = fila.quantidade();
        for (int i=0;i<qtd;i++) {
            soma += (int) fila.peek();
            fila.enfileira(fila.desenfileira());
        }
        return soma;

    }
}
