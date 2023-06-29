public class ejercicio15 {
    public static void main(String[] args) {
        char claseAuto = 'b';

        switch (claseAuto) {
            case 'a':
                System.out.println("Características del auto clase A:");
                System.out.println("- 4 ruedas");
                System.out.println("- Un motor");
                break;
            case 'b':
                System.out.println("Características del auto clase B:");
                System.out.println("- 4 ruedas");
                System.out.println("- Un motor");
                System.out.println("- Cierre centralizado");
                System.out.println("- Aire acondicionado");
                break;
            case 'c':
                System.out.println("Características del auto clase C:");
                System.out.println("- 4 ruedas");
                System.out.println("- Un motor");
                System.out.println("- Cierre centralizado");
                System.out.println("- Aire acondicionado");
                System.out.println("- Airbag");
                break;
            default:
                System.out.println("La clase del auto ingresada no es válida.");
                break;
        }
    }
}
