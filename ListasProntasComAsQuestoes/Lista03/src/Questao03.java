public class Questao03 {
    public static void main(String[] args) {
        CPilha pilha = new CPilha();
        CFila fila = new CFila();
        for (int i = 0; i < 10; i++) {
            pilha.empilha(i + 1);
        }
        for (int i = 0 ; i<10;i++){
            fila.enfileira(pilha.desempilha());
        }
        for (int i = 0 ; i<10;i++){
            pilha.empilha(fila.desenfileira());
        }
    }
}
