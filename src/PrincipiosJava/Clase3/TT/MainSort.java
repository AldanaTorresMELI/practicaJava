package PrincipiosJava.Clase3.TT;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

public class MainSort {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(59);
//        list.add(4);
//        list.add(5);
//        list.add(10);
//
//        QuickSortSorterImple s = new QuickSortSorterImple();
//        HeapSortSorterImple ob = new HeapSortSorterImple();
//          Comparator<Integer> c = (a,b) -> a-b;
//        Object[] listarray = list.toArray();
//        //s.sort(listarray, c );
//        ob.sort(listarray, c);
//        for (int i = 0; i < listarray.length; i++) {
//            System.out.print(listarray[i] + (i < listarray.length - 1 ? "," : ""));
//        }
        FactoryTest();
//timeAndSort();

    }

    public static void timeAndSort() {
        Integer array[] = createBigArray(100000);
        Time timer = new Time(System.currentTimeMillis());
        timer.start();
        System.out.println("Starting properties sort");
        Sorter sorter = (Sorter) MyFactory.getInstance();
        Comparator<Integer> c = (a,b) -> a-b;
        sorter.sort(array, c);
        timer.stop();
    }

    public static Integer[] createBigArray(int length) {
        Integer intArray[] = new Integer[length];
        int min = 1;
        int max = 100000;
        System.out.println("Random value in int from " + min + " to " + max + ":");
        for (int i = 0; i < length; i++) {
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            intArray[i] = random_int;
        }
        return intArray;
    }

    public static void FactoryTest() {
        String stringArray[] = {
                "hola",
                "aaa",
                "ff",
                "ss"
        };
        Integer arrayInt[] = {34,3,3,1,2,78,90,6};
        Sorter sorter = (Sorter) MyFactory.getInstance();
        Comparator<Integer> c = (a,b) -> a-b;
        Comparator<String> compString = (a,b) -> a.compareTo(b);
        sorter.sort(stringArray, compString);
        sorter.sort(arrayInt, c);
    }

    public static void bubbleSortMain() {
        String stringArray[] = {
                "hola",
                "aaa",
                "ff",
                "ss"
        };
        Integer arrayInt[] = {34,3,3,1,2,78,90,6};
        BubbleSortSorterImple<Integer> intSort = new BubbleSortSorterImple();
        BubbleSortSorterImple<String> stringSort = new BubbleSortSorterImple<>();
        Comparator<Integer> c = (a,b) -> a-b;
        Comparator<String> compString = (a,b) -> a.compareTo(b);
        intSort.sort(arrayInt, c);
        stringSort.sort(stringArray, compString);
    }

    public static void heapSortMain() {
        String stringArray[] = {
                "hola",
                "aaa",
                "ff",
                "ss"
        };
        Integer arrayInt[] = {34,3,3,1,2,78,90,6};
        HeapSortSorterImple<String> stringSort = new HeapSortSorterImple<>();
        HeapSortSorterImple<Integer> intSort = new HeapSortSorterImple<>();
        Comparator<Integer> c = (a,b) -> a-b;
        Comparator<String> compString = (a,b) -> a.compareTo(b);
        stringSort.sort(stringArray, compString);
        intSort.sort(arrayInt, c);
    }

    public static void quickSortMain() {
        String stringArray[] = {
                "hola",
                "aaa",
                "abc",
                "xax"
        };
        Integer arrayInt[] = {34,3,3,1,2,78,90,6};
        QuickSortSorterImple<Integer> sortInt = new QuickSortSorterImple<>();
        QuickSortSorterImple<String> sort = new QuickSortSorterImple<>();
        Comparator<Integer> c = (a,b) -> a-b;
        Comparator<String> compString = (a,b) -> a.compareTo(b);
        sort.sort(stringArray, compString);
        sortInt.sort(arrayInt, c);
    }


}
