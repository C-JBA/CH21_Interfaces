package org.generation.figuras;
import org.generation.util.Imprimible;
public class Triangulo extends Poligono implements Imprimible{
	private double base;
	private double altura;
	
	public Triangulo(String name,double lado,double base, double altura) {
		
		super(name, lado);
		this.base=base;
		this.altura=altura;
		// TODO Auto-generated constructor stub
	}
	
	
	public double getBase() {
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



	public double calcularArea() {
		return (getBase() * getAltura())/2;	
	}//calcularArea
	public double calcularPerimetro() {
		return (getLado() + getLado() + getLado());
	}// calcularPerimetro
		
	
	public String toString() {
		return "Triángulo [name=" + getName() + ", base=" + getBase() + ", altura=" + getAltura() + ", lado=" + getLado() + "]";
	}//toString
}//class Triangulo
