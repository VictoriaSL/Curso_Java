package reto_02_s1;

public class Entrada {
    //ATRIBUTOS
    String Nombre_evento;
    double Precio_Entrada;
    
    //CONSTRUCTOR
    public Entrada(String Nombre_evento, double Precio_Entrada) {
        this.Nombre_evento = Nombre_evento;
        this.Precio_Entrada = Precio_Entrada;
    }
    
     //--MÉTODO para MOSTRAR--
    public void mostrarInformacion() {
        System.out.println("Evento: "+Nombre_evento+ " | Precio: $"+Precio_Entrada);
        }
    
}
