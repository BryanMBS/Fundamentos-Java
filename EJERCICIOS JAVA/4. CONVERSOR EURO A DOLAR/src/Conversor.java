import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad en euros: ");
        double euros = scanner.nextDouble();

        double tasaDeCambio = 1.07;

        double dolares = euros * tasaDeCambio;

        System.out.println(euros + " euros son equivalentes a " + dolares + " dólares.");

        scanner.close();
    }
}