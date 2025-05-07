package s5_ejemplo_2;

public class Vehiculo {
    //Atributo
    String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public void encender() {
        System.out.println("El vehiculo " + marca + " esta encendido.");
    }
}