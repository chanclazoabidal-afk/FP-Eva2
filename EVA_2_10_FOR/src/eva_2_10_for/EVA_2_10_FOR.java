/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_10_for;
import java.util.Scanner;
/**
 *
 * @author Erick
 */
public class EVA_2_10_FOR {

     
    
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;

        System.out.println("EN QUE ORDEN?");
        System.out.println("1 = Del 1 al 100");
        System.out.println("2 = Del 100 al 1");
        System.out.println("3 = numeros pares del 1 al 100");
        opcion = input.nextInt();

        if (opcion == 1) {
            for (int i = 1; i <= 100; i++) {
                System.out.println(i);
            }
        } if (opcion == 2) {
            for (int i = 100; i >= 1; i--) {
                System.out.println(i);}}
            
            
           if (opcion == 3) {
    for (int i = 1; i <= 100; i++) {
        if (i % 2 == 0) {
            System.out.println(i);
        }
    }}
            
                
                  
        }}
            
        
    
