package s5_ejemplo_4;

//Subclases con sobrescritura de método
public class PerroRobot extends AnimalRobot {
    @Override
    public void hacerSonido() {
        System.out.println("PerroRobot: Guau Guau Digital");
    }
}