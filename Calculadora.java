import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double numero1;
        double numero2;
        double resultado;

        int opcion;

        System.out.println("===== CALCULADORA BÁSICA =====");

        System.out.print("Ingrese el primer número: ");
        numero1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        numero2 = entrada.nextDouble();

        System.out.println("\nSeleccione una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        System.out.print("Ingrese una opción: ");
        opcion = entrada.nextInt();

        switch (opcion) {

            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado de la suma: " + resultado);
                break;

            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado de la resta: " + resultado);
                break;

            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado de la multiplicación: " + resultado);
                break;

            case 4:

                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado de la división: " + resultado);
                } else {
                    System.out.println("Error: no se puede dividir entre cero.");
                }

                break;

            default:
                System.out.println("Opción no válida.");
        }

        entrada.close();
    }
}