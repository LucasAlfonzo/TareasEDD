package fpuna.Lab2.Prueba;

// import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test {
    
    public static long factorial(long num){
        if( num == 0 ){
            return 1;
        }else{
            return factorial(num-1)*num;
        }
    }

    public static long factorialIterativo( long num ){
        long resultado = 1;
        if( num > 0 ){
            while( num > 1 ){
                resultado *= num;
                num --;
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // int num = scan.nextInt();
        // Long tiempoA = System.currentTimeMillis();
        // for( long i = 1 ; i < 100000 ; i++ ){
        //     // System.out.println(factorial(i));
        //     factorial(i);
        //     System.out.println("hace: " + i);
        //     // System.out.println(factorialIterativo(i));
        // }
        // Long tiempoB = System.currentTimeMillis();
        // System.out.printf("\tFactorial recursivo: %d milisegundos\n", (tiempoB - tiempoA));
        // System.out.printf("\tFactorial iterativo: %d milisegundos\n", (tiempoB - tiempoA));
        // scan.close();
        // System.out.printf("El numero es: %f",factorial(num));


        
        TablaTiempo tiempos = new TablaTiempo();
        Scanner scan = new Scanner(System.in);
        System.out.println("Introducir numero Inicial: ");
        int nInicial = scan.nextInt();
        System.out.println("Introducir numero final: ");
        int nFinal = scan.nextInt();
        System.out.println("Introducir incremento: ");
        int incremento = scan.nextInt();

        int tamanhos[] = generarTamanhos(nInicial,nFinal,incremento);
        scan.close();
        for( int i = 0 ; i < tamanhos.length ; i++ ){
            int arrayA [] = rellenarArrayNumerosAleatorios( tamanhos[i] );
            int arrayB [] = arrayA.clone();

            Long tiempoA = System.currentTimeMillis();
            insertionSort(arrayA);
            Long tiempoB = System.currentTimeMillis();
            Long tiempoC = System.currentTimeMillis();
            bubbleSort(arrayB);
            Long tiempoD= System.currentTimeMillis();
            System.out.println("El comparativo entre los métodos de Ordenamiento entre Bubble Sort e Insertion Sort");
            System.out.printf("Ordenamiento Insertion Sort: %d\n", tiempoB - tiempoA );
            System.out.printf("Ordenamiento Bubble Sort: %d\n", tiempoD - tiempoC );
            // tiempos.addTiempo(new Tiempo(tamanhos[i],tiempoB-tiempoA , tiempoD - tiempoC));
            tiempos.addTiempo(
                new Tiempo(
                    tamanhos[i],
                    tiempoB-tiempoA, 
                    tiempoD-tiempoC
                )
            );

        }
    }

    private static void insertionSort(int[] array) {
        
        for( int i = 1 ; i < array.length ; i++ ){
            int temp = array[i];
            int j = i;
            for( ; j > 0 && temp < array[j-1] ; j-- ){
                array[j] = array[j-1];
            }
            array[j] = temp;
        }
    }

    private static void bubbleSort(int[] myArray) {
        int temp = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 1; j < (myArray.length - i); j++) {
                if (myArray[j - 1] > myArray[j]) {
                    temp = myArray[j - 1];
                    myArray[j - 1] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        }

    private static int[] rellenarArrayNumerosAleatorios( int numero ) {
        Random rand = new Random();
        int numeros [] = new int[numero];
        for ( int i = 0 ; i < numero ; i++ ){
            numeros[i] = rand.nextInt();
        }
        return numeros;
    }

    public static int[] generarTamanhos(int nInicial , int nFinal , int incrementos){
        int cantidadElementos = (nFinal - nInicial)/incrementos+1;
        int tamanhos [] = new int[cantidadElementos]; 
        int valorActual = nInicial;
        for( int i = 0 ; i < cantidadElementos ; i ++ ){
            tamanhos[i] = valorActual;
            valorActual += incrementos;
        }

        return tamanhos;
    }
}

class TablaTiempo{
    public List<Tiempo> tabla = new ArrayList<>();

    public void addTiempo(Tiempo t){
        this.tabla.add(t);
    }
    public List<Tiempo> getTablaTiempo(){
        return this.tabla;
    }
}

class Tiempo {
    public long n;
    public long tiempoInsertion;
    public long tiempoBurbuja;
    public Tiempo( long n , long tiempoInsertion , long tiempoBurbuja ){
        this.n = n;
        this.tiempoInsertion = tiempoInsertion;
        this.tiempoBurbuja = tiempoBurbuja;
    }
}
