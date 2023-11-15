import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) throws Exception {
        Double num1, num2, num3, resultadomedia;
        Scanner obj = new Scanner(System.in);

        System.out.println("Ingrese el primer numero:");
        num1 = obj.nextDouble();

        System.out.println("Ingrese el segundo numero:");
        num2 = obj.nextDouble();

        System.out.println("Ingrese el tercer numero:");
        num3 = obj.nextDouble();

        resultadomedia = ((num1+num2+num3)/3);

        System.out.println("El resultado de la media es:\t"+resultadomedia);
    }
}
