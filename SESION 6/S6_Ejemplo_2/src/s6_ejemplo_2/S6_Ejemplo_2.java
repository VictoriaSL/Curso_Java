package s6_ejemplo_2;

import java.util.*;

public class S6_Ejemplo_2 {

    public static void main(String[] args) {
        
        //ArrayList: registrar reportes de defectos (PUEDE HABER REPETIDOS)
        
        //ESTRUCTURA DE ARRAYLIST
        ArrayList<String> reportes = new ArrayList<>();
        //SE AÑADEN ELEMENTOS A LA LISTA DE ARREGLOS
        reportes.add("Falla en rosca");
        reportes.add("Golpe en superficie");
        reportes.add("Falla en rosca"); // Repetido
        reportes.add("Pintura irregular");

        System.out.println("Reportes de defectos (ordenados, con duplicados):");
        //SE IMPRIME EL CONTENIDO DE LA LISTA DE ARREGLOS
        for (int i = 0; i < reportes.size(); i++) {
            System.out.println(i + 1 + ". " + reportes.get(i));
        }

        //HashSet: registrar defectos únicos
        //ESTRUCTURA 
        HashSet<String> tiposDefecto = new HashSet<>(reportes); //ELIMINA DUPLICADOS

        System.out.println("\nTipos unicos de defecto encontrados:");
        //IMPRIME EL CONTENIDO DEL CONJUNTO
        for (String defecto : tiposDefecto) {
            System.out.println("- " + defecto);
        }

        //HashMap: asociar ID de lote con la causa del rechazo
        //ESTRUCTURA
        HashMap<String, String> lotesRechazados = new HashMap<>();
        //SE AÑADEN ELEMENTOS
        lotesRechazados.put("L-001", "Falla en rosca");
        lotesRechazados.put("L-002", "Golpe en superficie");
        lotesRechazados.put("L-003", "Pintura irregular");

        System.out.println("\nLotes rechazados (ID - Causa):");
        //IMPRIME EL CONTENIDO DEL CONJUNTO
        for (Map.Entry<String, String> entry : lotesRechazados.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        //Buscar causa de rechazo por ID
        String idBuscar = "L-002";
        System.out.println("\nCausa del rechazo para " + idBuscar + ": " + lotesRechazados.get(idBuscar));
    }
    
}
