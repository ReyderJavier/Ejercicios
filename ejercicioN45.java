
package EjerciciosImpares;

import java.util.Scanner;

public class ejercicioN45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = input.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = input.nextInt();

        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }
    }
}