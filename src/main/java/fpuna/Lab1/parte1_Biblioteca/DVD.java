package fpuna.Lab1.parte1_Biblioteca;

public class DVD extends ItemBiblioteca {
    //Atributos particulares de un DVD
    private int duracionMinutos;
    //DOIT Implementa atributos adicionales segun parezca necesario para el problema
    private String nombrePelicula;
    
    public DVD(String titulo, String autor, int anioPublicacion, int duracionMinutos,String _nombrePelicula) {
        super(titulo, autor, anioPublicacion);
        this.duracionMinutos = duracionMinutos;
        this.nombrePelicula = _nombrePelicula;
    }
    
    @Override
    public void prestar() {
        System.out.println("Prestado un DVD: " + getTitulo());
    }
    
    @Override
    public void devolver() {
        System.out.println("Devuelto un DVD: " + getTitulo());
    }
    
    @Override
    public String mostrarDetalles() {
        //DOIT Optimizar esta impresion reemplazando el concatenado de Strings basicos
        return String.format("DVD - Título: %s\n Autor: %s\n Año de Publicación: %s\n Duración en min.: %s\nNombre de la Pelicula: %s", getTitulo(), getAutor(), getAnioPublicacion(), duracionMinutos,this.nombrePelicula);
    }
}