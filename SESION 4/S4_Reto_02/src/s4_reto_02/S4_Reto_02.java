package s4_reto_02;

public class S4_Reto_02 {

    public static void main(String[] args) {
        
       CuentaFiscal cf = new CuentaFiscal("solv232323",2000.3);
       DeclaracionImpuestos di = new DeclaracionImpuestos();
       System.out.println("Declaracion enviada por RFC: "+cf.toString()+" por: "+cf.getMontoDeclarado());
       System.out.println(di.toString());
       System.out.println("RFC valido para esta cuenta? " + cf.equals(di));
        
    }
        
}
