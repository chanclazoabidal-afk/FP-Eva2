/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_14_captura;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class EVA_2_14_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tama;
        System.out.println("cuantas calificaciones va a capturar?");
        tama=input.nextInt();
        int califas []=new int[tama];
        for(int i=0; i<califas.length; i++){
            System.out.println("calificacion"+(i+1)+":");
            califas[i]=input.nextInt();
        }
        
         
    }
    
}
