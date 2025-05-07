
package s4_reto_02;

public record DeclaracionImpuestos( ){

     static String rfcContribuyente = "HISS123";
     static double montoDeclarado = 4000.3;

    @Override
    public String toString() {
        return "Cuenta Fiscal registrada por RFC: "+rfcContribuyente +" por:"+ montoDeclarado;
    }
     
     
   
}
