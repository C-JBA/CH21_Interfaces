package org.generation.figuras;

public class Poligono {
	private String name;
	private double lado;
	
	public Poligono(String name, double lado) {
		super();
		this.name = name;
		this.lado = lado;
	}
	public String getName() {
		return name;
	}//getName
	public void setName(String name) {
		this.name = name;
	}//setName
	
	public double getLado() {
		return lado;
	}//getLado
	public void setLado(double lado) {
		this.lado = lado;
	}//setLado
	@Override
	public String toString() {
		return "Poligono [name=" + name + ", lado=" + lado + "]";
	}
	
	
}
