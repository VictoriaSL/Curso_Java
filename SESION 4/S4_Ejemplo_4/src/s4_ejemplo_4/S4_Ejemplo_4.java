
package s4_ejemplo_4;

public class S4_Ejemplo_4 {

    public static void main(String[] args) {
       
        // Creamos un empleado y asignamos datos de forma segura
        Empleado e = new Empleado();
        e.setNombre("Victoria");
        e.setEdad(27);
        e.mostrarInfo();

        // Creamos un contrato que no se puede modificar después
        Contrato c = new Contrato("Tiempo completo", 25000.00);
        c.mostrarInfo();
    }
    
}
