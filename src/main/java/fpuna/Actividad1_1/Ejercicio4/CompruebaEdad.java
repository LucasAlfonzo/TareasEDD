package fpuna.Actividad1_1.Ejercicio4;
import java.util.Scanner;
public class CompruebaEdad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su edad:");
        int edad = scan.nextInt();
        if( edad == 37 ){
            System.out.println("Felicidades.. cumples la condicion de tener 37 años");
        }else{
            System.out.println(":( NO cumples la condicion de tener 37 años");
        }        
        scan.close();
    }
}
