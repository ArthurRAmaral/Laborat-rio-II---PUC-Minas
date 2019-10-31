public class CCelula {
    private CCelula next;
    private Object item;
     public CCelula() {
         item = null;
         next = null;
     }
     public CCelula(Object itemValor) {
         item = itemValor;
         next = null;
     }
    public CCelula(Object itemValor, CCelula proxCelula) {
        item = itemValor;
        next = proxCelula;

    }

    public CCelula getNext() {
        return next;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public void setNext(CCelula next) {
        this.next = next;
    }
}
