import java.util.Scanner;

public class InvertirCadena {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String continuar;

        do {

            System.out.println("\n===== INVERTIR CADENA =====");

            System.out.print("Ingrese una cadena de texto: ");
            String texto = entrada.nextLine();

            String textoInvertido = "";

            // Recorrer la cadena desde el último carácter hasta el primero
            for (int i = texto.length() - 1; i >= 0; i--) {

                textoInvertido = textoInvertido + texto.charAt(i);
            }

            System.out.println("Texto original: " + texto);
            System.out.println("Texto invertido: " + textoInvertido);

            System.out.print("\n¿Desea ingresar otra cadena? (si/no): ");
            continuar = entrada.nextLine();

        } while (continuar.equalsIgnoreCase("si"));

        System.out.println("\nPrograma finalizado.");

        entrada.close();
    }
}