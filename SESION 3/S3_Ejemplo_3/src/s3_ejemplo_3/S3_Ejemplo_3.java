
package s3_ejemplo_3;

public class S3_Ejemplo_3 {


    public static void main(String[] args) {
        //se llama la clase
        Usuario u = new Usuario("Victoria",1000.0);
        
        //Se accede al nombre (del metodo publico)
        System.out.println("Usuario: " + u.getNombre());
        
        //accedemos al saldi usuando metodo getter
        System.out.println("Saldo Inicial: "+ u.getSaldo());
        
        //usamos metodo publico para modificar saldo
        u.depositar(1000.0);
        System.out.println("Saldo despues de deposito: " + u.getSaldo());
                
    }
    
}
