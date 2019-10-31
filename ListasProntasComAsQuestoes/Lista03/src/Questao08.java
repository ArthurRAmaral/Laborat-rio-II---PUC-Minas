public class Questao08 {
    public static void main(String[] args) {
        CPilha pilha = new CPilha();
        for (int i = 1;i<=10;i++)
            pilha.empilha(i);
        System.out.println("pilha.quantidade() = " + pilha.quantidade());
        pilha.limpa();
        /*
        public void limpa() {
            topo = null;
            qtde = 0;
        }
        */
        System.out.println("pilha.quantidade() = " + pilha.quantidade());
    }
}