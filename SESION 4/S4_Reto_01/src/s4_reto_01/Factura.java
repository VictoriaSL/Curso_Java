package s4_reto_01;

import java.util.Objects;

public class Factura {

    String folio;
    String cliente;
    double total;

    public Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura (" + "folio=" + folio + ", cliente=" + cliente + ", total=" + total + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.folio);
        hash = 97 * hash + Objects.hashCode(this.cliente);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.total) ^ (Double.doubleToLongBits(this.total) >>> 32));
        return hash;
    }

    public boolean equals(Factura obj) {
        if (!this.folio.equals(obj.folio)) {
            return false;
        }
        return true;
    }
    
    
}
