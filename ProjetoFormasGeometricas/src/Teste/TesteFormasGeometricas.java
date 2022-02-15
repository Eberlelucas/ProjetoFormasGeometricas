package Teste;

import Modelo.Retangulo;
import Modelo.Trapezio;
import Modelo.Triangulo;

public class TesteFormasGeometricas {
	
	public static void main(String[] args) {
		
		Triangulo triangulo = new Triangulo(3, 3);
		Retangulo retangulo = new Retangulo(2, 5);
		Trapezio trapezio = new Trapezio(2, 3, 4);
		
		System.out.println(triangulo);
		System.out.println(retangulo);
		System.out.println(trapezio);
		
		System.out.println("area do triangulo: " + triangulo.getArea());
		System.out.println("area do Retangulo: " + retangulo.getArea());
		System.out.println("area do trapezio: " + trapezio.getArea());
	
	}
	
}
