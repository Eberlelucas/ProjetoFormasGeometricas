package Modelo;

public abstract class FormaGeometrica {
	private int lados;
	private double base;
	private double altura;
	private double area;
	
	public int getLados() {
		return lados;
	}
	public void setLados(int lados) {
		this.lados = lados;
	}
	public Double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "\nlados=" + this.lados + ", \nbase=" + this.base + ", \naltura=" + this.altura + "\n";
	}
	
	
	
}
