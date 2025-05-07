package s5_reto_02;
// Pago por transferencia

public abstract class PagoTransferencia extends MetodoPago {
    
    private boolean validacionBancaria;

    public PagoTransferencia(double monto, boolean validacionBancaria) {
        super(monto);
        this.validacionBancaria = validacionBancaria;
    }

    @Override
    public boolean autentificar(){
        return validacionBancaria;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago por transferencia de $" + monto);
    }

}
