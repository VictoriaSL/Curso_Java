package s5_ejemplo_4;

//Subclases con sobrescritura de método
public class GatoRobot extends AnimalRobot {
    @Override
    public void hacerSonido() {
        System.out.println("GatoRobot: Miau Miau Mecanico");
    }
}