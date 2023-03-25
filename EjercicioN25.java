
package EjerciciosImpares;

import java.util.Scanner;

public class EjercicioN25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        System.out.print("Introduce un carácter: ");
        char ch = scanner.next().charAt(0);   
        if(ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " es una letra mayúscula.");
        } else {
            System.out.println(ch + " no es una letra mayúscula.");
        }
    }
}