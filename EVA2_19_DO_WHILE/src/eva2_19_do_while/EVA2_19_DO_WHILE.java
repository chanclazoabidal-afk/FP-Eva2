/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_do_while;
import java.util.Scanner;
/**
 *
 * @author Erick
 */
public class EVA2_19_DO_WHILE {
 final static String USUARIO = "Erick";
    final static String PASSWORD = "8fdacd29.";
    
    public static void main(String[] args) {
       
        // 1. Pedir datos de acceso
        Scanner input = new Scanner(System.in);
        String usu, contra;

        // 2. Validar
        // Incorrecto = se vuelve a preguntar
        // Correcto = Acceso concedido
        do {
            System.out.println("Usuario:");
            usu = input.nextLine();
            System.out.println("Contraseña:");
            contra = input.nextLine();
        } while (!(usu.equals(USUARIO) && contra.equals(PASSWORD)));

        System.out.println("Acceso concedido");
    }
}