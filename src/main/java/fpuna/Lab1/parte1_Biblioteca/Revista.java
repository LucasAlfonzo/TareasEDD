package fpuna.Lab1.parte1_Biblioteca;

public class Revista extends ItemBiblioteca {
    //Atributos particulares de una Revista
    private int numEdicion;
    //TODO Implementa atributos adicionales segun parezca necesario para el problema

    
    public Revista(String titulo, String autor, int anioPublicacion, int numEdicion) {
        super(titulo, autor, anioPublicacion);
        this.numEdicion = numEdicion;
    }
    
    @Override
    public void prestar() {
        System.out.println("Prestado una revista: " + getTitulo());
    }
    
    @Override
    public void devolver() {
        System.out.println("Devuelto una revista: " + getTitulo());
    }
    
    @Override
    public String mostrarDetalles() {
        //DOIT Optimizar esta impresion reemplazando el concatenado de Strings basicos
        // return "Revista - Título: " + getTitulo() +
        //        ", Autor: " + getAutor() +
        //        ", Año de Publicación: " + getAnioPublicacion() +
        //        ", Número de Edición: " + numEdicion;
        return String.format("Revista - Titulo: %s\nAutor: %s\nAño de Publicacion: %s\nNumero de Edicion: %d",getTitulo(),getAutor(),getAnioPublicacion(),this.numEdicion);
    }
}