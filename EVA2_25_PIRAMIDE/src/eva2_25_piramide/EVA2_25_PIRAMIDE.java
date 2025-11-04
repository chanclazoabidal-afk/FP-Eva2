package eva2_25_piramide;

import java.util.Scanner;

public class EVA2_25_PIRAMIDE {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor;

        System.out.print("Introduce un valor: ");
        valor = input.nextInt();

        // Ciclo para imprimir la pirámide AL REVEZ(EL CODE ANTERIOR PERO VOLTEADO)
        for (int i = valor; i >= 1; i--) { // controla las filas (de mayor a menor)
            for (int j = 1; j <= i; j++) { // imprime los asteriscos por fila
                System.out.print("*");
            }
            System.out.println(); // salto de línea
        }
    }
}
