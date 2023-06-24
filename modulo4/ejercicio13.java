import java.util.Scanner;

public class DeterminarDiasMesSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre del mes: ");
        String nombreMes = scanner.nextLine();

        int dias = determinarDiasMes(nombreMes);

        if (dias != -1) {
            System.out.println("El mes " + nombreMes + " tiene " + dias + " días.");
        } else {
            System.out.println("El nombre del mes ingresado no es válido.");
        }

        scanner.close();
    }

    public static int determinarDiasMes(String nombreMes) {
        int dias;

        switch (nombreMes.toLowerCase()) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                dias = 31;
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                dias = 30;
                break;
            case "febrero":
                dias = 28;
                break;
            default:
                dias = -1;
                break;
        }

        return dias;
    }
}