package EjerciciosImpares;

import java.util.Scanner;
public class EjercicioN23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Introduce un número entero: ");
        int num = scanner.nextInt();        
        if(num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " es múltiplo de tres y de cinco.");
        } else {
            System.out.println(num + " no es múltiplo de tres y de cinco.");
        }
    }
}