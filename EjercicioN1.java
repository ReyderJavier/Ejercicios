/**************************************
 * Autor: Tineo Tineo Reyder Javier   *
 * Fecha Creación: 24/03/23           *
 * Fecha Actualización:	25/03/23	  *
 * Descripción: Lee dos nùmeros       *
 *   introducidos por el usuario y lo *
 *   muestra en pantalla              *
 **************************************/
package EjerciciosImpares;
import java.util.Scanner;
public class EjercicioN1 {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);   
	        System.out.print("Introduce el primer número: ");
	        int num1 = scanner.nextInt();        
	        System.out.print("Introduce el segundo número: ");
	        int num2 = scanner.nextInt();      
	        System.out.println("Los números introducidos son " + num1 + " y " + num2);
	    }
	}

	
	
	
	
	


