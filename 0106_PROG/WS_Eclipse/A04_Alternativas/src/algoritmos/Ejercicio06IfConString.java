package algoritmos;

import java.util.Scanner;

public class Ejercicio06IfConString {
	
	public static void main (String[] args) {
		// Las distintas opciones de un algoritmo declarado como String
		
		/* String opcion = "editar"; // editar, ver, alta
		
		if (opcion == "editar")
			System.out.println("Han tecleado la opcion editar");
		else
			if (opcion == "ver")
				System.out.println("Han tecleado la opcion ver");
			else
				System.out.println("Han tecleado la opcion alta");
		
		
		
		System.out.println("FIN DE PROGRAMA");
		/*
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("Hola, " + nombre + "!");
		scanner.close();
	}

}
