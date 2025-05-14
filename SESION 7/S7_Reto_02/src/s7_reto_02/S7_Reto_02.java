package s7_reto_02;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class S7_Reto_02 {

    public static void main(String[] args) {
        //SE DEFINE LA RUTA DATOS.TXT
        Path ruta = Paths.get("src/s7_reto_02/datos.txt");
        // SE DEFINE LA RUTA PARA EL ARCHIVO ERRORES.LOG
        Path rutaLog = Paths.get("src/s7_reto_02/errores.log");
        //SE DEFINE LA RUTA PARA ARCHIVO FALLOS.TXT
        Path rutaRegistroFallos = Paths.get("src/s7_reto_02/registro_fallos.txt");
        
        //VARIABLES PARA CONTAR 
        int Lineas = 0;
        int Errores = 0;
        int Advertencias = 0;
        
        //TRY-WITH-RESOURSES con BufferedReader 
        //LEYENDO EL ARCHIVO DE LA RUTA
        try (BufferedReader lector = Files.newBufferedReader(ruta)) {
            ///WHILE PARA CONTAR LAS LINEAS, ERRORES Y ADVERTENCIAS
            String linea;
            while ((linea = lector.readLine()) != null) {
                    Lineas++;
                if (linea.contains("ERROR")) {
                    Errores++;
                }
                if (linea.contains("WARNING")) {
                    Advertencias++;
                }
            }
            //IMPRIMIENDO LOS MENSAJES EN CONSOLA
            System.out.println("RESUMEN DEL ANALISIS DE LOGS:");
            System.out.println("Total de lineas leidas: " + Lineas);
            System.out.println("Cantidad de errores: " + Errores);
            System.out.println("Cantidad de advertencias: " + Advertencias);
            
            //SACAMOS EL PORCENTAJE DE LAS LINEAS CON ERRORES Y ADVERTENCIAS
            double porcentaje = Lineas > 0 ? ((Errores + Advertencias) * 100.0) / Lineas : 0;
            System.out.printf("Porcentaje de lineas con errores y advertencias: %.2f%%\n", porcentaje);
            
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
       
          try {
            String contenido = Files.readString(ruta);
            System.out.println("");
            System.out.println("CONTENIDO DEL ARCHIVO:");
            //SE IMPRIME EL CONTENIDO DEL ARCHIVO
            System.out.println(contenido);
            
        } catch (IOException e) {
            try {
                //SE CREA ARCHIVO FALLOS EN CASO DE TENERLOS
                Files.writeString(rutaRegistroFallos, e.getMessage(), StandardCharsets.UTF_8);
            } catch (IOException ex) {
                System.out.println("No se pudo registrar el fallo: " + ex.getMessage());
            }
        }
        
   
    }
    
}
