package algoritmos;

public class Ejercicio04ComparacionDeDosNumeros {

	public static void main(String[] args) {
		/* leer dos números y decir cual es mayor
		 * menor o igual
		 */
		int num1=5, num2=3;
		
		if (num1 > num2)
			System.out.println("num1 es mayor que num2");
		else
			if (num1 > num2) {
			System.out.println("num1 es menor que num2");
			System.out.println("Otra sentencia");
		}
		else
			System.out.println("Son iguales");
		
		 
		if (num1 > num2) {
			System.out.println("mayor");
		} else
			if (num1 < num2) {
				System.out.println("menor");
			} else {
				System.out.println("iguales");
			}

	}

}
