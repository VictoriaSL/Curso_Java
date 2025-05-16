package s8_reto_02;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;


public class S8_Reto_02 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        Set<Integer> consumos = new HashSet<>();
        int cantidadServidores = 5; // Puedes cambiar la cantidad de servidores a monitorear
        int contador = 0;
        try {
            while (contador < cantidadServidores) {
                System.out.print("Ingresa el consumo de CPU del servidor " + (contador + 1) + " (%): ");
                String entrada = scanner.nextLine();
                int consumo;
                try {
                    consumo = Integer.parseInt(entrada);
                } catch (NumberFormatException e) {
                    System.out.println("Error: El valor debe ser numérico.");
                    continue;
                }
                if (consumo < 0 || consumo > 100) {
                    System.out.println("Error: El valor debe estar entre 0 y 100.");
                    continue;
                }
                if (consumos.contains(consumo)) {
                    System.out.println("Error: El valor ya fue registrado (duplicado).");
                    continue;
                }
                if (consumo > 95) {
                    throw new ConsumoCriticoException("Consumo crítico detectado: " + consumo + "%");
                }
                consumos.add(consumo);
                System.out.println("Consumo registrado correctamente.");
                contador++;
            }
            System.out.println("\nTodos los consumos registrados: " + consumos);
        } catch (ConsumoCriticoException e) {
            System.out.println("ALERTA: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Recursos liberados. Monitoreo finalizado.");
        }
    }
    
}
