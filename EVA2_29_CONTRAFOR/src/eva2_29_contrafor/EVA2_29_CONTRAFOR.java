/*
 * Programa que pide usuario y contraseña y verifica si son correctos.
 * Autor: Erick
 */
package eva2_29_contrafor;

import java.util.Scanner;

public class EVA2_29_CONTRAFOR {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for (int i = 1; i <=4; i++) {
        // Usuario y contraseña correctos
        String usuarioCorrecto = "ERICK";
        String contrasenaCorrecta = "8fdacd29.";
        
        // Pedir datos al usuariofor (int i = 1; i <=4; i++) {
        System.out.print("Ingresa tu usuario: ");
        String usuario = input.nextLine();
        
        System.out.print("Ingresa tu contraseña: ");
        String contrasena = input.nextLine();
       
     
        if (usuario.equals(usuarioCorrecto) && contrasena.equals(contrasenaCorrecta)) {
            System.out.println("Acceso permitido. Bienvenido " + usuario + "!");
           break;
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        } 
    }
}}
