/**
 * 
 */
package ejerciciosTema3;

import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class Tema3Ejercicio11 {

	/**
	 * Realiza un conversor de Kb a Mb.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca el número de kbs: ");
		int kas = Integer.parseInt(s.nextLine());
		int megas = kas / 1000;
		System.out.println(kas + " kbs son " + megas + "Mbs");

	}

}
