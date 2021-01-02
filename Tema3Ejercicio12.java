/**
 * 
 */
package ejerciciosTema3;

import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class Tema3Ejercicio12 {

	/**
	 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
	 * examen de la asignatura Programación para obtener la media deseada. Hay
	 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
	 * segundo examen un 60%.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca la nota del primer examen: ");
		double examen1 = s.nextDouble();
		System.out.print("Introduzca la nota deseada: ");
		double notaDeseada = s.nextDouble();
		double examen2 = ((notaDeseada * 5) - (examen1 * 2)) /3; 
		
		System.out.printf("La nota necesaria en el segundo examen es %.2f \n ", examen2);

		
		/**
		 * No sale con Integer.parseInt...
		 * 
		 */
	}

}
