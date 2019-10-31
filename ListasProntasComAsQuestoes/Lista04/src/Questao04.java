import java.awt.font.FontRenderContext;
import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        final int QNT =5;
        CLista listaAluno = new CLista();
        Scanner leia = new Scanner(System.in);
        for (int i =0;i<QNT;i++) {
            Aluno aluno = new Aluno();
            System.out.printf("Insira o nome do %dº aluno: ",i+1);
            aluno.setNome(leia.nextLine());
            System.out.printf("Insira a matricula do %dº aluno: ",i+1);
            aluno.setMatricula(Integer.parseInt(leia.nextLine()));
            listaAluno.insereComeco(aluno);
        }
    }
}