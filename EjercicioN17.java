package EjerciciosImpares;

import java.util.Scanner;
public class EjercicioN17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      
        System.out.print("Introduce un número entero: ");
        int num = scanner.nextInt();
        
        if(num % 2 == 0) {
            System.out.println(num + " es un número par.");
        } else {
            System.out.println(num + " es un número impar.");
        }
    }
}