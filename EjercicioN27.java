
package EjerciciosImpares;

import java.util.Scanner;

public class EjercicioN27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un primer carácter: ");
        char ch1 = scanner.next().charAt(0);
        
        System.out.print("Introduce un segundo carácter: ");
        char ch2 = scanner.next().charAt(0);
        
        if(ch1 >= 'a' && ch1 <= 'z' && ch2 >= 'a' && ch2 <= 'z') {
            System.out.println("Ambos caracteres son letras minúsculas.");
        } else {
            System.out.println("Al menos uno de los caracteres no es una letra minúscula.");
        }
    }
}