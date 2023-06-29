import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de curso: ");
        int curso = scanner.nextInt();

        String mensaje;

        if (curso == 0) {
            mensaje = "Jardín de infantes";
        } else if (curso >= 1 && curso <= 6) {
            mensaje = "Primaria";
        } else if (curso >= 7 && curso <= 12) {
            mensaje = "Secundaria";
        } else {
            mensaje = "Curso inválido";
        }

        System.out.println(mensaje);

        scanner.close();
    }
}
