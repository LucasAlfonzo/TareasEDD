package fpuna.Actividad2_2.Ejercicio5;

import java.util.ArrayList;

public class Medicamento {
    String nombre;
    String codigo;
    String laboratorio;
    ArrayList<String> drogas = new ArrayList<String>();
    
    public Medicamento(String nombre, String codigo, String laboratorio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.laboratorio = laboratorio;
    }
    //GETTERS
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    //SETTERS
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getLaboratorio() {
        return laboratorio;
    }
    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }
    public ArrayList<String> getDrogas() {
        return drogas;
    }
    public void setDrogas(ArrayList<String> drogas) {
        this.drogas = drogas;
    }
    public void aggDrogas( String droga ){
        this.drogas.add(droga);
    }
    
}
