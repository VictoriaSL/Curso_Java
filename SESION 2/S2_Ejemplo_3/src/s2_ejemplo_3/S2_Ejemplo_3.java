package s2_ejemplo_3;
import java.util.Scanner;

public class S2_Ejemplo_3 {

    //Estructura de Condicionales
    //EJERCICIO: Sisitema de envío de paquetes.
        
    public static void main(String[] args) {
        //scanner 
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el tipo de paquete(PEQUEÑO,MEDIANO,GRANDE)");
        
        //variables
        String tipo = leer.nextLine();
        double costo = 0;
        
        //conficional IF-ELSE
        if (tipo.equalsIgnoreCase("pequeño")) {
            costo = 49.99;
        } else if (tipo.equalsIgnoreCase("mediano")) {
            costo = 89.99;
        } else if (tipo.equalsIgnoreCase("grande")) {
            costo = 149.99;
        } else {
            System.out.println("Tipo de paquete no válido.");
        }
        if (costo > 0 ) {
            System.out.println("Costo del envío: $"+costo);
        }
        leer.close();  
        
        //////////////////////////////////////7
        /// ALTERNATIVA CON SWITCH
        //////////////////////////////////////7
        String tipo2 = "mediano";

         double costo2 = switch (tipo.toLowerCase()) {
             case "pequeño" -> 49.99;
             case "mediano" -> 89.99;
             case "grande" -> 149.99;
             default -> {
                 System.out.println("Tipo no válido.");
                 yield 0.0;
             }
        };
       System.out.println("Costo del envío: $" + costo2);
       
    }
    
}
