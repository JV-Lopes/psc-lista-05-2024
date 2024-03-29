import java.util.Scanner;

public class Termômetro {
    public static void main(String[] args) {
        final int NUM_TEMPERATURAS = 12;
        final int TEMPERATURA_MIN = 4;
        final int TEMPERATURA_MAX = 10;

        Scanner scanner = new Scanner(System.in);
        double somaTemperaturas = 0;

        for (int i = 0; i < NUM_TEMPERATURAS; i++) {
            double temperatura;
            do {
                System.out.print("Digite a temperatura " + (i + 1) + " (entre 4ºC e 10ºC): ");
                temperatura = scanner.nextDouble();
                if (temperatura < TEMPERATURA_MIN || temperatura > TEMPERATURA_MAX) {
                    System.out.println("Temperatura inválida. Por favor, digite uma temperatura entre 4ºC e 10ºC.");
                }
            } while (temperatura < TEMPERATURA_MIN || temperatura > TEMPERATURA_MAX);
            
            somaTemperaturas += temperatura;
        }

        double mediaTemperaturas = somaTemperaturas / NUM_TEMPERATURAS;
        System.out.println("A média das temperaturas de hoje é: " + mediaTemperaturas + "ºC");

        scanner.close();
    }
}
