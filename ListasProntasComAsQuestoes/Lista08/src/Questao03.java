public class Questao03 {
    public static void main(String[] args) {
        int[] abp = new int[1000];;
        RandomQueue rq = new RandomQueue();
        for (int i = 0; i < 1000; i++) {
            rq.enqueue(i + 1);
        }

        for (int i = 0; i < 1000; i++) {
            int j = ((int) rq.dequeue());
            abp[i] = j;
        }

        long mili = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 100; j++) {
                getIVet(abp, i+1);
            }
        }


        mili = System.currentTimeMillis() - mili;
        System.out.println("Tempo da pesquisa: " + mili + " ms");
    }

    static int getIVet(int[] vet, int num) {
        boolean achou = false;
        int i = 0;
        while (!achou && i < vet.length) {
            if (vet[i] == num)
                achou = true;
            else
                i++;
        }
        if (achou) return vet[i];
        else return 0;
    }
}
