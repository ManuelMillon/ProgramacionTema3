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

		
		System.out.println("Introduzca el primer n�mero: ");
		int f = Integer.parseInt(s.nextLine());
		System.out.println("Introduzca el segundo n�mero: ");
		int g = Integer.parseInt(s.nextLine());
		System.out.println("El resultado de la multiplicaci�n es " + (f * g));
		
		System.out.println("Introduzca el tercer n�mero: ");
		double x = Integer.parseInt(s.nextLine());
		System.out.println("Introduzca el cuarto n�mero: ");
		double y= Integer.parseInt(s.nextLine());
		System.out.println("El resultado de la multiplicaci�n es " + (x * y));
		
		System.out.print("�C�mo te llamas?");
		String nombre = s.nextLine();
		System.out.println(nombre);
		
		
		/**
		 * Curiosamente, no funciona con Integer.parseInt.
		 */
	}

}
