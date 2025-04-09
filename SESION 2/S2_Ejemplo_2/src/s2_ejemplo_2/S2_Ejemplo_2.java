package s2_ejemplo_2;

public class S2_Ejemplo_2 {

    //FACTURACIÓN DE UNA CAFETERIA
    
    public static void main(String[] args) {
        //Precios Unitarios
        double precioCafe = 45.50;
        double precioPastel = 80.00;
        double precioAgua = 20.00;
        
        //Cantidades
        int cantidadCafe = 2;
        int cantidadPastel = 1;
        int cantidadAgua = 1;
        
        //incremento en 1
        //cantidadPastel = cantidadPastel + 1;
        cantidadPastel++;
        
        //Cálculo de total
        double total=(precioCafe*cantidadCafe)+(precioPastel*cantidadPastel)+(precioAgua*cantidadAgua);
        
        // Descuento si el total supera $150
        boolean aplicaDescuento = total > 150;

        // Asignación del descuento (10%)
        //( : ? ) este equibale a ELSE-IF
         double descuento = aplicaDescuento ? total * 0.10 : 0;

        // Cálculo final
        double totalFinal = total - descuento;

        // Salida formateada
        System.out.println("Total de la compra: $" + total);
        System.out.println("¿Aplica descuento? " + aplicaDescuento);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalFinal);
        
        
    
    }
}

