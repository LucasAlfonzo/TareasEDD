package fpuna.Actividad2_1.Ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> sumas = new ArrayList<>();

        for (String nombreArchivo : args) {
            try {
                sumas.add(calcularTestsum(nombreArchivo));
            } catch (IOException e) {
                System.out.println("Error al leer el archivo " + nombreArchivo + ": " + e.getMessage());
            }
        }

        NumberFormat formatter = NumberFormat.getNumberInstance(Locale.US);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i] + ": " + formatter.format(sumas.get(i)));
        }
    }

    private static int calcularTestsum(String nombreArchivo) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo));
        int testsum = 0;
        int c;

        while ((c = reader.read()) != -1) {
            testsum += c;
        }
        reader.close();
        return testsum;
    }
}