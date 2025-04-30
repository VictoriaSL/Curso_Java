
package s3_ejemplo_2;

public class Bloques_Reutilizables {
    
    //METODO SIN PARAMETROS Y SIN RETORNO
    public void mostrarBienvenida(){
        System.out.println("Bienvenido al sistema");
    }
    
    //METODO CON PARAMETROS Y SIN RETORNO
    public void mostrarSuma(int a, int b) {
        int resultado = a + b;
        System.out.println("La suma es: " + resultado);
    }
    
    //METODO CON PARAMETROS Y CON RETORNO
        public int obtenerSuma(int a, int b) {
        return a + b;
    }
    
    //PASO POR VALOR (TIPOS PRIMITIVOS)
    public void duplicar(int numero) {
         numero = numero * 2;
         System.out.println("Dentro del metodo: " + numero);
    }
    
    /*
    //PASO POR REFERENCIA (OBJETOS)
    public class Persona {
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public void cambiarNombre(Persona p) {
        p.nombre = "Nuevo nombre";
    }
    */
    //SOBRECARGA DE METODOS
    public void saludar() {
        System.out.println("Hola");
    }
    
    public void saludar(String nombre) {
        System.out.println("Hola, " + nombre);
    }
}
