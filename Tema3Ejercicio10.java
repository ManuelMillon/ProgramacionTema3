/**
 * 
 */
package ejerciciosTema3;

import java.util.Scanner;

/**
 * @author Manuel Mill�n
 *
 */
public class Tema3Ejercicio10 {

	/**
	 * Realiza un conversor de Mb a Kb.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca el n�mero de megas: ");
		int megas = Integer.parseInt(s.nextLine());
		int kas = megas * 1000;
		System.out.println(megas + " megas son " + kas + "kb");

	}

}
