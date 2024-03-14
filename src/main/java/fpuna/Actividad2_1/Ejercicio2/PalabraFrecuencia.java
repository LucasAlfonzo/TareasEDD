package fpuna.Actividad2_1.Ejercicio2;

public class PalabraFrecuencia implements Comparable<PalabraFrecuencia>{
    String palabra;
    int frecuencia;

    public PalabraFrecuencia(String palabra, int frecuencia) {
        this.palabra = palabra;
        this.frecuencia = frecuencia;
    }

    @Override
    public int compareTo(PalabraFrecuencia pf) {
        return pf.frecuencia - this.frecuencia;
    }
}
