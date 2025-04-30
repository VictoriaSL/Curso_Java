
package s3_reto_01;

public class Pasajero{
    private String Nombre;
    private String Pasaporte;

    public String getNombre() {
        return Nombre;
    }

    public String getPasaporte() {
        return Pasaporte;
    }

    public Pasajero(String Nombre, String Pasaporte) {
        this.Nombre = Nombre;
        this.Pasaporte = Pasaporte;
    }
    
}
