package s5_ejemplo_2;

//Subclase: AutoAutonomo hereda de Vehiculo y usa composición
public class AutoAutonomo extends Vehiculo {
    
    //Estas son las clases de composicion 
    SensorGPS gps;
    Camara camara;
    SistemaIA ia;
    Motor motor;

    public AutoAutonomo(String marca) {
        super(marca);
        this.gps = new SensorGPS();
        this.camara = new Camara();
        this.ia = new SistemaIA();
        this.motor = new Motor();
    }

    public void iniciarAutonomia() {
        System.out.println("Modo autonomo activado.");
        gps.localizar();
        camara.detectarObstaculos();
        ia.tomarDecision();
        motor.arrancar();
    }
    
//Clases internas (composición)
    public class SensorGPS {
        public void localizar() {
        System.out.println("GPS: posicion actual obtenida.");
        }
    }

    public class Camara {
        public void detectarObstaculos() {
        System.out.println("Camara: obstaculos detectados en el camino.");
        }
    }   

    public class SistemaIA {
        public void tomarDecision() {
        System.out.println("IA: trayectoria calculada.");
         }
    }

    public class Motor {
     public void arrancar() {
        System.out.println("Motor: velocidad regulada y marcha iniciada.");
       }
    }
    
}