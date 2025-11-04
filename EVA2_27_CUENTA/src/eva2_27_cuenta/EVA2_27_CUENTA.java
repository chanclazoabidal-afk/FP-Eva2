package eva2_27_cuenta;

import java.util.Scanner;

public class EVA2_27_CUENTA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo = 1000000; // EMPIEZA de 1,000,000 DE PESOS
        double retiro;

        System.out.println("=== SIMULADOR DE CUENTA BANCARIA ===");
        System.out.println("Saldo inicial: $" + saldo);

        // se repite mientras haya dinero en la cuenta
        while (saldo > 0) {
            System.out.print("¿Cuánto deseas retirar? $");
            retiro = input.nextDouble();

            saldo -= retiro; // resta el retiro al saldo

            System.out.println("Saldo restante:" + saldo);
            
            // Verificamos si ya no hay dinero o está en números rojos
            if (saldo <= 0) {
                System.out.println("Tu cuenta TRONO o quedó en BANCA ROTA.");
                break;
            }
        }

        ;
    }
}
