
package EjerciciosImpares;

import java.util.Scanner;
public class EjercicioN7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      
        System.out.print("Introduce la longitud del primer cateto: ");
        double cateto1 = scanner.nextDouble();        
        System.out.print("Introduce la longitud del segundo cateto: ");
        double cateto2 = scanner.nextDouble();
                double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        
        System.out.println("La longitud de la hipotenusa es " + hipotenusa);
    }
}