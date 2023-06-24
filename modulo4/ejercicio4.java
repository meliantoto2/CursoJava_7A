import java.util.Scanner;

public class RelacionFamiliar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una categoría (a, b o c): ");
        String categoria = scanner.nextLine();

        String relacion = "";

        switch (categoria.toLowerCase()) {
            case "a" -> relacion = "hijo";
            case "b" -> relacion = "padres";
            case "c" -> relacion = "abuelos";
            default -> relacion = "Categoría inválida";
        }

        System.out.println("La relación correspondiente es: " + relacion);

        scanner.close();
    }
}