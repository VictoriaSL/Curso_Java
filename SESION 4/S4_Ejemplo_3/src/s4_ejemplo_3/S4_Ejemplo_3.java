package s4_ejemplo_3;

import java.util.Objects;

public class S4_Ejemplo_3 {

    public static void main(String[] args) {
         // Creamos dos empleados con valores null en el nombre
        Empleado e1 = new Empleado(null, 25);
        Empleado e2 = new Empleado(null, 25);

        // Usamos Objects.equals() para comparar los nombres (evita NullPointerException)
        boolean nombresIguales = Objects.equals(e1.nombre(), e2.nombre());

        // Mostramos los objetos y la comparación
        System.out.println("Empleado 1: " + e1);
        System.out.println("Empleado 2: " + e2);
        System.out.println("Los nombres son iguales?: " + nombresIguales);
    }
    
    
}
