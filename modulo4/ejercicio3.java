import java.util.Scanner;

public class CantidadDiasMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre de un mes: ");
        String nombreMes = scanner.nextLine();

        int cantidadDias;

        switch (nombreMes.toLowerCase()) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                cantidadDias = 31;
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                cantidadDias = 30;
                break;
            case "febrero":
                cantidadDias = 28;
                break;
            default:
                cantidadDias = -1;
                break;
        }

        if (cantidadDias != -1) {
            System.out.println(nombreMes + " tiene " + cantidadDias + " días.");
        } else {
            System.out.println("El nombre del mes ingresado es inválido.");
        }

        scanner.close();
    }
}