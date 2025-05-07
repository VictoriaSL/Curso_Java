package s5_reto_01;

// Subclase UnidadBomberos
class UnidadBomberos extends UnidadEmergencia {
    //ATRIBUTOS 
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    //CONSTRUCTOR CON PARAMETROS
    public UnidadBomberos(String nombre, String operadorNombre) {
        super(nombre);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(operadorNombre);
    }
    //MUESTRA LOS DATOS DE LA SCLASES AUXILIARES
    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
        System.out.println();
    }
    //SE HEDERA DE UNIDAD EMERGENCIA
    @Override
    public void responder() {
        System.out.println("Unidad de bomberos respondiendo a incendio estructural.");
    }
}

