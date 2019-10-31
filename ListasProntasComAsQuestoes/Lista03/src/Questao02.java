public class Questao02 {
    public static void main(String[] args) {
        CPilha pilha = new CPilha();
        CPilha aux = new CPilha();
        for (int i = 0; i< 10;i++) {
            pilha.empilha(i+1);
        }
        System.out.println();
        for (int i = 0; i< 10;i++) {
            aux.empilha(pilha.peek());
            pilha.desempilha();
        }
        for (int i = 0; i< 10;i++) {
            pilha.empilha(aux.peek());
            System.out.println(aux.desempilha());
        }
    }
}
