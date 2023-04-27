package org.generation.figuras;

import org.generation.util.Imprimible;

public class Rectangulo  extends Poligono implements Imprimible {
	private double base;
	private double altura;
	public Rectangulo  (String name,  double lado,double base,double altura) {
		super(name,lado);
		this.base=base;
		this.altura=altura;
		
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
		return (getBase() * getAltura());	
	}//calcularArea
	public double calcularPerimetro() {
		return (2*getBase()+2*getAltura());
	}


	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + ", getName()=" + getName() + ", getLado()="
				+ getLado() + ", toString()=" + super.toString() + "]";
	}
	
	
}
