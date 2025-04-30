package s3_ejemplo_3;

   //MODIFICADOR PRIVATE

public class Usuario {
     
    private String nombre;
    private double saldo; //no puede acceder directamente
    
    public Usuario(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }
            
}

