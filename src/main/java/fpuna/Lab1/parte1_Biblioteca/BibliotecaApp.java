package fpuna.Lab1.parte1_Biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {
    public static void main(String[] args) {
        // Crea objetos Libro, Revista, DVD
        //TODO
        Libro   libro1   = new Libro  ("Estructura de Datos en Java", "Mark Allen Weiss", 2002, 474,"Blanda");
        Revista revista1 = new Revista("Redalyc. Colección de revistas científicas", "Varios", 2024, 22);
        DVD     dvd1     = new DVD    ("El mundo de los 0 y 1s, documental", "Discovery Channel", 2020, 95,"Nombre 1");
        // DOIT: Crea mas objetos Libro, Revista y DVD de manera similar
        Libro   libro2   = new Libro  ("Solo humo", "Juan José Millas", 2023, 256,"Dura");
        Revista revista2 = new Revista("Sociedad Cientifica del Paraguay", "Varios", 2023, 21);
        DVD     dvd2     = new DVD    ("El mundo de los 0 y 1s, documental", "Discovery Channel", 2020, 95,"Nombre 2");

        
        // Crea lista de elementos y agrega objetos creados
        ArrayList<ItemBiblioteca> elementos = new ArrayList<>();
        elementos.add(libro1);
        elementos.add(revista1);
        elementos.add(dvd1);
        // DOIT: Agrega más elementos a la lista
        elementos.add(libro2);
        elementos.add(revista2);
        elementos.add(dvd2);
        
        // Muestra detalles de elementos usando polimorfismo
        // Segun el tipo de dato realmente almacenado en cada posicion
        // del ArrayList, se ejecuta su operación correcta equivalente
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Impresión de varios tipos gracias al polimorfismo y enlace dinamico:");
        System.out.println("--------------------------------------------------------------------");
        for (ItemBiblioteca elemento : elementos) {
            System.out.println("\t" + elemento.mostrarDetalles());
        }
        
        // Crea usuarios y realiza préstamos
        Usuario usuario1 = new Usuario(4552625, "Alejandro Barrios");
        usuario1.agregarElementoPrestado(libro1);
        usuario1.agregarElementoPrestado(revista1);

        Usuario usuario2 = new Usuario(7034568, "Elizabeth Alfonso");
        usuario2.agregarElementoPrestado(dvd1);

        Usuario usuario3 = new Usuario(2856325, "Alcides Riveros");
        // DOIT: Agrega algunos usuarios mas y realiza más préstamos
        Usuario usuario4 = new Usuario(2856326, "Lucas Peña");
        Usuario usuario5 = new Usuario(2856327, "Ariel Alfonzo");
        Usuario usuario6 = new Usuario(2856328, "Juan Perez");

        // Muestra detalles de elementos prestados por usuarios
        System.out.println("\n--------------------------------------------");
        System.out.println("Detalle de elementos prestados por usuarios:");
        System.out.println("--------------------------------------------");
        System.out.println(usuario1.generarListaElementosPrestados());
        System.out.println(usuario2.generarListaElementosPrestados());
        System.out.println(usuario3.generarListaElementosPrestados());
    }
}