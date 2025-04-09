
package ejemplo_1_s2;

public class Ejemplo_1_S2 {
        // Conversión de tipos y casting
        
        // conversión implícita
        //int numero = 10;
        //double resultado = numero; 
        
        // conversión explícita (casting)
        //double precio = 19.99;
        //int precioEntero = (int) precio; 

    public static void main(String[] args) {
        //declaración de variables
        int edad = 28;
        double salario = 15499.0;
        boolean activo = true;
        char inicial = 'M';
        var ciudad = "Guadalajara";
        
        //Imprimir los valores almacenados en las variables
        System.out.println("Edad: "+edad);
        System.out.println("Salario: "+salario);
        System.out.println("Activo: "+activo);
        System.out.println("Inicial: "+inicial);
        System.out.println("Cuidad: "+ciudad);
        
        //CONVERSIONES
        double precio = 199.99;
        int precioRedondeado = (int) precio;
        System.out.println("Precio Original: "+precio);
        System.out.println("Precio Redondeado: "+precioRedondeado);
        
    }
    
}
