package s6_reto_02;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class S6_Reto_02 {

    public static void main(String[] args) {
        
        //SE DECLARA EL CopyOnWriteArrayList ---
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();
        //SE AÑADEN LOS TEMAS
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matematicas basicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));
        
        //MOSTRAR LISTA ORDENADA ALFABETCAMENTE
        //SE COMPARAN TEMAS
        Collections.sort(temas); 
        //SE IMPRIMEN LOS TEMMAS EN ORDEN ALFABETICO
        System.out.println("\nTemas ordenados alfabeticamente:");
        for (Tema t : temas) {
            System.out.println(t);
        }

        // SE ORDENA EN ASCENDENTE USANDO COMPARATOR
        temas.sort(Comparator.comparingInt(Tema::getPrioridad));
        //SE IMPRIMEN EN ORDEN ASENDENTE
        System.out.println("\nTemas ordenados por prioridad ascendente:");
        for (Tema t : temas) {
            System.out.println(t);
        }

        //SE DECLARA EL ConcurrentHashMap
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        //SE AÑADEN ELEMENTOS
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matematicas basicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/medioambiente");
        //SE IMPRIMEN LOS ELEMENTOS
        System.out.println("\nRepositorio de recursos:");
        for (String clave : recursos.keySet()) {
            System.out.println(clave + " - " + recursos.get(clave));
        }
        
    }
    
}
