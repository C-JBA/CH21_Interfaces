package org.generation.figuras;

import org.generation.util.Imprimible;

public class Trapecio extends Poligono implements Imprimible {
	private double baseMenor;
	private double base;
	private double altura;
		
	public Trapecio(String name, double lado, double baseMenor, double base, double altura) {
		super(name, lado);
		this.baseMenor = baseMenor;
		this.base = base;
		this.altura = altura;
	}
	
	
	public double getBaseMenor() {
		return baseMenor;
	}


	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
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
		return ((getAltura()*(getBase() + getBaseMenor()))/2);	
	}//calcularArea
	public double calcularPerimetro() {
		return (2*getLado() + getBase() + getBaseMenor());
	}// calcularPerimetro


	@Override
	public String toString() {
		return "Trapecio [getBaseMenor()=" + getBaseMenor() + ", getBase()=" + getBase() + ", getAltura()="
				+ getAltura() + ", calcularArea()=" + calcularArea() + ", calcularPerimetro()=" + calcularPerimetro()
				+ "]";
	}
	
	
}
