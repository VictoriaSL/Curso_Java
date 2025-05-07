package s5_reto_01;

// Subclase Patrulla
class Patrulla extends UnidadEmergencia {
    
    //ATRIBUTOS
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    //CONSTRUCTOR CON PARAMETROS
    public Patrulla(String nombre, String operadorNombre) {
        super(nombre);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(operadorNombre);
    }
    //LLAMA A METODOS AUXILIARES 
    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
        System.out.println();
    }
    //HEDERA DE UNIDADEMERGENCIA
    @Override
    public void responder() {
        System.out.println("Patrulla atendiendo situacion de seguridad ciudadana.");
    }
}