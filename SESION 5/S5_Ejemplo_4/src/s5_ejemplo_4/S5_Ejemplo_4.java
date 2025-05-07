package s5_ejemplo_4;

public class S5_Ejemplo_4 {

    public static void main(String[] args) {
        
      //Clase principal: CentroControl
       AnimalRobot[] zoologico = {
            new PerroRobot(),
            new GatoRobot(),
            new PajaroRobot()
        };

        for (AnimalRobot robot : zoologico) {
            robot.hacerSonido();  // Polimorfismo en acción
        }
    }
    
}
