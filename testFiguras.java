import org.generation.figuras.Triangulo;
import org.generation.printer.*;
import org.generation.printer.*;
import org.generation.util.*;

public class testFiguras {
	public static void main(String[] args) {
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		// TODO: Aquí se deben instanciar las otras figuras geométricas
		
		// TODO: Aquí se debe probar cada figura con el método imprimirCalculo
		Printer.imprimirCalculo(t1);
		Printer.imprimirCalculo(t2);
	}//main

	
}//class testFiguras