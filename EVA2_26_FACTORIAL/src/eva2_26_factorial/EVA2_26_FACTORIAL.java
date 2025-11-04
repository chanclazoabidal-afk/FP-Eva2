package eva2_26_factorial;

import java.util.Scanner;

public class EVA2_26_FACTORIAL {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int factorial = 1; // se inicia en 1 porque 0 por 0 da 0

        System.out.print("Introduce un número: ");
        numero = input.nextInt();

        // Cálculo del factorial con ciclo for
        for (int i = numero; i >= 1; i--) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
