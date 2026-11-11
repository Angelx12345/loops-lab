package programming.loops;

import java.util.Scanner;

/**
 * Programa de consola con un menú que se repite (do-while) y usa los métodos de Loops.
 * Ya está completo: no lo modifiques. Ejecútalo cuando completes los métodos.
 */
public class LoopsApp {

    public static void main(String[] args) {
        final int EXIT_OPTION = 0;
        Scanner input = new Scanner(System.in);
        int option;
        do {
            System.out.println();
            System.out.println("1. Factorial  2. ¿Es primo?  3. Número al revés  4. Binario");
            System.out.println("5. Tabla de multiplicar  6. Triángulo  0. Salir");
            System.out.print("Opción: ");
            option = input.nextInt();
            if (option == EXIT_OPTION) {
                break;
            }
            System.out.print("Número: ");
            int number = input.nextInt();
            switch (option) {
                case 1 -> System.out.println(number + "! = " + Loops.factorial(number));
                case 2 -> System.out.println(Loops.isPrime(number) ? "Es primo" : "No es primo");
                case 3 -> System.out.println("Al revés: " + Loops.reverse(number));
                case 4 -> System.out.println("Binario: " + Loops.toBinary(number));
                case 5 -> System.out.print(Loops.multiplicationTable(number));
                case 6 -> System.out.print(Loops.triangle(number));
                default -> System.out.println("Opción inválida");
            }
        } while (true);
        System.out.println("Hasta luego");
    }
}
