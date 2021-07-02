package PrincipiosJava.Clase1.TT;

public class StringUtil {
    // Retorna una cadena compuesta por n caracteres c
   // public static String replicate(char c,int n)
    //{
        //Implementación
   // }

    // Retorna una cadena de longitud n, compuesta por s
    // y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    public static String lpad(String s,int n,char c)
    {
        String completeString = s;
        while(completeString.length()<n){
            completeString= c + completeString;
        }
        return completeString;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static String[] toStringArray(int arr[])
    {
        String[] strArray = new String[arr.length];

        for(int i = 0; i < arr.length; i++){
            strArray[i] = String.valueOf(arr[i]);
        }
        lNormalize(strArray,'0');
        return  strArray;
    }

    // Retorna un int[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static int[] toIntArray(String arr[])
    {
        int[] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = Integer.parseInt(arr[i]);
        }
        return newArr;
    }


    // Retorna la longitud del elemento con mayor cantidad
    // de caracteres del array arr
    public static int maxLength(String arr[])
    {
        int aux = 0;
        for(int i=0; i<arr.length; i++){
            int compare = arr[i].length();
            if(compare>=aux){
                aux = compare;
            }
        }
        return aux;
    }

    // Completa los elemento del arr agregando caracteres c
    // a la izquierda, dejando a todos con la longitud del mayor
    public static void lNormalize(String arr[],char c)
    {
        int max = maxLength(arr);
        for(int i=0; i<arr.length; i++){
            arr[i] = lpad(arr[i],max,c);
        }
    }
}
