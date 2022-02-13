package Teste;

import Modelo.Retangulo;
import Modelo.Triangulo;

public class TesteFormasGeometricas {
	
	public static void main(String[] args) {
		
		Triangulo triangulo = new Triangulo(3, 3);
		Retangulo retangulo = new Retangulo(2, 5);
		
		System.out.println(triangulo.toString());
		System.out.println(retangulo.toString());
		
		System.out.println("area do triangulo: " + triangulo.getArea());
		System.out.println("area do Retangulo: " + retangulo.getArea());
	}
	
}
