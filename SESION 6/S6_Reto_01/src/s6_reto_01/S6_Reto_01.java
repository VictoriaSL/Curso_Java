package s6_reto_01;

import java.util.*;

public class S6_Reto_01 {
  
    public static void main(String[] args) {
       
// Paso 1: ArrayList para registrar todas las especies en orden
        
        // SE DECLARA ARRAY LIST "MUESTRA"
        ArrayList<String> muestras = new ArrayList<>();
        // AÑADIR MUESTRAS AL ARRAYLIST (se añaden con add)
        muestras.add("Homo sapiens");
        muestras.add("Mus musculus");
        muestras.add("Arabisdopsis thaliana");
        muestras.add("Homo sapiens");
        
// Paso 2: HashSet para filtrar especies únicas
        Set<String> EspeciesUnicas = new HashSet<>(muestras);
        
// Paso 3: HashMap para asociar ID de muestra con investigador
        Map<String, String> NombreInvestigador = new HashMap<>();
        //SE AÑADE EN MAP(se añade con put)
        NombreInvestigador.put("M-001", "Dra. Lopez");
        NombreInvestigador.put("M-002", "Dr. Hernandez");
        NombreInvestigador.put("M-003", "Mtra. Soto");
        NombreInvestigador.put("M-004", "Mtra. Lemus");
        
// Paso 4: Mostrar resultados

        System.out.println("LISTA COMPLETA ORDENADA DE MUESTRAS");
        //FOREACH PARA IMPRIMIR LISTA ORDENADA
        for (String especie: muestras) {
            System.out.println(" -"+especie);
        }
        
        System.out.println("\nLAS ESPECIES UNICAS PROCESADAS");
        //FOREACH PARA IMPRIMIR LISTA SIN DUPLICADOS
        for (String especie : EspeciesUnicas) {
            System.out.println("- " + especie);
        }
        
        System.out.println("\nRELACION DE ID DE MUESTRA - INVESTIGADOR");
        //FOREACH PARA IMPRIMIR LISTA CON RELACION 
         for (Map.Entry<String, String> id : NombreInvestigador.entrySet()) {
            System.out.println(id.getKey() + " - " + id.getValue());
        }
                
        System.out.println("\nUNA BUSQUEDA POR ID DE MUESTRA");
        
        // BUSQUEDA POR ID MUESTRA
        String idMuestra = "M-006";
        System.out.println("BUSQUEDA POR ID "+idMuestra+" :");
        if (NombreInvestigador.containsKey(idMuestra)) {
            System.out.println(idMuestra + " - " + NombreInvestigador.get(idMuestra));
        } else {
            System.out.println("NO SE ENCONTRO EL ID MUESTRA: " + idMuestra);
        } 
        
    }
    
}
