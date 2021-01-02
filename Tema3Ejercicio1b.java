/**
 * 
 */
package ejerciciosTema3;

import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class Tema3Ejercicio1b {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		
		System.out.println("Introduzca el primer número: ");
		int f = Integer.parseInt(s.nextLine());
		System.out.println("Introduzca el segundo número: ");
		int g = Integer.parseInt(s.nextLine());
		System.out.println("El resultado de la multiplicación es " + (f * g));
		
		System.out.println("Introduzca el tercer número: ");
		double x = Integer.parseInt(s.nextLine());
		System.out.println("Introduzca el cuarto número: ");
		double y= Integer.parseInt(s.nextLine());
		System.out.println("El resultado de la multiplicación es " + (x * y));
		
		System.out.print("¿Cómo te llamas?");
		String nombre = s.nextLine();
		System.out.println(nombre);
		
		
		/**
		 * Curiosamente, no funciona con Integer.parseInt.
		 */
	}

}
