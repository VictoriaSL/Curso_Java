package s4_reto_01;

public class S4_Reto_01 {

    public static void main(String[] args) {
      Factura fac1 = new Factura("FAC001","Juan Carlos Bodoque",5000);
      Factura fac2 = new Factura("FAC001","Tulio Trivinho",5000);
        System.out.println(fac1.toString());
        System.out.println(fac2.toString());
        System.out.println("Las facturas son iguales? "+fac1.equals(fac2));
    }
    
}
