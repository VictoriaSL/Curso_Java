
package s8_reto_01;

public class TransicionSimple implements TransicionHistoria {
    
    @Override
    public String transicionar(String decision) {
        if ("izquierda".equalsIgnoreCase(decision)) {
            return "Has tomado el camino de la izquierda y encuentras un rio.";
        } else if ("derecha".equalsIgnoreCase(decision)) {
            return "Has tomado el camino de la derecha y ves una montaña.";
        } else {
            return "No decides y el tiempo pasa...";
        }
    }
} 