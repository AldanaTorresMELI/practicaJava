package PrincipiosJava.Clase3.TT;

import java.util.Comparator;

public class BubbleSortSorterImple<T> implements Sorter<T> {

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        int aux = arr.length;
        for (int i = 0; i < aux-1; i++)
            for (int j = 0; j < aux-i-1; j++)
                if (c.compare(arr[j], arr[j+1])> 0)
                {
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        print(arr);
    }

    public void print(T[] listarray){
        for (int i = 0; i < listarray.length; i++) {
            System.out.print(listarray[i] + (i < listarray.length - 1 ? "," : ""));
        }
    }
}
