package s3_ejemplo_4;

public class S3_Ejemplo_4 {

  
    public static void main(String[] args) {
        Contacto c1 = new Contacto("445-555-123");
        Contacto c2 = new Contacto(null);
        
        //X Usando isPresent (NO RECOMENDADO)
        if (c1.getTelefono().isPresent()) {
            System.out.println("Telefono: " + c1.getTelefono().get());
        }
        //:3 Usando ifPresent (RECOMENDADO)
        c2.getTelefono().ifPresent(tel -> System.out.println("📞 Teléfono: " + tel));    
    
        // orElse devuelve el valor si existe, o el alternativo si no
        String tel1 = c1.getTelefono().orElse("No registrado");
        String tel2 = c2.getTelefono().orElse("No registrado");

        System.out.println("Telefono 1: " + tel1);
        System.out.println("Telefono 2: " + tel2);

        // orElseThrow lanza una excepción si no hay valor
        String telSeguro = c2.getTelefono().orElseThrow(() -> new RuntimeException("TELEFONO OBLIGATORIO"));
    }
    
}
