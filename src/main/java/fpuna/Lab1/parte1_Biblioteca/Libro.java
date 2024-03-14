package fpuna.Lab1.parte1_Biblioteca;

public class Libro extends ItemBiblioteca {
    //Atributos particulares de un Libro
    private int numPaginas;
    //DOIT Implementa atributos adicionales segun parezca necesario para el problema
    private String tipoDeTapa;


    
    public Libro(String titulo, String autor, int anioPublicacion, int numPaginas,String tipoDeTapa) {
        //DOIT Averigue que hace la funcion "super"
        super(titulo, autor, anioPublicacion);
        this.numPaginas = numPaginas;
        this.tipoDeTapa = tipoDeTapa;
    }
    
    @Override
    public void prestar() {
        System.out.println("Prestado un libro: " + getTitulo());
    }
    
    @Override
    public void devolver() {
        System.out.println("Devuelto un libro: " + getTitulo());
    }
    
    @Override
    public String mostrarDetalles() {
        //DOIT Optimizar esta impresion reemplazando el concatenado de Strings basicos
        // return "Libro - Título: " + getTitulo() +
        //        ", Autor: " + getAutor() +
        //        ", Año de Publicación: " + getAnioPublicacion() +
        //        ", Número de Páginas: " + numPaginas;
        return String.format("Libro - Titulo: %s\nAutor: %s\nAño de publicacion: %d\nNumero de Paginas: %d\nTipo de Tapa: %s",getTitulo(),getAutor(),getAnioPublicacion(),this.numPaginas,this.tipoDeTapa);

        
    }
}