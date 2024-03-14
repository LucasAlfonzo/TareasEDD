package fpuna.Lab1.parte1_Biblioteca;

import java.util.ArrayList;

public class Usuario {
	private int id;
    private String nombre;

	//Un ArrayList es un array dinamico que viene con el Lenguaje Java
	private ArrayList<ItemBiblioteca> elementosPrestados;

	public int getId() {
		return id;
	}

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<ItemBiblioteca> getElementosPrestados() {
		return elementosPrestados;
	}

	public Usuario(int id, String nombre) {
		this.id = id;
        this.nombre = nombre;
        elementosPrestados = new ArrayList<>();
    }
    
    public void agregarElementoPrestado(ItemBiblioteca elemento) {
        elementosPrestados.add(elemento);
    }

	public String generarListaElementosPrestados() {
		StringBuilder sb = new StringBuilder("");
		sb.append("El usuario ").append(getNombre()).append(" con ID: ");
		if (getElementosPrestados().size() > 0) {
			sb.append(getId()).append(" ha prestado estos items:\n");

			//TODO: Implementa métodos para mostrar detalles de elementos prestados por el usuario
			sb.append("AQUI FALTA COMPLETAR EL CODIGO PENDIENTE");

		} else {
			sb.append(getId()).append(" no ha prestado ningun item por el momento.\n");
		}
		return sb.toString();
	}
}