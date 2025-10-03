/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_arreglos_string;

import java.util.Scanner;

public class EVA2_5_ARREGLOS_STRING {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String diasSemana[] = new String[7]; //se declara el arreglo de tipo string y que almacene 7 valores
        int dia;

        diasSemana[0] = "Domingo";
        diasSemana[1] = "Lunes";
        diasSemana[2] = "Martes";
        diasSemana[3] = "Miercoles";
        diasSemana[4] = "Jueves";
        diasSemana[5] = "Viernes";
        diasSemana[6] = "Sabado";

        System.out.print("Numero del dia de la semana (0-6): ");
        dia = input.nextInt();
        System.out.println("El dia es: " + diasSemana[dia]); //con que el dia dado sea del 0-6, se da el día correcto
    }
}
