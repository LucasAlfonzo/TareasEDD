package fpuna.Actividad1_1.Ejercicio2;
public class Conversiones {

    public static double division( int a , int b ){
        return ((double) a / (double) b);
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        double c = division( a , b );
        System.out.printf("La division de %d entre %d es %.2f\n",a,b,c);
    }
}
