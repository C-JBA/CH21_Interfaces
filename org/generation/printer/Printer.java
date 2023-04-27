package org.generation.printer;
import org.generation.util.Imprimible;

public class Printer {

	public static void imprimirCalculo(Imprimible t) {
		System.out.println(t);
		System.out.println("+========================================");
		System.out.println("|El área de ["+t.getName()+"] es: " + t.calcularArea() + 
				"\n" + "|El perímetro de ["+t.getName()+"] es: " + t.calcularPerimetro());
		System.out.println("+========================================");
	}//imprimirCalculo
	
	}
	

