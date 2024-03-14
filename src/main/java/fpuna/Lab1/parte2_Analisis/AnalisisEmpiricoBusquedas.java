package fpuna.Lab1.parte2_Analisis;

import java.util.ArrayList;
/**
 * Clase para el Ejercicio 2 (Parte 2 de la clase Laboratorio)
 * Una vez terminado la Parte 1, aguarde instrucciones siguientes
 *
 */
import java.util.Scanner;

public class AnalisisEmpiricoBusquedas {

    private static int[] arrayNumeros;
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese tamaño de array N: ");
        int N = s.nextInt();

        // String numerosCadena = s.nextLine();
        // String numeros[] = numerosCadena.split(" ");
        // ArrayList<Integer> numerosInt = new ArrayList<Integer>();
        // System.out.println(numerosInt);
        // for ( int i = 0 ; i < numerosCadena.length() ; i++ ){
        //     numerosInt.add( Integer.parseInt(numeros[i]));
        // }
        // for( int j = 0 ; j < numerosInt.size() ; j++ ){
        //     int N = numerosInt.get(j);
        
        arrayNumeros = generarArrayAleatorio(N);

        Long tiempoA = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            int valorABuscar = (int) (Math.random() * Integer.MAX_VALUE);
            int posicion = busquedaSecuencial(valorABuscar);
        }
        Long tiempoB = System.currentTimeMillis();

        ordenarArray();

        Long tiempoC = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            int valorABuscar = (int) (Math.random() * Integer.MAX_VALUE);
            int posicion = busquedaBinaria(valorABuscar);
        }
        Long tiempoD = System.currentTimeMillis();

        System.out.printf("\nEl comparativo de busquedas de %d numeros sobre un array de numeros aleatorios arroja:\n", N);
        System.out.printf("\tBusqueda Secuencial: %d milisegundos\n", (tiempoB - tiempoA));
        System.out.printf("\tBusqueda Binaria: %d milisegundos\n", (tiempoD - tiempoC));
        // }
        //DOIT: Parte 2 - Pruebe en diversos valores de N y anote el siguiente cuadro:
        /**
         * N     Busq. Secuencial    Busq. Binaria
         *  5000     110 ms               10 ms
         * 10000     198 ms               15 ms
         * 15000     410 ms               24 ms
         * 20000     747 ms               33 ms
         * 25000     1153 ms              40 ms
         * ... etc para grandes valores de N
         */

        //TODO: como se puede adaptar este codigo para que los diversos valores de N se ingresen de una sola vez?
        //Ej: 5000 10000 15000 20000 50000 100000 etc y luego por cada elemento de la lista se haga el calculo de prueba?

        s.close();
    }
    
    public static int busquedaSecuencial(int valorBuscado) {
        int resp = -1;
        for (int i=0; i<arrayNumeros.length; i++) {
            if (arrayNumeros[i] == valorBuscado) {
                resp = i;
                break;
            }
        }
        return resp;
    }

    public static int busquedaBinaria(int valorBuscado) {
        int resp = -1;
        int low = 0;
        int high = arrayNumeros.length-1;

        while (low <= high) {
            int mid = low  + ((high - low) / 2);
            if (arrayNumeros[mid] < valorBuscado) {
                low = mid + 1;
            } else if (arrayNumeros[mid] > valorBuscado) {
                high = mid - 1;
            } else if (arrayNumeros[mid] == valorBuscado) {
                resp = mid;
                break;
            }
        }
        return resp;
    }

    public static void ordenarArray() {
        int n = arrayNumeros.length;
        for (int j = 1; j < n; j++) {
            int key = arrayNumeros[j];
            int i = j-1;
            while ( (i > -1) && ( arrayNumeros[i] > key ) ) {
                arrayNumeros[i+1] = arrayNumeros[i];
                i--;
            }
            arrayNumeros[i+1] = key;
        }
    }

    private static int[] generarArrayAleatorio(int N) {
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = (int) (Math.random() * Integer.MAX_VALUE);
        }
        return array;
    }

}