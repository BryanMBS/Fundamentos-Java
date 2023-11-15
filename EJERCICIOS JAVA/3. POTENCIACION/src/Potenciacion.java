import java.util.Scanner;

/**
 * Potenciacion
 */
public class Potenciacion {

    public static void main(String[] args) {
        
          double numero, potencia, resultado;     
            Scanner obj = new Scanner(System.in);
             
            System.out.print("Ingrese el numero:\t");
            numero = obj.nextDouble();
             
            resultado = (numero*numero);
             
            System.out.print("El resultado de numero elevado al cuadrado es:\t"+resultado);


    }
}