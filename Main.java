package EjerciciosImpares;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Introduce un número entero de 5 cifras: ");
        int numero = scanner.nextInt();        
        int digito1 = numero / 10000;
        int digito2 = (numero % 10000) / 1000;
        int digito3 = (numero % 1000) / 100;
        int digito4 = (numero % 100) / 10;
        int digito5 = numero % 10;
        
        System.out.println("Las cifras de " + numero + " son: ");
        System.out.println(digito1);
        System.out.println(digito2);
        System.out.println(digito3);
        System.out.println(digito4);
        System.out.println(digito5);
    }
}