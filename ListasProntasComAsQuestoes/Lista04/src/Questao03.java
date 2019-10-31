import java.math.BigDecimal;
import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        CLista lista = new CLista();
        CPilha teste = new CPilha();
        CFila obj1 = new CFila();
        lista.insereComeco(teste);
        CCelula obj2 = new CCelula();
        lista.insereComeco(obj2);
        BigDecimal obj3 = new BigDecimal(50);
        lista.insereComeco(obj3);
        lista.insereComeco(10);
        lista.insereComeco((long) 200);
        lista.insereComeco(false);
        lista.insereComeco(true);
        lista.insereComeco(15.5);
        lista.insereComeco(100f);
        lista.insereComeco("Arthur");

        int soma = 0;
        for (int i =0;i<10;i++){
            soma += (int) lista.removeRetornaComeco();
        }
        /*
        class java.lang.String cannot be cast to class java.lang.Integer
        Nao pode passar de string para int por type cast.
         */
    }
}
