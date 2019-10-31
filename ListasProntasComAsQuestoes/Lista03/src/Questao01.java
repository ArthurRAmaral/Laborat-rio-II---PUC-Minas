public class Questao01 {
    public static void main(String[] args) {
        CPilha pilha = new CPilha();
        for (int i = 0; i< 10;i++) {
            pilha.empilha(i+1);
        }
        for (int i = 0; i< 10;i++) {
            System.out.println((i+1)+"º Intem "+pilha.desempilha());
        }
    }
}
