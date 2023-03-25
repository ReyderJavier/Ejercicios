
package EjerciciosImpares;

import java.util.Scanner;
public class EjercicioN3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     
        System.out.print("Introduce un número entero: ");
        int num = scanner.nextInt();       
        int doble = num * 2;
        int triple = num * 3;     
        System.out.println("El doble de " + num + " es " + doble);
        System.out.println("El triple de " + num + " es " + triple);
    }
}
