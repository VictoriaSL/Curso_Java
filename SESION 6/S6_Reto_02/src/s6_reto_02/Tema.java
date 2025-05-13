package s6_reto_02;

public class Tema implements Comparable<Tema> {
    
    //ATRIBUTOS
    String titulo;
    int prioridad;

    //CONSTRUCTOR
    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }
    //GETTERS
    public String getTitulo() {
        return titulo;
    }

    public int getPrioridad() {
        return prioridad;
    }
    //COMPARE TO CON TEMA.    
    @Override
    public int compareTo(Tema otra) {
        //COMPARA EL TITULO
        return this.titulo.compareTo(otra.titulo);
    }

    @Override
    public String toString() {
        return "Tema: " + "titulo=" + titulo + ", prioridad=" + prioridad;
    }
    
    
    
}
