package org.generation.figuras;

import org.generation.util.Imprimible;

public class Cuadrado extends Poligono implements Imprimible{
		
	public Cuadrado(String name,double lado) {
		super(name,lado);
		
	}
	public double calcularArea() {
		return (getLado() * getLado());	
	}//calcularArea
	public double calcularPerimetro() {
		return (4*getLado());
	}
	@Override
	public String toString() {
		return "Cuadrado [getName()=" + getName() + ", getLado()=" + getLado() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
}
