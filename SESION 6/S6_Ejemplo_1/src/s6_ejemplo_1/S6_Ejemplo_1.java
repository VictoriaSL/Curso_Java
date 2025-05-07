package s6_ejemplo_1;

//IMPORTA TODO
import java.util.*;

public class S6_Ejemplo_1 {

    public static void main(String[] args) {
        
        //EJEMPLO DE List: Registrar orden de llegada de materiales
        
        //Estructura de una LISTA DINAMICA
        List<String> materialesRecibidos = new ArrayList<>();
        
        //Se añaden los ementos a la lista.
        materialesRecibidos.add("Tornillo M6");
        materialesRecibidos.add("Arandela 8mm");
        materialesRecibidos.add("Tornillo M6"); // Llega repetido
        materialesRecibidos.add("Tuerca M6");

        System.out.println("Orden de llegada de materiales:");
        //Se imprime el contenido de la lista con un ciclo for
        for (String material : materialesRecibidos) {
            System.out.println("- " + material);
        }

        //Set: Validar lotes únicos (sin duplicados)
        
        //ESTRUCTURA DE UN SET (CONJUNTOS)
        Set<String> lotesUnicos = new HashSet<>();
        
        //SE AÑADEN ELEMENTOS AL CONJUNTO
        lotesUnicos.add("Lote-001");
        lotesUnicos.add("Lote-002");
        lotesUnicos.add("Lote-001"); // Duplicado que será ignorado

        System.out.println("\nLotes registrados (sin duplicados):");
        //SE IMPRIME EL CONTENIDO DEL CONJUNTO
        for (String lote : lotesUnicos) {
            System.out.println("- " + lote);
        }

        // Map: Código de pieza asociado a descripción
        
        //ASOCIACIONES CLAVE-VALOR
        Map<String, String> catalogoPiezas = new HashMap<>();
        
        //SE AÑADEN ELEMENTOS 
        catalogoPiezas.put("PZ-1001", "Tornillo M6 x 20mm");
        catalogoPiezas.put("PZ-1002", "Tuerca M6");
        catalogoPiezas.put("PZ-1003", "Arandela 8mm");
        
        System.out.println("\nCatalogo de piezas (Codigo -> Descripcion):");
        
        //SE IMPRIME EL CONTENIDO DEL MAP
        for (Map.Entry<String, String> entrada : catalogoPiezas.entrySet()) {
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }

        // Buscar descripción a partir del código
        String codigoBuscado = "PZ-1002";
        
        System.out.println("\nDescripcion de la pieza " + codigoBuscado + ": " + catalogoPiezas.get(codigoBuscado));

    }
    
}
