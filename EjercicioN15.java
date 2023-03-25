package EjerciciosImpares;

import java.util.Scanner;
public class EjercicioN15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     
        System.out.print("Introduce un número entero N: ");
        int N = scanner.nextInt();     
        System.out.print("Introduce el número de cifras que deseas quitar a N: ");
        int m = scanner.nextInt();        
        int divisor = (int) Math.pow(10, m); // Calculamos el divisor necesario
        int resultado = N / divisor; // Obtenemos el cociente
        resultado *= divisor; // Multiplicamos el cociente por el divisor para obtener el resultado final        
        System.out.println("El resultado es: " + resultado);
    }
}