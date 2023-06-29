import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Competidor 1: Ingresa tu elección (0 - piedra, 1 - papel, 2 - tijera): ");
        int eleccion1 = scanner.nextInt();

        System.out.print("Competidor 2: Ingresa tu elección (0 - piedra, 1 - papel, 2 - tijera): ");
        int eleccion2 = scanner.nextInt();

        String ganador = determinarGanador(eleccion1, eleccion2);

        System.out.println("El ganador es: " + ganador);

        scanner.close();
    }

    public static String determinarGanador(int eleccion1, int eleccion2) {
        if (eleccion1 == eleccion2) {
            return "Empate";
        } else if ((eleccion1 == 0 && eleccion2 == 2) || (eleccion1 == 1 && eleccion2 == 0) || (eleccion1 == 2 && eleccion2 == 1)) {
            return "Competidor 1";
        } else {
            return "Competidor 2";
        }
    }
}
