/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_busqueda;
import java.util.Scanner;
/**
 *
 * @author Erick
 */
public class EVA2_23_BUSQUEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner captu = new Scanner(System.in);
        int valor, posi = -1; // -1 significa que no lo encontramos
        int datos[] = new int[10];

        // Llenar el arreglo con valores aleatorios
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int)(Math.random() * 100);
        }

        // Mostrar los valores del arreglo
        for (int i = 0; i < datos.length; i++) {
            System.out.print("[" + datos[i] + "]");
        }

        System.out.println();
        System.out.print("Valor a buscar: ");
        valor = captu.nextInt();

        // Búsqueda lineal
        for (int i = 0; i < datos.length; i++) {
            if (valor == datos[i]) {
                posi = i; // Guardamos la posición donde lo encontramos
                break;    // Salimos del ciclo si ya lo encontramos
            }
        }

        // Mostrar resultado
        if (posi == -1) {
            System.out.println("El valor no se encontró.");
        } else {
            System.out.println("Valor encontrado en la posición: " + posi);
        }
    }
}