package AmorIvan;

import java.util.Scanner;

public class Ejercicio4Ecuacion
{
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args)
	{
		double a = pedirA();
		double b = pedirB();
		double c = pedirC(a, b);
		double discriminante = calcularDiscriminante(a, b, c);
		double im = Math.sqrt(Math.abs(discriminante))/(2*a);
		double re = -b / (2*a);
		double resultado1 = calcularRaiz1(re, im, a, b, c, discriminante);
		double resultado2 = calcularRaiz2(re, im, a, b, c, discriminante);
		verResultado(resultado1, resultado2);
	}
	//////////////////////////////////////////////////////////
	public static double pedirA()
	{
		System.out.println("Introduce el valor de A: ");
		return entrada.nextDouble();
	}
	//////////////////////////////////////////////////////////
	public static double pedirB()
	{
		System.out.println("Introduce el valor de B: ");
		return entrada.nextDouble();
	}
	//////////////////////////////////////////////////////////
	public static double pedirC(double a, double b)
	{
		if(a == 0 && b == 0) {
			System.out.println("ERROR: Con a y b siendo 0 no se puede formar una ecuacion");
			return 0;
		}
		else {
			System.out.println("Introduce el valor de C: ");
		}
		return entrada.nextDouble();
	}
		
	/////////////////////////////////////////////////////////////////
	public static double calcularDiscriminante(double a, double b, double c)
	{ 
		double discriminante = b*b - 4*a*c;
		return discriminante;
	}
	//////////////////////////////////////////////////////////////////
	public static double calcularRaiz1(double re, double im, double a, double b, double c, double discriminante)
	{
		
		double raiz = re + im;
		
		if(a == 0 && b != 0)
			raiz = -c / b;
		
		
		return raiz;
	}
	/////////////////////////////////////////////////////////////////////
	public static double calcularRaiz2(double re, double im, double a, double b, double c, double discriminante)
	{
		double raiz2 = re - im;
		
		if(a == 0 && b != 0)
			raiz2 = -c / b;
		
		return raiz2;
	}
	///////////////////////////////////////////////////////////////////////////
	public static void verResultado(double resultado1, double resultado2)
	{
		System.out.println("Las raices de la ecuacion son: " + resultado1 + " y " + resultado2);
	}
}
