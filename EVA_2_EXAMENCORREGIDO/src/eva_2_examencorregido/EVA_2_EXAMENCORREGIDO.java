/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_examencorregido;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class EVA_2_EXAMENCORREGIDO {

      final static String PWD = "1234";   // Contraseña
    final static int SALDO_INICIAL = 5000;  // Saldo inicial
    final static String CASO1 = "1";    // Consultar saldo
    final static String CASO2 = "2";    // Retirar
    final static String CASO3 = "3";    // Depositar
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String contra, pulsaste;
        int saldo = SALDO_INICIAL; // variable de trabajo para saldo
        int retirar, depositar;

        System.out.println("Bienvenido");
        System.out.print("Ingresa tu Contraseña: ");
        contra = input.nextLine();

        if (contra.equals(PWD)) {
            System.out.println("ACCESO PERMITIDO");
            System.out.println("Presiona: ");
            System.out.println("1  Consultar saldo");
            System.out.println("2  Retirar dinero");
            System.out.println("3  Depositar dinero");
            pulsaste = input.nextLine();

            if (pulsaste.equals(CASO2)) {
                System.out.print("Cuánto vas a retirar?: ");
                retirar = input.nextInt();
                if (retirar <= saldo) {
                    saldo -= retirar;
                    System.out.println("Retiro exitoso. Tu nuevo saldo es: " + saldo);
                } else {
                    System.out.println("Fondos insuficientes.");
                }
            }

            if (pulsaste.equals(CASO3)) {
                System.out.print("Cuánto vas a depositar?: ");
                depositar = input.nextInt();
                saldo += depositar;
                System.out.println("Depósito exitoso. Tu nuevo saldo es: " + saldo);
            }

            if (pulsaste.equals(CASO1)) {
                System.out.println("Tu saldo es: " + saldo);
            }

        } else {
            System.out.println("ACCESO NEGADO");
        }

         
    }
}