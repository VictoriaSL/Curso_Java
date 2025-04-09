
package ejemplo_2;

public class Principal {
    
    public static void main(String[] args) {
        // Crear un nuevo objeto de tipo Estudiante
        estudiante estudiante1 = new estudiante();

        // Asignar valores a los atributos
        estudiante1.nombre = "Victoria";
        estudiante1.edad = 26;

        // Llamar al método saludar() del objeto
        estudiante1.saludar();
    }
    
}
