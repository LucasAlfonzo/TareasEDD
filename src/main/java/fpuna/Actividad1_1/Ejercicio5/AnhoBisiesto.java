package fpuna.Actividad1_1.Ejercicio5;
import java.util.Scanner;

public class AnhoBisiesto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introducir un año: ");
        int num = scan.nextInt();
        if( esBisiesto(num) ){
            System.out.println("El año es Bisiesto");
        }else{
            System.out.println("El año no es Bisiesto");
        }
        scan.close();
    }
    public static boolean esBisiesto(int anio){
        if( ( anio % 4 == 0 ) && ( anio % 100 != 0 ) || ( anio % 400 == 0 ) ){
            return true;
        }else{
            return false;
        }
    }
}
