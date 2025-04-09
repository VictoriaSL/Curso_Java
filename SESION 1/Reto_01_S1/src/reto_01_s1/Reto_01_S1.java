package reto_01_s1;
import java.util.Scanner;

public class Reto_01_S1 {

    public static void main(String[] args) {
        //SINTAXIS DE Scanner
        Scanner sc = new Scanner(System.in);
        
        //String Nombre = sc.next();
        //int Edad = sc.nextInt();
        //String NExpediente = sc.next();
        
        Paciente paciente = new Paciente(sc.next(),sc.nextInt(),sc.next());
        paciente.mostrarInformacion();

    }
}
