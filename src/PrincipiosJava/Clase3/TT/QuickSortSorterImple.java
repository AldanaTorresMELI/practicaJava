package PrincipiosJava.Clase3.TT;

import java.util.Comparator;

public class QuickSortSorterImple<T> implements Sorter<T>{

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        int izq = 0;
        int der = arr.length -1;
        this.quickSort(arr, c, izq, der);
        this.print(arr);
    }

    public void quickSort(T[] arr, Comparator<T> c, int izq, int der) {
        T pivote = arr[izq];
        int i = izq;
        int j = der;
        T aux;
        while(i < j){
            while(c.compare(arr[i], pivote)<=0 && i < j) i++;
            while(c.compare(arr[j], pivote)>0) j--;
            if(i < j){
                aux = arr[i];
                arr[i] = arr[j];
                arr[j] = aux;
            }
        }

        arr[izq] = arr[j];
        arr[j] = pivote;

        if(izq < j-1)
            quickSort(arr, c, izq, j-1);
        if(j+1 < der)
            quickSort(arr, c, j+1, der);
    }

    public void print(T[] listarray){
        for (int i = 0; i < listarray.length; i++) {
            System.out.print(listarray[i] + (i < listarray.length - 1 ? "," : ""));
        }
    }
}
