package Modelo;

public class Triangulo extends FormaGeometrica implements Geometria{

	public Triangulo(double base, double altura) {
		this.setLados(3);
		this.setBase(base);
		this.setAltura(altura);
		calcularArea();
	}

	@Override
	public void calcularArea() {
		this.setArea(this.getBase()*this.getAltura()/2);
	}

	@Override
	public String toString() {
		return "Triangulo: " + super.toString();
	}
	
	
	
}
