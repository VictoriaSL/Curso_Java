package s5_reto_01;

// Subclase Ambulancia
class Ambulancia extends UnidadEmergencia {
    //ATRIBUTOS
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;
    
    //CONSTRUCTOR
    public Ambulancia(String nombre, String operadorNombre) {
        super(nombre);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(operadorNombre);
    }
    //METODO INICICIAR OPERACION (MANDA A LLAMAR LOS DATOS DE LAS CLASES AUXILIARES)
    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
        System.out.println();
    }
    //HEDERO DE UNIDAD EMERGENCIA
    @Override
    public void responder() {
        System.out.println("Ambulancia en camino al hospital mas cercano.");
    }
}
