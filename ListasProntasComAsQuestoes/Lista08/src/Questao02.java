public class Questao02 {
    public static void main(String[] args) {
        CArvBin abp = new CArvBin();
        RandomQueue rq = new RandomQueue();
        for (int i = 0; i < 1000; i++) {
            rq.enqueue(i + 1);
        }

        while (!rq.isEmpty()) {
            int j = ((int) rq.dequeue());
            abp.put(j, j);
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
