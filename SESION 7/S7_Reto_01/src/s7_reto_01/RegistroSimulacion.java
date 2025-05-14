package s7_reto_01;
import java.nio.file.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

//SE CREA LA CLASE PRINCIPAL 
public class RegistroSimulacion {

    public static void main(String[] args) {

        /////////////SE DEFINE LA RUTA DEL ARCHIVO DENTRO DE UNA CARPETA
        Path ruta = Paths.get("src/S7_Reto_01/config/parametros.txt");

        ///////////// ATRIBUTO TIPO STRING CON ELEMENTOS.
        String contenido = "Tiempo de ciclo: 55.8 segundos\n" +
                           "Velocidad de linea: 1.2 m/s\n" +
                           "Numero de estaciones: 8";
        ///////////// SE CREA UN TRY-CATCH PARA CREAR UN DIRECTORIO(CARPETA) SI ESTE NO EXISTE
         try {
            // RUTA BASE
            Path base = Paths.get("src/S7_Reto_01");
            // NOMBRE DEL DIRECTORIO(CARPETA)
            Path dirConfig = base.resolve("config");
            //CREA EL DIRECTORIO(CARPETA)
            Files.createDirectories(dirConfig);
            // PARA CREAR UN ARCHIVO
            Path archivoTemporal = dirConfig.resolve("parametros.txt");
            //SI NO EXISTE EL ARCHIVO ENTONCES LO CREA Y PONE EL CONTENIDO.
            if (!Files.exists(archivoTemporal)) {
                Files.writeString(archivoTemporal, contenido);
                System.out.println("Archivo de reporte creado en carpeta control.");
            }
            //EN CASO DE QUE ALGO FALLE ESTE MANDA UN MENSAJE
            } catch (IOException e) {
                 System.err.println("Error al manejar archivos: " + e.getMessage());
            }
         
        /////////////VALIDANDO SI EL ARCHIVO FUE CREADO CORRECTAMENTE
          try {
            // ESCRIBE EL CONTENIDO
            Files.write(ruta, contenido.getBytes());
            //MENSAJE EN CONSOLA
            System.out.println("Archivo escrito exitosamente.");

        //////////////LEE EL ARCHIVO Y MUESTRA SU CONTENIDO
            //SE LEE EL ARCHIVO
            String textoLeido = Files.readString(ruta);
            //SE IMPRIME EL CONTENIDO DEL ARCHIVO
            System.out.println("Contenido leido:");
            System.out.println(textoLeido);
        //AQUI MANDA UN MESAJE EN CASO DE QUE SE TENGA ALGUN ERROR
        } catch (IOException e) {
            System.out.println("Error al trabajar con el archivo: " + e.getMessage());
        }
   
    } 
       
}
