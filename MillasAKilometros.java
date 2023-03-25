
package EjerciciosImpares;

import java.util.Scanner;

public class MillasAKilometros {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Introduce la distancia en millas: ");
      double millas = sc.nextDouble();
      double kilometros = millas * 1.609344;
      System.out.println(millas + " millas son " + kilometros + " kilómetros");
   }
}