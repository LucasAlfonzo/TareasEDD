package fpuna.Actividad2_1.Ejercicio1;
import java.util.Scanner;
public class Subconjunto {
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer texto:");
        String texto1 = scan.nextLine();
        System.out.println("Ingrese el segundo texto:");
        String texto2 = scan.nextLine();
        if(comparar(texto1,texto2)){
            System.out.println("El primer texto es un subconjunto del segundo texto");
        }else{
            System.out.println("El primer texto NO es un subconjunto del segundo texto");
        }
        scan.close();
    }
    private static boolean comparar(String texto1 , String texto2){
        boolean esSubconjunto = false;
        // int indice = 0;
        for( int i = 0 ; i < texto2.length() ; i++ ){
            int indice = 0;
            esSubconjunto = false;
            if( texto2.charAt(i) == texto1.charAt(indice) ){
                esSubconjunto = true;
                int aux = i;
                while( (indice) < texto1.length() ){
                    if( texto1.charAt(indice) != texto2.charAt(aux) ){
                        esSubconjunto = false;
                        break;
                    }
                    indice++;
                    aux++;
                }
            }
            if( indice == texto1.length() ){
                break;
            }
        }
        return esSubconjunto;
    }
}
