package actividad01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		/*Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente (0 a 4,9), Suficiente(5 a 5,9), Bien (6 a 6,9), 
		 * Notable (7 a 8,9) y sobresaliente (9 a 10). Si la nota introducida no está en el rango
		 *  mostrar el mensaje “Nota errónea”. 
		 */
		
		 Scanner leerNota = new Scanner(System.in);
		 double nota = 0;
		 
		 System.out.println("Dime que nota te ha cascado Tomas :");
		 nota = leerNota.nextDouble();
		 
		 if (nota >= 9 && nota <=10) {
				 System.out.println("Tu nota es un Sobresaliente");
		 } else if (nota >= 7 && nota <=8.9) {
		 		System.out.println("Tienes un Notable");
		 } else if (nota >= 6 && nota <=6.9) {
		 		System.out.println("Tienes un Bien");
		 } else if (nota >= 5 && nota <=5.9) {
		 		System.out.println("Tienes un Suficiente");
		 } else if (nota >= 0 && nota <=4.9) {
		 		System.out.println("Tienes un Insuficiente");
		 } else {
		 		System.out.println("Nota erronea");
		 }
		 
		 leerNota.close();
	}
}
