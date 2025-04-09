package s2_reto_02;

import java.util.Scanner;

public class S2_Reto_02 {

    public static void main(String[] args) {
        
        //scanner 
        Scanner leer = new Scanner(System.in);
        
        //ATRIBUTOS
        var saldo = 1000.0;
        int op = 0;
         
         do {
             System.out.println("");
             //MENU
             System.out.println("ELIGE UNA OPCION");
             System.out.println("1. Consultar saldo");
             System.out.println("2. Depositar");
             System.out.println("3. Retirar");
             System.out.println("4. Salir");
             System.out.println("----ELIJE UNA OPCION----");
             
             //SCANNER
             op = leer.nextInt();
             
             //SWICH 
             switch(op){
             case 1: 
                 System.out.println("SALDO ACTUAL: $"+saldo);
                 break;
             case 2:
                    System.out.println("MONTO A DEPOSITAR: ");
                     double montoDeposito = leer.nextDouble();
                    double deposito = (saldo + montoDeposito);  
                    System.out.println("Saldo Total: $"+deposito);
                 break;
             case 3:
                 System.out.println("MONTO A RETIRAR: ");
                 double montoRetiro = leer.nextDouble();
                    if (montoRetiro <= saldo ) {
                        double retiro = (saldo - montoRetiro);  
                         System.out.println("Saldo Total: $"+retiro);
                    }else{
                         System.out.println("NO HAY SUFCIENTE SALDO");
                         System.out.println("Saldo Actual: $"+saldo);
                    }
                    break;
             case 4 :
                 System.out.println("HA SALIDO :D");
                 break;
         }
        } while (op != 4);
         
        
         
         
       /* while(op>0 && op <= 3){
        
        if (op == 1) {
            System.out.println("SALDO ACTUAL: $"+saldo);
        } else if (op == 2) {
                 System.out.println("MONTO A DEPOSITAR: ");
                 double montoDeposito = leer.nextDouble();
                 double deposito = (saldo + montoDeposito);  
                 System.out.println("Saldo Total: $"+deposito);
        } else if (op == 3) {
                System.out.println("MONTO A RETIRAR: ");
                double montoRetiro = leer.nextDouble();
                    if (montoRetiro <= saldo ) {
                        double retiro = (saldo - montoRetiro);  
                         System.out.println("Saldo Total: $"+retiro);
                    }else{
                         System.out.println("NO HAY SUFCIENTE SALDO");
                         System.out.println("Saldo Actual: $"+saldo);
            }
       } 
       } 
        System.out.println("HA SALIDO");
         */
                            
    }
    
}
