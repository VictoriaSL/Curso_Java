package s8_reto_01;

public class S8_Reto_01 {


     private final TransicionHistoria transicion;
    private final GestorDialogo gestorDialogo;
    private final LogicaDecision logicaDecision;

    public S8_Reto_01(TransicionHistoria transicion, GestorDialogo gestorDialogo, LogicaDecision logicaDecision) {
        this.transicion = transicion;
        this.gestorDialogo = gestorDialogo;
        this.logicaDecision = logicaDecision;
    }

    public void ejecutarEscena() {
        gestorDialogo.mostrarDialogo("Te encuentras en una encrucijada. Que haras?");
        String decision = logicaDecision.tomarDecision();
        String resultado = transicion.transicionar(decision);
        gestorDialogo.mostrarDialogo(resultado);
    }

    public static void main(String[] args) {
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo gestorDialogo = new DialogoTexto();
        LogicaDecision logicaDecision = new DecisionBinaria();
        S8_Reto_01 narrativa = new S8_Reto_01(transicion, gestorDialogo, logicaDecision);
        narrativa.ejecutarEscena();
    }
}
