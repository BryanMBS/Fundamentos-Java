import java.util.Scanner;
    public class AreaTriangulo {
    
        public static void main(String [] args){
         
            double base, altura, resultado;     
            Scanner obj = new Scanner(System.in);
             
            System.out.print("Ingrese base del triangulo:\t");
            base = obj.nextDouble();
             
            System.out.print("Ingrese altura del triangulo:\t");
            altura = obj.nextDouble();
             
            resultado = ((base*altura)/2);
             
            System.out.print("El área del triangulo es:\t"+resultado);
            
        }
    }
