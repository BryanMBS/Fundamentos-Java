import java.util.Scanner;

public class Cuadrado {
    public static void main(String[] args) {

        int lado, resultadoarea, resultadoperimetro;
        Scanner obj = new Scanner(System.in);

        System.out.println("Ingrese el valor de un lado del cuadrado:");
        lado = obj.nextInt();

        resultadoarea = lado+lado+lado+lado;

        resultadoperimetro = (lado*lado);

        System.out.println("El resultado del area es:\t"+resultadoarea);
        System.out.println("El resultado del perimetro es:\t"+resultadoperimetro);

    }
}