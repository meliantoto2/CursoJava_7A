import java.util.Scanner;

public class DeterminarPuesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el puesto obtenido en el torneo: ");
        int puesto = scanner.nextInt();

        String mensaje = determinarMensajePuesto(puesto);

        System.out.println(mensaje);

        scanner.close();
    }

    public static String determinarMensajePuesto(int puesto) {
        String mensaje = "";

        if (puesto == 1) {
            mensaje = "El primero obtiene la medalla de oro.";
        } else if (puesto == 2) {
            mensaje = "El segundo obtiene la medalla de plata.";
        } else if (puesto == 3) {
            mensaje = "El tercero obtiene la medalla de bronce.";
        } else {
            mensaje = "Siga participando.";
        }

        return mensaje;
    }
}