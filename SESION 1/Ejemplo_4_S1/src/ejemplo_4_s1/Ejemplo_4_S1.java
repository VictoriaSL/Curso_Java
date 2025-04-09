
package ejemplo_4_s1;

public class Ejemplo_4_S1 {

    // Un record es una forma concisa de definir una clase inmutable en Java.
    public record Producto(String nombre, double precio) { }
    // Clase base sellada: solo las clases permitidas pueden extenderla.
    // Mejora el control de herencia en jerarquías cerradas.
    public sealed class Vehiculo permits Auto, Camion { }
    // Clase Auto que extiende Vehiculo. Se declara como final para no permitir más herencia.
    final class Auto extends Vehiculo { }

// Clase Camion que también extiende Vehiculo y es final.
final class Camion extends Vehiculo { }
    
    public static void main(String[] args) {
        // Crear un objeto de tipo Producto usando el record
        Producto producto = new Producto("Monitor", 3299.99);

        // Muestra el toString() generado automáticamente por el record.
        System.out.println(producto);
    }
    
}
