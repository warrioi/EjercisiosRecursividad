public class Ejercisios {
    public static int factorial(int n){
        int factorial;

        if (n == 1){
            //caso base
            factorial = n;

        }else {
            factorial = n * factorial(n-1);
        }
        return factorial;
    }
    /*

    Maximo comun divisor (mcd), algoritmo
    a = 412
    b = 184

     */
    public static int mcd(int a,int b){
        int mcd;
        if (a == b){
            mcd = b;
        }else {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
            mcd=mcd(a , b );
        }
        return mcd;
    }
    /*
   Suma de los elementos de un vector con recursividad
   Vector{2,4,6}
   Suma = 2 + {4,6}
   Suma = 4 + {6}
   Suma = 6 (Caso base)
    */
    public static int sumaVector(int[] vector,int indice){
        int suma ;
        if (indice == vector.length -1){
            suma = vector[indice];
        }else {
            suma = vector[indice]+sumaVector(vector ,indice +1);
        }
        return suma;
    }
    /*Invertir una cadena de texto "Recursividad" = "dadivisruceR"
     */
    private static String ivertirCadena(String cadena , int indice){
        String inversa;
        if (indice == 0) {//caso base
            inversa = String.valueOf(cadena.charAt(indice));
        }else {//llamada recursiva
            inversa = String.valueOf(cadena.charAt(indice)) + ivertirCadena(cadena,indice-1);
        }
        return inversa;
    }
    /*
    Metodo auxiliar quellama al metodo recursivo
     */
    public static String ivertirCadena(String cadena){
        return ivertirCadena(cadena,cadena.length()-1);
    }
    /*
     Metodorecursivo para comprar dos enteros elemento por elemento
     vector 1={5 , 6 , 2}
     vector 2={2 , 9 , 2}
     diferen = 3 - 3 + 0 = 0
    */
    private static int compararVectores(int[] vector1 , int[] vector2 , int indice){
        int sumaDiferencias;
        if (indice == vector1.length - 1){
            sumaDiferencias = Math.abs(vector1[indice] - vector2[indice]);
        }else {
            sumaDiferencias = Math.abs(vector1[indice] - vector2[indice]) + compararVectores(vector1, vector2, indice +1);
        }
        return sumaDiferencias;
    }
    /*
    metodo auxiliiar
    */
    public static boolean compararVectores(int[] vector1 , int[] vector2 ){
        return compararVectores( vector1, vector2,0) == 0;
    }
    /*
    Metodo recursivo para calcular el maximo valor de un vector
    */

    private static int maximoVector(int[] vector, int indice, int maximo) {

        if(indice == vector.length - 1){ //caso base
            if (vector[indice] > maximo) {
                maximo = vector[indice];
            }
        }else{ //llamada a la recursividad
            if (vector[indice] > maximo) {
                maximo = vector[indice];
            }

            maximo = maximoVector(vector, indice + 1, maximo);
        }



        return maximo;
    }

    /*
    Metodo auxiliar que llama al metodo recursivo
    */
    public static int maximoVector(int[] vector) {
        return maximoVector(vector, 0, 0);
    }
}
