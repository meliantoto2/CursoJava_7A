public class ejercicio22 {
    public static void main(String[] args) {
        int contador = 1;

        while (contador <= 10) {
            System.out.println("Empleado " + contador + ":");

            // Generar categoría aleatoria
            String categoria = generarCategoriaAleatoria();

            // Generar antigüedad aleatoria
            int antiguedad = generarAntiguedadAleatoria();

            // Generar sueldo bruto aleatorio
            double sueldoBruto = generarSueldoBrutoAleatorio();

            // Calcular sueldo neto
            double sueldoNeto = calcularSueldoNeto(categoria, antiguedad, sueldoBruto);

            // Mostrar resultados
            System.out.println("Categoría: " + categoria);
            System.out.println("Antigüedad: " + antiguedad + " años");
            System.out.println("Sueldo bruto: " + sueldoBruto);
            System.out.println("Sueldo neto: " + sueldoNeto);
            System.out.println();

            contador++;
        }
    }

    public static String generarCategoriaAleatoria() {
        String[] categorias = {"A", "B", "C"};
        int indiceAleatorio = (int) (Math.random() * categorias.length);
        return categorias[indiceAleatorio];
    }

    public static int generarAntiguedadAleatoria() {
        return (int) (Math.random() * 15) + 1; // Rango de 1 a 15 años
    }

    public static double generarSueldoBrutoAleatorio() {
        return Math.random() * 10000; // Rango de 0 a 10000
    }

    public static double calcularSueldoNeto(String categoria, int antiguedad, double sueldoBruto) {
        double sueldoNeto = sueldoBruto;

        switch (categoria) {
            case "A":
                sueldoNeto += 1000;
                break;
            case "B":
                sueldoNeto += 2000;
                break;
            case "C":
                sueldoNeto += 3000;
                break;
            default:
                System.out.println("Categoría inválida.");
                return 0;
        }

        if (antiguedad >= 1 && antiguedad <= 5) {
            sueldoNeto += sueldoBruto * 0.05;
        } else if (antiguedad >= 6 && antiguedad <= 10) {
            sueldoNeto += sueldoBruto * 0.10;
        } else if (antiguedad > 10) {
            sueldoNeto += sueldoBruto * 0.30;
        }

        return sueldoNeto;
    }
}
