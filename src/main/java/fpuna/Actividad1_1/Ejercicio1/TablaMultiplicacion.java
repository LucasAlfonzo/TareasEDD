package fpuna.Actividad1_1.Ejercicio1;
import java.util.Scanner;
public class TablaMultiplicacion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introducir un numero de un solo digito: ");
        int numero = scan.nextInt();
        if( numero < 0 || numero > 9 ){
            System.out.println("El numero debe de ser solamente de un digito. Ingrese nuevamente un numero de solo un digito");
        }else{
            System.out.println("La tabla de multiplicacion del número " + numero + " es:");
            for( int i = 1 ; i <= 10 ; i++ ){
                System.out.printf("%d * %d \t= \t%d\n" , numero , i , numero * i );
            }
        }
        scan.close();
    }
}
