package fpuna.Lab1.parte1_Biblioteca;
/**
 * Clase que representa un Item almacenado en la Biblioteca y
 * por lo tanto disponible para prestamos y devoluciones.
 *
 * Por ahora la Biblioteca solo admite Libros, Revistas y DVDs
 */
public abstract class ItemBiblioteca implements Prestable {
	/**
	 * Es static porque es una variable de clase (se comporta como una var. global)
	 * entre todos los objetos de la misma clase
	 */
	private static int cantidadItems;

    static {
        cantidadItems = 0;
    }

    private String titulo;
    private String autor;
    private int anioPublicacion;

    public ItemBiblioteca(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        cantidadItems++; //cada vez que se crea un nuevo item (libro, dvd o revista) se incrementa el contador
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

	public static int getCantidadItems() {
		return cantidadItems;
	}

	/**
	 * Operacion abstracta. Cada clase "hija" de ItemBiblioteca debe
	 * terminar de implementar la logica de como mostrar su detalle, convertido a cadena.
	 *
	 * Tambien cada clase hija debe implementar las operaciones de la interfaz "Prestable"
	 */
	public abstract String mostrarDetalles();
}