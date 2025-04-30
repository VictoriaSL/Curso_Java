
package s3_ejemplo_2;

public class S3_Ejemplo_2 {

    public static void main(String[] args) {
        
        Bloques_Reutilizables r = new Bloques_Reutilizables();
       
        //LLAMADA AL METODO SIN PARAMETROS Y SIN RETORNO
        r.mostrarBienvenida();
        
        //LLAMADA AL METODO CON PARAMETROS Y SIN RETORNO
        r.mostrarSuma(10, 20);
        
        //LLAMADA CON PARAMETROS Y CON RETORNO
        System.out.println("Resultado: "+ r.obtenerSuma(5, 7));
        
        //LLAMADA PASO POR VALOR (TIPOS PRIMITIVOS)
        int x = 10;
        r.duplicar(x);
        System.out.println("Fuera del metodo: " + x);  
        
        //LLAMADA PASO POR REFERNCIA 
        //Persona persona = new Persona("Mario"); cuando tienes la clase Persona
        //cambiarNombre(persona);
        //System.out.println("Nombre actualizado: " + persona.nombre);

         //SOBRECARGA DE METODOS
         r.saludar();
         r.saludar("Victoria");
    }

}
