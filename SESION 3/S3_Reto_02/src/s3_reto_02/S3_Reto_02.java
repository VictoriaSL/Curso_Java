
package s3_reto_02;

public class S3_Reto_02 {

    public static void main(String[] args) {
        // Crear factura con RFC
        Factura facturaConRFC = new Factura(2500.0, "Servicio de consultoria", "ABCC010101XYZ");
        
        // Crear factura sin RFC
        Factura facturaSinRFC = new Factura(1800.0, "Reparacion de equipo", null);
        //Mostrar itinerario inicial
        System.out.println("Itinerario Inicial");
        // Imprimir resúmenes
        System.out.println(facturaConRFC.getResumen());
        System.out.println("");
        System.out.println(facturaSinRFC.getResumen());
        
        
    }
    
}
