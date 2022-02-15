package Modelo;

public class Trapezio extends FormaGeometrica implements Geometria{
	
	private double base2;
	
	public Trapezio(double base, double base2, double altura) {
		this.setLados(4);
		this.setBase(base);
		this.setAltura(altura);
		this.setBase2(base2);
		calcularArea();
	}

	@Override
	public void calcularArea() {
		this.setArea(((this.getBase()+ this.getBase2())*this.getAltura())/2);
	}

	@Override
	public String toString() {
		return "Trapezio: \nbase2=" + base2 + super.toString();
	}

	public double getBase2() {
		return base2;
	}

	public void setBase2(double base2) {
		this.base2 = base2;
	}

}
