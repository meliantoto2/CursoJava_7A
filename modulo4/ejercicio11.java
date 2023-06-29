import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un carácter: ");
        char caracter = scanner.next().charAt(0);

        boolean esVocal = esVocal(caracter);

        if (esVocal) {
            System.out.println("El carácter ingresado es una vocal.");
        } else {
            System.out.println("El carácter ingresado no es una vocal.");
        }

        scanner.close();
    }

    public static boolean esVocal(char caracter) {
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'
                || caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U';
    }
}
