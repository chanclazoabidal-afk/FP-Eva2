/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_triangul0;

import java.util.Scanner;

public class EVA2_24_TRIANGUL0 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor;

        System.out.print("Introduce un valor: ");//PON EL NUMERO QUE ES DE DONDE VA A INICIAR
        valor = input.nextInt();

        // Ciclo para imprimir el triángulo
        for (int i = 1; i <= valor; i++) { // controla las filas
            for (int j = 1; j <= i; j++) { // imprime los asteriscos por fila
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}
