import java.util.Scanner;

public class Areayvolcilindroo {
    public static void main(String[] args) throws Exception {

        Double radio, PI, altura, area, volumen, resultadoarea, resultadovolumen;
        Scanner obj = new Scanner(System.in);

        System.out.println("Ingrese el radio del cilindro:");
        radio = obj.nextDouble();

        System.out.println("ingrese la altura del cilindro");
        altura = obj.nextDouble();

        PI = 3.1416;

        resultadoarea = (2*PI*radio*(radio+altura));

        resultadovolumen =(PI*(radio*radio)*altura);

        System.out.println("El area del cilindro es: \t"+resultadoarea);

        System.out.println("El volumen del cilindro es: \t"+resultadovolumen);
    
    }
}
