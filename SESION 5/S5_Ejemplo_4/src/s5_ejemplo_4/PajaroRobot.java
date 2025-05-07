package s5_ejemplo_4;

//Subclases con sobrescritura de método
public class PajaroRobot extends AnimalRobot {
    @Override
    public void hacerSonido() {
        System.out.println("PajaroRobot: Piiiiio Piiiio Cibernetico");
    }
}