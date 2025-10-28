/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_arreglos_multidim;

/**
 *
 * @author Erick
 */
public class EVA2_16_ARREGLOS_MULTIDIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int matriz[][] = new int[3][4]; // 3 filas, 4 columnas

        // Llenar con valores aleatorios
        for (int i = 0; i < matriz.length; i++) { // Filas
            for (int j = 0; j < 4; j++) { // Columnas
                matriz[i][j] = (int)(Math.random() * 100);
            }
        }

        // Imprimir matriz
        for (int i = 0; i < matriz.length; i++) { // Filas
            for (int j = 0; j < 4; j++) { // Columnas
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.println(matriz.length);        // = 3 → 3 filas
        System.out.println(matriz[0].length);     // la fila 0 tiene 4 columnas
        System.out.println(matriz[1].length);     // la fila 1 tiene 4 columnas
        System.out.println(matriz[2].length);     // la fila 2 tiene 4 columnas
    }
}