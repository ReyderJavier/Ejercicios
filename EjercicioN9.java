
package EjerciciosImpares;

import java.util.Scanner;
public class EjercicioN9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Introduce la longitud del primer lado: ");
        double lado1 = scanner.nextDouble();      
        System.out.print("Introduce la longitud del segundo lado: ");
        double lado2 = scanner.nextDouble();        
        System.out.print("Introduce la longitud del tercer lado: ");
        double lado3 = scanner.nextDouble();    
        double s = (lado1 + lado2 + lado3) / 2;
        double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        System.out.println("El área del triángulo es " + area);
    }
}