package s5_ejemplo_3;

public class S5_Ejemplo_3 {
    
//herencia simple con clase abstracta y herencia múltiple con interfaces 
    
    public static void main(String[] args) {
        
        Drone drone1 = new DroneVigilancia("DR-001");
        Drone drone2 = new DroneReparto("DR-002");

        drone1.despegar();
        drone1.ejecutarMision();
        drone1.aterrizar();

        System.out.println();

        drone2.despegar();
        drone2.ejecutarMision();
        drone2.aterrizar();
        
    }
    
}
