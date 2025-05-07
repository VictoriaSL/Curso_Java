package s5_reto_02;


public abstract class PagoEfectivo extends MetodoPago{
    
    public PagoEfectivo(double monto) {
        super(monto);
    }

    @Override
    public boolean autentificar() {
        return true;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago en efectivo por $" + monto);
    }
 }