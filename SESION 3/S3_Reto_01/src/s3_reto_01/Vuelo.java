package s3_reto_01;

import java.util.Optional;

public class Vuelo {
    
    private final String codigoVuelo;
    private String destino;
    private String horaSalida;
    private Pasajero asientoReservado;
    
    public Vuelo(String codigo, String destino, String horaSalida) {
        this.codigoVuelo = codigo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            return true;
        }
        return false;
    }
     public boolean reservarAsiento(String nombre, String pasaporte) {
        if (asientoReservado == null) {
            asientoReservado = new Pasajero(nombre, pasaporte);
            return true;
        }
        return false;
    }

    public void cancelarReserva() {
        asientoReservado = null;
    }

    public String obtenerItinerario() {
        StringBuilder itinerario = new StringBuilder();
        itinerario.append("Vuelo: ").append(codigoVuelo).append("\n");
        itinerario.append("Destino: ").append(destino).append("\n");
        itinerario.append("Hora de Salida: ").append(horaSalida).append("\n");
        
        if (asientoReservado != null) {
            itinerario.append("Pasajero: ").append(asientoReservado.getNombre()).append("\n");
            itinerario.append("Pasaporte: ").append(asientoReservado.getPasaporte());
        } else {
            itinerario.append("Asiento: [Disponible]");
        }
        
        return itinerario.toString();
    }
}
