package fpuna.Actividad2_2.Ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Farmacia {
    private ArrayList<Lote> lotes = new ArrayList<Lote>();

    public void imprimirMedicamentosVencidos(LocalDate fecha){
        for( Lote lote : lotes ){
            if( lote.getFechaVencimiento().isBefore(fecha) ){
                // System.out.println("Se vence");
                // String.format(
                //     "Medicamento: %s\t\tFecha de Vencimiento: %s\n",
                //     lote.getMedicamento().getNombre(),
                //     lote.getFechaVencimiento()
                // );
                System.out.println("Medicamento: "+lote.getMedicamento().getNombre() 
                + " - Vencimiento: "+ lote.getFechaVencimiento());
            }
        }
    }

    private static LocalDate conversorStringFecha(String fecha){
        String partes [] = fecha.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int anho = Integer.parseInt(partes[2]);

        return LocalDate.of(anho, mes, dia);
    }

    public ArrayList<Lote> getLotes() {
        return lotes;
    }

    public void addLote(Lote lote) {
        this.lotes.add(lote);
    }


    public static void main(String[] args) {
        System.out.println("Ingrese la fecha (en formato dd/mm/yyyy) : ");
        Scanner scan = new Scanner(System.in);
        String fechaIngresada = scan.nextLine();
        
        LocalDate fecha = conversorStringFecha(fechaIngresada);
        Medicamento med1 = new Medicamento("paracetamol","123","lasca");
        med1.aggDrogas("droga1");
        med1.aggDrogas("droga2");
        med1.aggDrogas("droga3");

        Medicamento med2 = new Medicamento("ibuprofeno","234" ,"labDesconocido1" );
        med2.aggDrogas("droga1");
        med2.aggDrogas("droga2");
        med2.aggDrogas("droga3");

        Medicamento med3 = new Medicamento("antigripas","345" ,"labDesconocido2" );
        med3.aggDrogas("droga1");
        med3.aggDrogas("droga2");
        med3.aggDrogas("droga3");

        Lote lote1 = new Lote(med1,LocalDate.of(2024, 3, 13), 5000);
        Lote lote2 = new Lote(med2, LocalDate.of(2024, 10, 13), 10000);
        Lote lote3 = new Lote(med3, LocalDate.of(2024, 6, 13), 15000);

        Farmacia farmacia1 = new Farmacia();
        farmacia1.addLote(lote1);
        farmacia1.addLote(lote2);
        farmacia1.addLote(lote3);

        System.out.println("Los medicamentos que vencen a hasta la fecha ingresada son:\n");
        farmacia1.imprimirMedicamentosVencidos(fecha);
        scan.close();
    }
}
