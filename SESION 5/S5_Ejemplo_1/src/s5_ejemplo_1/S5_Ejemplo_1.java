package s5_ejemplo_1;

public class S5_Ejemplo_1 {

    public static void main(String[] args) {
        
       NotificacionEmail email = new NotificacionEmail("Tu pedido ha sido enviado", "ana@correo.com");

        // Llamamos a métodos heredados y propios
        email.enviar();        // Método heredado
        email.enviarEmail();   // Método propio
        
    }
    
}
