import java.util.Scanner;

public class ContadorVocalesConsonantes {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String continuar;

        do {

            System.out.println("\n===== CONTADOR DE VOCALES Y CONSONANTES =====");

            System.out.print("Ingrese una palabra en minúsculas: ");
            String palabra = entrada.nextLine();

            
            if (!palabra.equals(palabra.toLowerCase())) {

                System.out.println("Error: la palabra debe estar escrita en minúsculas.");

            } else {

                int vocales = 0;
                int consonantes = 0;

                
                for (int i = 0; i < palabra.length(); i++) {

                    char letra = palabra.charAt(i);

                    if (letra == 'a' || letra == 'e' || letra == 'i'
                            || letra == 'o' || letra == 'u') {

                        vocales++;

                    } else {

                        consonantes++;
                    }
                }

                System.out.println("Número de vocales: " + vocales);
                System.out.println("Número de consonantes: " + consonantes);
            }

            System.out.print("\n¿Desea ingresar otra palabra? (si/no): ");
            continuar = entrada.nextLine();

        } while (continuar.equalsIgnoreCase("si"));

        System.out.println("\nPrograma finalizado.");

        entrada.close();
    }
}