package s2_ejemplo_4;
import java.util.Scanner;

public class S2_Ejemplo_4 {

    //ESTRUCTURAS DE REPETICIÓN
    // WHILE, DO-WHILE , FOR , FOR-EACH
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String contraseñaCorrecta = "admin123";
        String input;
        int intentos = 0;
        int maxIntentos = 3;

        while (intentos < maxIntentos) {
            System.out.print("Ingresa tu contraseña: ");
            input = scanner.nextLine();

            if (input.equals(contraseñaCorrecta)) {
                System.out.println("Acceso concedido.");
                break;
            } else {
                System.out.println("Contraseña incorrecta.");
                intentos++;
            }
        }

        if (intentos == maxIntentos) {
            System.out.println("Cuenta bloqueada por demasiados intentos.");
        }

        scanner.close();
        
    }
}
