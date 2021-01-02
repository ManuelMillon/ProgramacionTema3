/**
 * 
 */
package ejerciciosTema3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class Tema3Ejercicio9 {

	/**
	 * Escribe un programa que calcule el volumen de un cono según la fórmula 
	 * V =1/3πr2h
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca la longitud del radio del cono: ");
		double r = Integer.parseInt(s.nextLine());
		System.out.print("Introduzca la longitud de la altura del cono: ");
		double h = Integer.parseInt(s.nextLine());
		double volumenCono = (Math.PI*(r*r)*h)/3;
		System.out.printf("El volumen del cono es de %.2f \n", volumenCono);

	}

}
