package dataEstructures;

/**
 * @author Arthur Rocha Amaral
 * @version 1.0 2019/10/31
 * @(#)ListAED.java
 */

public class ListAED<T> {
    private Cell<T> fist;
    private Cell<T> last;
    private int size;

    public ListAED() {
        fist = new Cell<T>();
        last = fist;
    }

    public boolean vazia() {
        return fist == last;
    }

    public boolean addAtEnd(T itemVal) {
        last.next = new Cell<T>(itemVal);
        last = last.next;
        size++;
        return true;
    }

    public boolean addAtBeginning(T itemVal) {
        fist.next = new Cell<T>(itemVal, fist.next);
        if (fist.next.next == null)
            last = fist.next;
        size++;
        return true;
    }

    public boolean contains(T itemVal) {
        boolean found = false;
        Cell aux = fist.next;
        while (aux != null && !found) {
            found = aux.item.equals(itemVal);
            aux = aux.next;
        }
        return found;
    }

    public T returnFist() {
        if (!vazia())
            return fist.next.item;
        else
            return null;
    }

    public T returnLast() {
        if (!vazia())
            return last.item;
        else
            return null;
    }

    public T returnPos(int position) {


        if ((position >= 1) && (position <= size) && (!vazia())) {
            int i = 0;
            Cell<T> aux = fist;
            while (i < position) {
                aux = aux.next;
                i++;
            }
            return aux.item;
        } else return null;
    }

    public T removeAndRetornBeginning() {
        if (!vazia()) {
            fist = fist.next;
            size--;
            return fist.item;
        }
        return null;
    }

    public T removeAndRetornEnd() {
        if (!vazia()) {
            Cell<T> aux = fist;
            while (aux.next != last)
                aux = aux.next;
            Cell<T> aux2 = aux.next;
            last = aux;
            last.next = null;
            size--;
            return aux2.item;
        }
        return null;
    }

    public boolean removeBeginning() {
        if (!vazia()) {
            fist = fist.next;
            size--;
            return true;
        } else return false;
    }

    public boolean removeEnd() {
        if (!vazia()) {
            Cell<T> aux = fist;
            while (aux.next != last)
                aux = aux.next;
            last = aux;
            last.next = null;
            size--;
            return true;
        } else return false;
    }

    public boolean remove(T itemVal) {
        if (!vazia()) {
            Cell aux = fist;
            boolean found = false;
            while (aux.next != null && !found) {
                found = aux.next.item.equals(itemVal);
                if (!found)
                    aux = aux.next;
            }
            if (found) {

                aux.next = aux.next.next;
                if (aux.next == null)
                    last = aux;
                size--;
                return true;
            }
        }
        return false;
    }

    public boolean removeIndex(int index) {

        if ((index >= 1) && (index <= size) && (!vazia())) {
            int i = 0;
            Cell<T> aux = fist;
            while (i < index - 1) {
                aux = aux.next;
                i++;
            }
            aux.next = aux.next.next;
            if (aux.next == null)
                last = aux;
            size--;
            return true;
        }
        return false;
    }

    public T getIndex(int index) {

        if ((index >= 1) && (index <= size) && (!vazia())) {
            int i = 0;
            Cell<T> aux = fist;
            while (i < index - 1) {
                aux = aux.next;
                i++;
            }
            Cell<T> aux2 = aux.next;
            aux.next = aux.next.next;
            if (aux.next == null)
                last = aux;
            size--;
            return aux2.item;
        }
        return null;
    }

    public int getSize() {
        return size;
    }

    public Object[] toVet() {
        if (!vazia()) {
            int i = 0;
            Cell aux = fist.next;
            while (aux != null) {
                aux = aux.next;
                i++;
            }
            Object[] ret = new Object[i];
            aux = fist.next;
            i = 0;
            while (aux != null) {
                ret[i] = aux.item;
                aux = aux.next;
                i++;
            }
            return ret;
        } else return new Object[0];

    }

    public void clear() {
        fist = new Cell<T>();
        last = fist;
        size = 0;
    }

    @Override
    public String toString() {
        String string = "[";
        Cell aux = fist.next;
        while (aux != null) {
            string += (aux.item.toString());
            aux = aux.next;
            if (aux != null)
                string += ", ";
        }
        string += "]";
        return string;
    }
}