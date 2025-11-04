package eva2_28_primo;

import java.util.Scanner;

public class EVA2_28_PRIMO {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        boolean esPrimo = true; //que el número es primo

        System.out.print("Introduce un número: ");
        numero = input.nextInt();

        // Un número menor o igual a 1 no es primo
        if (numero <= 1) {
            esPrimo = false;
        } else {
            // Revisar si tiene divisores distintos de 1 y de sí mismo PQ ESTA ES LA REGLA DE UN NUMERO PRIMO
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        // Mostrar resultado
        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " NO es un número primo.");
        }
    }
}
