package fpuna.Actividad2_2.Ejercicio5;

import java.time.LocalDate;

public class Lote {
    private Medicamento medicamento;
    private LocalDate fechaVencimiento;
    private double precioCosto;
    private double precioFinal;
    public Lote( Medicamento medicamento , LocalDate fechaVencimiento , double precioCosto ){
        this.medicamento = medicamento;
        this.fechaVencimiento = fechaVencimiento;
        this.precioCosto = precioCosto;
        this.precioFinal = precioCosto * 1.25;
    }
    public Medicamento getMedicamento() {
        return medicamento;
    }
    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public double getPrecioCosto() {
        return precioCosto;
    }
    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }
    public double getPrecioFinal() {
        return precioFinal;
    }
    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }
    
}
