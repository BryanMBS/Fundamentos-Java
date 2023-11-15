import java.util.Scanner;

public class Radioycircun {
    public static void main(String[] args) throws Exception {
        Double radio, circunferencia, PI, longitud, area, resultadoarea, resultadolongitud;
        Scanner obj = new Scanner(System.in);

        System.out.println("Ingrese el radio del circulo:");
       radio = obj.nextDouble();

       PI = 3.1416;

       resultadoarea = (PI*(radio*radio));

       resultadolongitud = (2*PI*radio);

       System.out.println("El resultado del area de la circunferencia es: \t" +resultadoarea);
       System.out.println("El resultado de la longitud de la circunferencia es: \t" +resultadolongitud);


    }
}
