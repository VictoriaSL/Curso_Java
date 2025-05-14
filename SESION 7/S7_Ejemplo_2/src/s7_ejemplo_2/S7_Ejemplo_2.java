package s7_ejemplo_2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class S7_Ejemplo_2 {

   public static void main(String[] args) {
        // 1. Definir la ruta del archivo
        Path ruta = Paths.get("src/s7_ejemplo_2/notas.txt");

        // 2. Contenido a escribir en el archivo
        String contenido = "Este es un archivo de prueba.\nAqui aprendemos a escribir y leer en Java.";

        try {
            // 3. Escribir contenido en el archivo (crea o sobrescribe)
            Files.write(ruta, contenido.getBytes());
            System.out.println("Archivo escrito exitosamente.");

            // 4. Leer el contenido completo como String
            String textoLeido = Files.readString(ruta);
            System.out.println("Contenido leido:");
            System.out.println(textoLeido);

        } catch (IOException e) {
            System.out.println("Error al trabajar con el archivo: " + e.getMessage());
        }
    }
}
