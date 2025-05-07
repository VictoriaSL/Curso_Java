package s5_ejemplo_3;

//SE LE AGREGA LA PALABRA abstract AL METODO PARA HACERLO ABSTRACTO.
public abstract class Drone {
    //ATRIBUTO TIPO STRING
    String id;
    
    public Drone(String id) {
        this.id = id;
    }

    public void despegar() {
        System.out.println("Drone " + id + " despegando...");
    }

    public void aterrizar() {
        System.out.println("Drone " + id + " aterrizando...");
    }

    // Método abstracto que cada tipo de drone debe implementar
    public abstract void ejecutarMision();
    
    
}