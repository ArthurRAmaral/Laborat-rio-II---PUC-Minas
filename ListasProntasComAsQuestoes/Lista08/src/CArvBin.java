public class CArvBin {

    private CNo raiz = null;

    public Object get(int k) {
        return get(raiz, k);
    }

    private Object get(CNo no, int k) {
        if (no == null)
            return null;
        if (k < no.chave)
            return get(no.esq, k);
        else if (k > no.chave)
            return get(no.dir, k);
        else
            return no.valor;
    }

    public void put(int k, Object v) {
        raiz = put(raiz, k, v);
    }

    private CNo put(CNo no, int k, Object v) {
        if (no == null)
            return new CNo(k, v);
        if (k < no.chave)
            no.esq = put(no.esq, k, v);
        else if (k > no.chave)
            no.dir = put(no.dir, k, v);
        else
            no.valor = v;
        return no;
    }

    private void emOrdem(CNo no) {
        if (no != null) {
            emOrdem(no.esq);
            System.out.println(no.chave + " " + no.valor);
            emOrdem(no.dir);
        }
    }

    private void preOrdem(CNo no) {
        if (no != null) {
            System.out.println(no.chave + " " + no.valor);
            preOrdem(no.esq);
            preOrdem(no.dir);
        }
    }

    private void posOrdem(CNo no) {
        if (no != null) {
            posOrdem(no.esq);
            posOrdem(no.dir);
            System.out.println(no.chave + " " + no.valor);
        }
    }

    public void imprimeABP(int op) {
        if (op == 1)
            preOrdem(raiz);
        else if (op == 2)
            emOrdem(raiz);
        else if (op == 3)
            posOrdem(raiz);
        else
            System.out.println("Opção de impressão inválida.");
    }

    public boolean achou(int k) {
        return achouRec(raiz, k);
    }

    private boolean achouRec(CNo no, int k) {
        if (no != null && no.chave != k) {
            if (k < no.chave)
                return achouRec(no.esq, k);
            else
                return achouRec(no.dir, k);
        }

        return no != null ? true : false;
    }

    class CNo {
        private int chave;
        private Object valor;
        private CNo esq, dir;

        public CNo() {
            valor = esq = dir = null;
        }

        public CNo(int k) {
            chave = k;
            valor = esq = dir = null;
        }

        public CNo(int k, Object v) {
            chave = k;
            valor = v;
            esq = null;
            dir = null;
        }

        public CNo(int k, Object v, CNo e, CNo d) {
            chave = k;
            valor = v;
            esq = e;
            dir = d;
        }
    }

}