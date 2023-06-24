import java.util.Scanner;

public class DeterminarPuestoTorneoSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el puesto del participante: ");
        int puesto = scanner.nextInt();

        String mensaje = determinarMedalla(puesto);

        System.out.println(mensaje);

        scanner.close();
    }

    public static String determinarMedalla(int puesto) {
        String medalla;

        switch (puesto) {
            case 1:
                medalla = "Medalla de oro";
                break;
            case 2:
                medalla = "Medalla de plata";
                break;
            case 3:
                medalla = "Medalla de bronce";
                break;
            default:
                medalla = "Siga participando";
                break;
        }

        return medalla;
    }
}