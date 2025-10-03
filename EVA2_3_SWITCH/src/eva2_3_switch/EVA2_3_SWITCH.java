/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_switch;

/**
 *
 * @author Erick
 */
public class EVA2_3_SWITCH {

   public static void main(String[] args) {
        String dia = "Lunes";

        switch(dia) { //Switch no acepta double, ni booleano
            case "Lunes":
                System.out.println("1");
                break;
            case "Martes":
                System.out.println("2");
                break;
            default:
                System.out.println("Dia no existente");
        }
    }
}
