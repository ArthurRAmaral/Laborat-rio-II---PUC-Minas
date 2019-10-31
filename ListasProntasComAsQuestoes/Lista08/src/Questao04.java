public class Questao04 {
    public static void main(String[] args) {
        CArvBin abp = new CArvBin();
        for (int i = 0; i < 1000; i++) {
            abp.put(i + 1, "");
        }

        long mili = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 100; j++) {
                abp.get(i + 1);
            }
        }


        mili = System.currentTimeMillis() - mili;
        System.out.println("Tempo da pesquisa: " + mili + " ms");
    }
}
