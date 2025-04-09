
package ejemplo_3;

/**
* Un constructor es un método especial que se ejecuta automáticamente al crear un objeto.
* Se utiliza para inicializar los atributos de una clase con valores definidos.
 */
public class constructor {
     // Atributos del producto
    String nombre;
    double precio;

    // Constructor que inicializa el producto con nombre y precio
    public constructor(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método que muestra la información del producto en consola
    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre + " - Precio: $" + precio);
    }
}
