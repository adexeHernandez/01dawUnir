package algoritmos;

public class Ejercicio02 {

	public static void main(String[] args) {
		/*
		 * Leemos dos números enteros, correspondientes a los lados de un rectángulo y calculamos:
		a. El perímetro
		b. El área
		c. Y la hipotenusa
		 */
		int lado1=4, lado2=3, perimetro=0, area=0;
		// double hipotenusa=0;
		
		perimetro=lado1*2+lado2*2;
		area=lado1*lado2;
		System.out.println("Perimeto : " + perimetro);
		System.out.println("Area : " + area);
		
		
		
		
	}

}
