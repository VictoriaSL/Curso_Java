package s5_reto_02;

public class S5_Reto_02 {

    public static void main(String[] args) {
        MetodoPago[] pagos = new MetodoPago[] {
            new PagoEfectivo(150.0) {},
            new PagoTarjeta(320.0, 500.0) {},
            new PagoTransferencia(200.0, false) {}
        };

        for (MetodoPago pago : pagos) {
            if (pago.autentificar()) {
                System.out.println("Autenticacion exitosa.");
                pago.procesarPago();
                pago.mostrarResumen();
                System.out.println();
            } else {
                if (pago instanceof PagoTransferencia) {
                    System.out.println("Fallo de autenticacion. Transferencia no valida.");
                } else if (pago instanceof PagoTarjeta) {
                    System.out.println("Fallo de autenticacion. Fondos insuficientes.");
                } else {
                    System.out.println("Fallo de autenticacion.");
                }
                System.out.println();
            }
        }
    }
    
}
