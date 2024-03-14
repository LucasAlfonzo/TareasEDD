package fpuna.Actividad2_1.Ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FrecuenciaPalabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce la ruta absoluta del archivo:");
        String rutaArchivo = scanner.nextLine();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo));
            ArrayList<String> palabras = new ArrayList<>();
            ArrayList<PalabraFrecuencia> frecuencias = new ArrayList<>();
            String linea;

            while ((linea = reader.readLine()) != null) {
                String[] palabrasLinea = linea.split("\\s+");
                Collections.addAll(palabras, palabrasLinea);
            }
            reader.close();

            for (String palabra : palabras) {
                boolean encontrada = false;
                for (PalabraFrecuencia pf : frecuencias) {
                    if (pf.palabra.equals(palabra)) {
                        pf.frecuencia++;
                        encontrada = true;
                        break;
                    }
                }
                if (!encontrada) {
                    frecuencias.add(new PalabraFrecuencia(palabra, 1));
                }
            }

            Collections.sort(frecuencias);

            for (int i = 0; i < 10 && i < frecuencias.size(); i++) {
                System.out.println(frecuencias.get(i).palabra + ": " + frecuencias.get(i).frecuencia);
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            scanner.close();
            
        }
    }
}
