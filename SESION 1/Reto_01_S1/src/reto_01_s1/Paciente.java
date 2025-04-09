package reto_01_s1;

public class Paciente {
     //--ATRIBUTOS--
    String Nombre;
    int Edad;
    String NExpediente;

    //--MÉTODOS--
    public void mostrarInformacion() {
        System.out.println("Nombre: "+Nombre);
        System.out.println("Edad: "+Edad);
        System.out.println("Numero de expediente: "+NExpediente);
    }

    public Paciente(String Nombre, int Edad, String NExpediente) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.NExpediente = NExpediente;
    }
    
}
