package s5_ejemplo_3;
//Clases concretas que extiende de drone(clase maestra) y implementa elementos de vigilancia
public class DroneVigilancia extends Drone implements Vigilancia {

    public DroneVigilancia(String id) {
        //lo toma de clase Drone
        super(id);
    }

    //clase de Drone que manda a llamar a clase de vigilancia.
    @Override
    public void ejecutarMision() {
        System.out.println("Drone " + id + " iniciando mision de vigilancia.");
        escanearArea();
    }
    //clase de Vigilancia 
    @Override
    //@Override para asegurar que la sobrescritura sea válida y clara.
    
    public void escanearArea() {
        System.out.println("Escaneando area en 360°...");
    }
}