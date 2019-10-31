public class Questao01 {
    public static void main(String[] args) {
        CArvBin arvore = new CArvBin();
        arvore.put(1, "Primeira" );
        arvore.put(5, "Segunda" );
        arvore.put(7, "Terceira" );
        arvore.put(8, "Quarta" );
        arvore.put(4, "Quinta" );
        arvore.put(3, "Sexta" );
        arvore.put(6, "Setima" );
        arvore.put(2, "Oitava" );

        arvore.imprimeABP(1);
        System.out.println("----------------");
        arvore.imprimeABP(2);
        System.out.println("----------------");
        arvore.imprimeABP(3);
    }
}
