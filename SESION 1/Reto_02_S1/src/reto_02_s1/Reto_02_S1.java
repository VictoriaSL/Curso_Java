package reto_02_s1;

import java.util.Scanner;

public class Reto_02_S1 {


    public static void main(String[] args) {
        // SCANNER  
        Scanner leer = new Scanner(System.in);
        
        //Vinculo entre CLASES
        Entrada entrada = new Entrada(leer.next(),leer.nextDouble());
        
        //Lamada del metodo de otra clase
        entrada.mostrarInformacion();
        
    }
    
}
