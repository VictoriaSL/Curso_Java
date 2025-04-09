package s2_reto_1;

import java.util.Scanner;

public class S2_Reto_1 {
    
    //RETO: 
    
    public static void main(String[] args) {
        //Declaración del Scanner
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el nombre del Medicamento, precio, cantidad");
        
        //Atributos
        String NombreMedica = leer.nextLine();
        double Precio = leer.nextDouble();
        int cantidad = leer.nextInt();
        
        //TOTAL SIN DESCUENTO
        double total= (Precio*cantidad);
        
        //DESCUENTO 
        var aplicaDescuento = total > 500;
        double descuento = aplicaDescuento ? total * 0.15 : 0;
        
        //TOTAL FINAL
        double totalFinal = total - descuento;
                
        //IMPRIMIR RESULTADO
        System.out.println("MEDICAMENTO: "+NombreMedica);
        System.out.println("CANTIDAD: "+cantidad);
        System.out.println("PRECIO UNITARIO: $"+Precio);
        System.out.println("TOTAL SIN DESCUENTO: "+total);
        System.out.println("¿APLICA DESCUENTO?: "+aplicaDescuento);
        System.out.println("DESCUENTO: $"+descuento);
        System.out.println("TOTAL A PAGAR: $"+totalFinal);

    }
    
}
