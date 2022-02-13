package Modelo;

public class Retangulo extends FormaGeometrica implements Geometria{
	
	public Retangulo(double base, double altura) {
		this.setLados(4);
		this.setBase(base);
		this.setAltura(altura);
		calcularArea();
	}

	@Override
	public void calcularArea() {
		this.setArea(this.getBase()*this.getAltura());
	}

	@Override
	public String toString() {
		return "Retangulo:" + super.toString();
	}
	
	

}
