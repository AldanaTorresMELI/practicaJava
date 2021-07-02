package PrincipiosJava.Clase1.TT;

import java.util.ArrayList;

import static PrincipiosJava.Clase1.TT.StringUtil.*;

public class RadixSort {

    public static void radixSort(int []arr){
        String[] strArray = toStringArray(arr);

        ArrayList<String>[] arrays= new ArrayList[10];
        for(int i=0; i<10; i++){
            arrays[i]= new ArrayList<>();
        }

        for(int j = maxLength(strArray); j>0; j--) {
            for (String s : strArray) {
                arrays[Character.getNumericValue(s.charAt(j - 1))].add(s);
            }

            //Reordeno strArray
            String[] newArr = new String[strArray.length];
            int aux = 0;
            for (ArrayList<String> strings : arrays) {
                for (String string : strings) {
                    newArr[aux] = string;
                    aux++;
                }
                strings.clear();
            }
            strArray = newArr;
        }
        //Lo convierto a array de enteros
        int[] arrInt = toIntArray(strArray);
System.arraycopy(arrInt,0,arr,0,arrInt.length);
    }


    public static void main(String[] args) {
        int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
        radixSort(arr);

        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+(i<arr.length-1?",":""));
        }
    }

}
