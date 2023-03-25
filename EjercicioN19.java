package EjerciciosImpares;

import java.util.Scanner;
public class EjercicioN19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        System.out.print("Introduce un número entero: ");
        int num = scanner.nextInt();        
        if(num % 10 == 0) {
            System.out.println(num + " es múltiplo de 10.");
        } else {
            System.out.println(num + " no es múltiplo de 10.");
        }
    }
}