
package s3_reto_02;

import java.util.Optional;

public class Factura {
    private double monto;
    private String descripcion;
    private Optional<String> rfc;

    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }

    public String getResumen() {
        return String.format("""
            Factura generada:
            Descripcion: %s
            Monto: $%.1f
            RFC: %s""",
            descripcion,
            monto,
            rfc.orElse("[No proporcionado]")
        );
    }
} 