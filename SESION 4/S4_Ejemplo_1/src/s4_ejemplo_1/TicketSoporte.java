package s4_ejemplo_1;

import java.util.Objects;

public class TicketSoporte {
    // Atributos de instancia
    private String titulo;
    private String categoria;
    private int prioridad; // 1: Alta, 2: Media, 3: Baja
    private boolean estaActivo;

    // Constructor por defecto
    public TicketSoporte() {
        this.titulo = "Sin titulo";
        this.categoria = "General";
        this.prioridad = 2;
        this.estaActivo = true;
    }

    // Constructor con parámetros
    public TicketSoporte(String titulo, String categoria, int prioridad) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.prioridad = prioridad;
        this.estaActivo = true;
    }

    // Constructor de copia
    public TicketSoporte(TicketSoporte otro) {
        this.titulo = otro.titulo;
        this.categoria = otro.categoria;
        this.prioridad = otro.prioridad;
        this.estaActivo = otro.estaActivo;
    }

    // Constructor sobrecargado con solo título
    public TicketSoporte(String titulo) {
        this.titulo = titulo;
        this.categoria = "Sin categoria";
        this.prioridad = 3; // Baja
        this.estaActivo = true;
    }

    // Método para mostrar la información del ticket
    public void mostrarInfo() {
        System.out.println(" Ticket: " + titulo);
        System.out.println(" Categoria: " + categoria);
        System.out.println("️ Prioridad: " + prioridad);
        System.out.println(" Estado: " + (estaActivo ? "Activo" : "Cerrado"));
    }

    // Método para cerrar el ticket
    public void cerrar() {
        estaActivo = false;
        System.out.println(" El ticket '" + titulo + "' ha sido cerrado.");
    }
      // Sobrescribimos equals() para comparar contenido
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Mismo objeto
        if (obj == null || getClass() != obj.getClass()) return false;

        TicketSoporte otro = (TicketSoporte) obj;
        return this.titulo.equals(otro.titulo) &&
               this.categoria.equals(otro.categoria) &&
               this.prioridad == otro.prioridad &&
               this.estaActivo == otro.estaActivo;
    }

    // hashCode() compatible con equals()
    @Override
    public int hashCode() {
        return Objects.hash(titulo, categoria, prioridad, estaActivo);
    }

    // toString() para ver fácilmente la información del ticket
    @Override
    public String toString() {
        return  "TicketSoporte {" +
                "titulo='" + titulo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", prioridad=" + prioridad +
                ", estaActivo=" + estaActivo +
                '}';
    }
}

