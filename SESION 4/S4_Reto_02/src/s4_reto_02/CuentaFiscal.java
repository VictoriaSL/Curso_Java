
package s4_reto_02;

public class CuentaFiscal {
    
    private String rfcContribuyente;
    private double montoDeclarado;

    public CuentaFiscal(String rfcContribuyente, double montoDeclarado) {
        
        this.rfcContribuyente = rfcContribuyente;
        this.montoDeclarado = montoDeclarado;
        
    }

    public double getMontoDeclarado() {
        return montoDeclarado;
    }

    @Override
    public String toString() {
        return  rfcContribuyente;
    }
    
    
    public boolean validarRFC(DeclaracionImpuestos d) {
        if (!this.rfcContribuyente.equals(d)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
