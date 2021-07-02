package PrincipiosJava.Clase3.TM.Ejercicio1;

public class SortUtil {
    public static<T> void ordenar(IPrecedable<T>[] arr){
        int i,j;
        IPrecedable<T> aux;
        for(i = 0; i < arr.length -1; i++){
            for(j = 0; j < arr.length -i -1; j++){
                if(arr[j+1].precedeA((T) arr[j]) == true){
                    aux = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }
}
