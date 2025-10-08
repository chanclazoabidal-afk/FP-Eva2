/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_12_tabla_multi;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class EVA_2_12_TABLA_MULTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inicial; 
        int multi; 
        
         System.out.print("INGRESA TU NUMEROI A MULTIPLICAR") ;
        
         inicial = input.nextInt();
         
          
         for (int i=0; i <= 10; i++) {
             multi = i*inicial;
             System.out.print(inicial);
             System.out.print("*");
             System.out.print(i);
             
                
               System.out.print("=") ;
                System.out.println(multi);//resultado de multiplicacion
                
            }
    }
    
}
