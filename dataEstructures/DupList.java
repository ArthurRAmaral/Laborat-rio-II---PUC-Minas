package dataEstructures;

import java.io.Serializable;

/**
 * @author Arthur Rocha Amaral
 * @version 1.0 2019/10/31
 * @(#)DupList.java
 */

public class DupList<T> implements Serializable {
    private DupCell<T> fist;
    private DupCell<T> last;
    private int size;

    public DupList() {
        fist = new DupCell<T>();
        last = fist;
    }

    public boolean empty() {
        return fist == last;
    }

    public boolean addAtEnd(T valorItem) {
        last.next = new DupCell<T>(valorItem, last, null);
        last = last.next;
        size++;
        return true;
    }

    public boolean addAtBeginning(T valorItem) {
        if (fist == last) {
            last.next = new DupCell<T>(valorItem, last, null);
            last = last.next;
        } else {
            fist.next = new DupCell<T>(valorItem, fist, fist.next);
            fist.next.next.prev = fist.next;
        }
        size++;
        return true;
    }

    public boolean removeAtBeginning() {
        if (fist != last) {
            fist = fist.next;
            fist.prev = null;
            size--;
            return true;
        } else return false;
    }

    public boolean contais(T elemento) {
        boolean found = false;
        for (DupCell<T> aux = fist.next; aux != null && !found; aux = aux.next)
            found = aux.item.equals(elemento);
        return found;
    }

    public T returnFist() {
        if (fist != last)
            return fist.next.item;
        return null;
    }

    public T returnIndex(int posicao) {
        if ((posicao >= 1) && (posicao <= size) && (fist != last)) {
            DupCell<T> aux = fist.next;
            for (int i = 1; i < posicao; i++, aux = aux.next) ;
            if (aux != null)
                return aux.item;
        }
        return null;
    }

    public T returnLast() {
        if (!empty())
            return last.item;
        return null;
    }

    public boolean removeAtEnd() {
        if (!empty()) {
            last = last.prev;
            last.next = null;
            size--;
            return true;
        } else return false;
    }

    public boolean remove(T valorItem) {
        if (!empty()) {
            DupCell aux = fist.next;
            boolean found = false;
            while (aux != null && !found) {
                found = aux.item.equals(valorItem);
                if (!found)
                    aux = aux.next;
            }
            if (found) {
                DupCell anterior = aux.prev;
                DupCell proximo = aux.next;
                anterior.next = proximo;
                if (proximo != null)
                    proximo.prev = anterior;
                else
                    last = anterior;
                size--;
                return true;
            } else return false;
        } else return false;
    }

    public T removeAndReturnAtBeginning() {
        if (fist != last) {
            DupCell<T> aux = fist.next;
            fist = fist.next;
            fist.prev = null;
            size--;
            return aux.item;
        }
        return null;
    }

    public T removeAndReturnAtEnd() {
        if (fist != last) {
            DupCell<T> aux = last;
            last = last.prev;
            last.next = null;
            size--;
            return aux.item;
        }
        return null;
    }

    public int getSize() {
        return size;
    }

    //Questao12 - Lista AED
    public boolean removePos(int n) {
        if (!empty() && n > 0 && n < getSize()) {
            DupCell<T> aux = fist;
            for (int i = 1; i < n && aux.next != null; i++, aux = aux.next) {
            }
            if (aux.next != null) {
                if (aux.next.next != null) {
                    aux.next = aux.next.next;
                    aux.next.prev = aux;
                    size--;
                    return true;
                } else {
                    aux.next = null;
                    size--;
                    return true;
                }
            } else return false;
        } else return false;
    }

    //Questao12 - Lista AED
    public T returnPos(int n) {
        if (!empty() && n > 0 && n < getSize()) {
            DupCell<T> aux = fist;
            for (int i = 1; i < n && aux.next != null; i++, aux = aux.next) {
            }
            if (aux.next != null) {
                T returnAux = aux.next.item;
                if (aux.next.next != null) {
                    aux.next = aux.next.next;
                    aux.next.prev = aux;
                    size--;
                } else {
                    aux.next = null;
                    size--;
                }
                return returnAux;
            } else return null;
        } else return null;
    }

    //Questao04 - Lista AED
    public static DupList concatenateDL(DupList L1, DupList L2) {
        DupList cop = new DupList();
        DupCell aux = L1.fist.next;
        while (aux != null) {
            cop.addAtEnd(aux.item);
            aux = aux.next;
        }
        aux = L2.fist.next;
        while (aux != null) {
            cop.addAtEnd(aux.item);
            aux = aux.next;
        }
        return cop;
    }

    //Questao08 - Lista AED
    public int fistIndexOf(T elemento) {
        if (!empty()) {
            DupCell<T> aux = fist.next;
            int i = 1;
            while (aux != null) {
                if (aux.item.equals(elemento)) {
                    return i;
                } else {
                    i++;
                    aux = aux.next;
                }
            }
            return -1;
        } else return -1;
    }
    //Questao09 - Lista AED

    public int lastIndexOf(T elemento) {
        int j = -1;
        if (!empty()) {
            DupCell aux = fist.next;
            int i = 1;
            while (aux != null) {
                if (aux.item.equals(elemento)) {
                    j = i;
                }
                i++;
                aux = aux.next;
            }
            return j;
        } else return j;
    }
    //Questao17 - Lista AED

    public DupList(T[] VET) {
        fist = new DupCell();
        last = fist;
        for (int i = 0; i < VET.length; i++) {
            addAtBeginning(VET[i]);
        }
    }
    //Questao20 - ListaDup

    public void clear() {
        fist = new DupCell();
        last = fist;
        size = 0;
    }

    @Override
    public String toString() {
        String string = "[";
        DupCell aux = fist.next;
        while (aux != null) {
            string += aux.item;
            aux = aux.next;
            if (aux != null) string += ", ";
        }
        string += "]";
        return string;
    }
}