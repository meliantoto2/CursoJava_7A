import java.util.Random;

public class ejercicio19 {
    public static void main(String[] args) {
        Random random = new Random();
        int contador = 0;
        int suma = 0;

        while (contador < 10) {
            int numero = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
            System.out.println("Número " + (contador + 1) + ": " + numero);
            suma += numero;
            contador++;
        }

        double promedio = (double) suma / 10;

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
