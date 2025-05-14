package s7_ejemplo_4;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class S7_Ejemplo_4 {

    public static void main(String[] args) {
        // Uso básico de try-catch para leer un archivo
        Path ruta = Paths.get("src/s7_ejemplo_4/datos.txt");

        try {
            String contenido = Files.readString(ruta);
            System.out.println("ESTA ES CON: try-catch");
            System.out.println("Contenido del archivo:");
            System.out.println(contenido);
        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo: " + e.getMessage());
        }
        System.out.println("");
        //Uso de try-with-resources con BufferedReader
        try (BufferedReader lector = Files.newBufferedReader(ruta)) {
            String linea;

            while ((linea = lector.readLine()) != null) {
                System.out.println("ESTA ES CON: BufferedReader");
                System.out.println(" - " + linea);
            }
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
        
    } 
}
