
package EjerciciosImpares;

import java.util.Scanner;
public class EjercicioN5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Introduce el valor del radio de la circunferencia: ");
        double radio = scanner.nextDouble();        
        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);        
        System.out.println("La longitud de la circunferencia es " + longitud);
        System.out.println("El área de la circunferencia es " + area);
    }
}