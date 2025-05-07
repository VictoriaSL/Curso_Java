package s5_reto_01;

// Clase auxiliar Operador
class Operador {
    //ATRIBUTO
    private String nombre;

    public Operador(String nombre) {
        this.nombre = nombre;
    }
    //METODO QUE MUESTRA EL NOMBRE DEL OPERADOR
    public void reportarse() {
        System.out.println("Operador " + nombre + " reportandose.");
    }
}