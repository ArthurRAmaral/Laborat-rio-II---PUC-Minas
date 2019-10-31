public class Questao07 {
    public static void main(String[] args) {
        CPilha pilha = new CPilha();
        for (int i = 0 ; i <20;i++){
            pilha.empilha(i+1);
        }
        limpaPilha(pilha);
    }
    public static void limpaPilha(CPilha pilha) {
        while (pilha.quantidade()!=0) {
            pilha.desempilha();
            if (pilha.quantidade() == 0)
                System.out.println("Pilha apagada.");
        }
    }
}
