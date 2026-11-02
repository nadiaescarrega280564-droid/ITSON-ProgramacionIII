
package recursiva09;

import java.util.Arrays;

/**
 *
 * @author nadiaescarregagalvan
 */
public class RECURSIVA09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int pos1 = 5;
        long res1 = fibonacci(pos1);
        System.out.println("Fibonacci en la posición " + pos1 + " es: " + res1);

        // Segundo número
        int pos2 = 40;
        long res2 = fibonacci(pos2);
        System.out.println("Fibonacci en la posición " + pos2 + " es: " + res2);
 
        int a1 = 45,  b1 = 75;
        int resultadoMcd = mcd(a1, b1);
        System.out.println("El MCD de " + a1 + " y " + b1 + " es: " + resultadoMcd);
        
        int a2 = 47, b2 = 91;
        int mcd2 = mcd(a2, b2);
        System.out.println("El MCD de " + a2 + " y " + b2 + " es: " + resultadoMcd);
       
        Object[] letras = {'A', 'B','C', 'B', 'A', 'B', 'D'};
        Object buscar = 'C';
        int veces = count(letras, letras.length, buscar);
        System.out.println("La letra '" + buscar + "' aparece " + veces + " veces en el arreglo.");

        Object buscarE = 'E';
        int veces2 = count(letras, letras.length, buscarE);
        System.out.println("La letra '" + buscarE + "' aparece " + veces2 + " veces en el arreglo.");

        
        Object[] ListaNum = {1,2,3,3,2,3,1};
        Object buscar3 = 3;
        int veces3 = count(ListaNum, ListaNum.length, buscar3);
        System.out.println("El num 3  '" + buscar3 + "' aparece " + veces3 + " veces en el arreglo.");


        Object buscar1 = 1;
        int veces1 = count(ListaNum, ListaNum.length, buscar1);
        System.out.println("El num 3  '" + buscar1 + "' aparece " + veces1 + " veces en el arreglo.");

        Object[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Arreglo original: " + Arrays.toString(numeros));
        reverse(numeros, 0, numeros.length - 1);
        System.out.println("Arreglo invertido: " + Arrays.toString(numeros));
    }

    public static long fibonacci(int n) {
        // 1. Casos base: si es 0 o 1, devuelve el mismo número
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        
        // 2. Caso recursivo: suma de las dos posiciones anteriores
        return fibonacci(n - 1) + fibonacci(n - 2);
    } 
    public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mcd(b, a % b);
   
    }
    public static int count(Object datos[], int n, Object o) {
        if (n <= 0) {
            return 0;
        }
        
        int coincide = 0;
        if (datos[n - 1] != null && datos[n - 1].equals(o)) {
            coincide = 1;
        } else if (datos[n - 1] == null && o == null) {
            coincide = 1;
        }

        return coincide + count(datos, n - 1, o);
    }
    public static void reverse(Object datos[], int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }
        
        // Intercambio de elementos
        Object temp = datos[inicio];
        datos[inicio] = datos[fin];
        datos[fin] = temp;

        // Llamada recursiva avanzando el inicio y retrocediendo el fin
        reverse(datos, inicio + 1, fin - 1);
}} 