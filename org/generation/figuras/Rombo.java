package org.generation.figuras;

import org.generation.util.Imprimible;

public class Rombo extends Poligono implements Imprimible{
	private double diagonalMenor;
	private double diagonalMayor;
	
	
	
	public Rombo(String name,double lado,double diagonalMenor,double diagonalMayor) {
		super(name,lado);
		this.diagonalMenor=diagonalMenor;
		this.diagonalMayor=diagonalMayor;
		// TODO Auto-generated constructor stub
	}
	
	
	public double getDiagonalMenor() {
		return diagonalMenor;
	}


	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}


	public double getDiagonalMayor() {
		return diagonalMayor;
	}


	public void setDiagonalMayor(double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}


	public double calcularArea() {
		return ((getDiagonalMayor() *getDiagonalMenor())/2);	
	}//calcularArea
	public double calcularPerimetro() {
		return (4*getLado());
	}// calcularPerimetro


	@Override
	public String toString() {
		return "Rombo [diagonalMenor=" + diagonalMenor + ", diagonalMayor=" + diagonalMayor + ", getName()=" + getName()
				+ ", getLado()=" + getLado() + "]";
	}
	
	
}
