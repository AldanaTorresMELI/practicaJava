package PrincipiosJava.Clase3.TT;

import java.util.Comparator;

public interface Sorter<T> {
    void sort(T arr[], Comparator<T> c);
}
