
package EjerciciosImpares;

import java.util.Scanner;
public class EjercicioN21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        
        if(num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if(num2 > num1) {
            System.out.println(num2 + " es mayor que " + num1);
        } else {
            System.out.println(num1 + " y " + num2 + " son iguales.");
        }
    }
}