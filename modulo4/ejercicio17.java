import java.util.Scanner;

public class EvaluacionAlumno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la primera evaluación: ");
        int evaluacion1 = scanner.nextInt();

        System.out.print("Ingresa la segunda evaluación: ");
        int evaluacion2 = scanner.nextInt();

        System.out.print("Ingresa la tercera evaluación: ");
        int evaluacion3 = scanner.nextInt();

        int suma = evaluacion1 + evaluacion2 + evaluacion3;
        int promedio = suma / 3;

        String resultado = (promedio >= 7) ? "Aprobado" : "Reprobado";

        System.out.println("El promedio del alumno es: " + promedio);
        System.out.println("Estado: " + resultado);

        scanner.close();
    }
}