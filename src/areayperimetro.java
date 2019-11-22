package programacionmodularpracticar;

import java.util.Scanner;

public class areayperimetro {

	public static void main (String args[]) {
		
		double base = pedirBase();
		double altura = pedirAltura();
		double area = calcularArea(base, altura);
		double perimetro = calcularPerimetro(base, altura);
		verResultados(area, perimetro);	
	}
	///////////////////////////////////////////////////////
	
	public static double pedirBase() {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce la base: ");
		return entrada.nextDouble();
	}
	////////////////////////////////////////////////////////
	public static double pedirAltura() {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce la altura: ");
		return entrada.nextDouble();
	}
	///////////////////////////////////////////////////////
	public static double calcularArea(double base, double altura) {
		
		return base * altura;
	}
	////////////////////////////////////////////////////////
	public static double calcularPerimetro(double base, double altura) {
		return 2 * (base * altura);
	}
	///////////////////////////////////////////////////////
	public static void verResultados(double perimetro, double area) {
		System.out.println("El area es: " + area);
		System.out.println("El perimetro es: " + perimetro);
	}
	
}
