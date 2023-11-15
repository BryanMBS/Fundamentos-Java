import java.util.Scanner;

    public class Suma {
        public static void main(String [] args){
         
            int num1, num2, resultado;     
            Scanner obj = new Scanner(System.in);
             
            System.out.print("Ingrese el primer numero:\t");
            num1 = obj.nextInt();
             
            System.out.print("Ingrese el segundo numero:\t");
            num2 = obj.nextInt();
             
            resultado = (num1+num2);
             
            System.out.print("El resultado de la suma es:\t"+resultado);
        }

}
