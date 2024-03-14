package fpuna.Lab1.Prueba;

import java.math.BigInteger;
import java.util.ArrayList;
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


        Random rand = new Random();
        ArrayList<TablaTiempo> tiempos = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Introducir numero Inicial: ");
        int nInicial = scan.nextInt();
        System.out.println("Introducir numero final: ");
        int nFinal = scan.nextInt();
        System.out.println("Introducir incremento: ");
        int incremento = scan.nextInt();

        int tamanhos[] = generarTamanhos(nInicial,nFinal,incremento);

        for( int i = nInicial ; i < tamanhos.length ; i++ ){
            //Rellenar Vector

        }
    }

    public static int[] generarTamanhos(int nInicial , int nFinal , int incrementos){
        
        for( int i = nInicial ; i <= nFinal ; i = i+incrementos ){

        }

        return null;
    }
}

class TablaTiempo{
    public long n;
    public long tiempoInsertion;
    public long tiempoBurbuja;

}
