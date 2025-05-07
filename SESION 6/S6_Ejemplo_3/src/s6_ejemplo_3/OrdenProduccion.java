package s6_ejemplo_3;

// Clase que representa una orden de producción
class OrdenProduccion implements Comparable<OrdenProduccion> {
    
    //ATRIBUTOS
    String codigo;
    String producto;
    int prioridad;
    
    //CONTRUCTOR CON PARAMETROS
    public OrdenProduccion(String codigo, String producto, int prioridad) {
        this.codigo = codigo;
        this.producto = producto;
        this.prioridad = prioridad;
    }

    // Orden natural: por nombre del producto (alfabético)
    //ORDENA LOS ELEMENTOS POR ORDEN ALFABETICO LOS PRODUCTOS
    @Override
    public int compareTo(OrdenProduccion otra) {
        return this.producto.compareTo(otra.producto);
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + " | Producto: " + producto + " | Prioridad: " + prioridad;
    }
}
