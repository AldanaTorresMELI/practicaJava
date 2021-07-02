package PrincipiosJava.Clase3.TT;

import java.util.Comparator;

public class HeapSortSorterImple<T> implements Sorter<T> {

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        int aux = arr.length;
        // Build heap (rearrange array)
        for (int i = aux / 2 - 1; i >= 0; i--)
            heapify(arr, aux, i, c);

        // One by one extract an element from heap
        for (int i = aux - 1; i > 0; i--) {
            // Move current root to end
            T temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0, c);
        }

        this.print(arr);
    }


    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(T arr[], int n, int i, Comparator<T> c) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && c.compare(arr[l],arr[largest]) > 0 )
            largest = l;

        // If right child is larger than largest so far
        if (r < n && c.compare(arr[r],arr[largest]) > 0)
            largest = r;

        // If largest is not root
        if (largest != i) {
            T swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest, c);
        }
    }

    /* A utility function to print array of size n */

    public void print(T[] listarray){
        for (int i = 0; i < listarray.length; i++) {
            System.out.print(listarray[i] + (i < listarray.length - 1 ? "," : ""));
        }
    }
}

