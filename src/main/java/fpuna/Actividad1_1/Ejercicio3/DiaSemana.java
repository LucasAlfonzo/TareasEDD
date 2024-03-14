package fpuna.Actividad1_1.Ejercicio3;
import java.util.Scanner;
public class DiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia;
        do {
            System.out.println("Introducir un numero del 1 al 7:");
            dia = scanner.nextInt();
            switch (dia) {
                case 1:
                    System.out.println("El dia de la semana correspondiente es: Lunes");
                    break;
                case 2:
                    System.out.println("El dia de la semana correspondiente es: Martes");
                    break;
                case 3:
                    System.out.println("El dia de la semana correspondiente es: Miercoles");
                    break;
                case 4:
                    System.out.println("El dia de la semana correspondiente es: Jueves");
                    break;
                case 5:
                    System.out.println("El dia de la semana correspondiente es: Viernes");
                    break;
                case 6:
                    System.out.println("El dia de la semana correspondiente es: Sabado");
                    break;
                case 7:
                    System.out.println("El dia de la semana correspondiente es: Domingo");
                    break;
                default:
                    System.out.println("El numero introducido no esta dentro del rango indicado. Por favor vuelva a introducir un numero del 1 al 7:");
            }
        } while (dia < 1 || dia > 7);
        scanner.close();
    }
}
