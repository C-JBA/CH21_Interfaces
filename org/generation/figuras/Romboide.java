package org.generation.figuras;

import org.generation.util.Imprimible;

public class Romboide extends Poligono implements Imprimible{
	private double base;
	private double altura;
	public Romboide  (String name,  double lado,double base,double altura) {
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
		return (2*getBase() +2* getAltura());
	}// calcularPerimetro


	@Override
	public String toString() {
		return "Romboide [base=" + base + ", altura=" + altura + ", getName()=" + getName() + ", getLado()=" + getLado()
				+ "]";
	}
	
	
}
