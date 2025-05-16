package s8_reto_01;

import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    @Override
    public String tomarDecision() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elige: izquierda o derecha: ");
        String decision = scanner.nextLine();
        // scanner.close(); // No cerramos para evitar cerrar System.in
        return decision;
    }
} 