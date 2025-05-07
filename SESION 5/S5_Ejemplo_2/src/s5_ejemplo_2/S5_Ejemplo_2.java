package s5_ejemplo_2;

public class S5_Ejemplo_2 {

    public static void main(String[] args) {
        //MAIN : SIMULADOR 
       AutoAutonomo tesla = new AutoAutonomo("Tesla");

       tesla.encender();          // Método heredado de Vehiculo
       System.out.println("");
       tesla.iniciarAutonomia();  // Método propio con composición(AutoAutonomo)
       
    }
    
}
