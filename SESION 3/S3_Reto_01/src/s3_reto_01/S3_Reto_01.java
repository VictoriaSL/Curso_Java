package s3_reto_01;

public class S3_Reto_01 {

    public static void main(String[] args) {
       
        // Crear un vuelo
        Vuelo vuelo = new Vuelo("IB2042", "Madrid", "14:30");
        
        // Crear un pasajero
        Pasajero pasajero = new Pasajero("Ana MARTINEZ", "AM123");

        // Reservar asiento para el pasajero
        vuelo.reservarAsiento("ANA MARTINEZ", "AM123");
        
        // Mostrar itinerario después de la reserva
        System.out.println("=== Itinerario del Vuelo ===");
        System.out.println(vuelo.obtenerItinerario());
        System.out.println("\n");
        
        // Cancelar la reserva
        System.out.println("=== Cancelando Reserva... ===");
        vuelo.cancelarReserva();
        System.out.println("");
        
        // Mostrar itinerario después de cancelar
        System.out.println("=== Itinerario del Vuelo ===");
        System.out.println(vuelo.obtenerItinerario());
        System.out.println("");
        
        // Realizar una nueva reserva usando nombre y pasaporte directamente
        vuelo.reservarAsiento("victoria SL", "XYZ789012");
       
        // Mostrar itinerario final
        System.out.println("=== Itinerario del Vuelo ===");
        System.out.println(vuelo.obtenerItinerario());
    }
    
}
