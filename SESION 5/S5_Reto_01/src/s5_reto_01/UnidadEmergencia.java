
package s5_reto_01;

// Clase abstracta UnidadEmergencia
public abstract class UnidadEmergencia {
    //ATRIBUTO
    protected String nombre;

    public UnidadEmergencia(String nombre) {
        this.nombre = nombre;
    }
    
    //METODO ABSTRACTO 
    public abstract void responder();

    
    public void activarUnidad() {
        System.out.println("Activando unidad: " + nombre);
    }
}



