/**

 * @author: Juan Antonio Guillo Lopez

 * @version: 21/01/2020
 * Clase que contiene una clase abstracta
 
 */ 


public class Rectangulo_JAGL extends FiguraGeometrica_JAGL {
	/* Clase Rectangulo
	 *  Campos de clase
	 */
	private double l1;
	private double l2;
	
	/**
	 *  
	     * Constructor de la clase Rectangulo
	     *  @param tipoFigura que es una constante de una clase abstracta

	     */ 
	
	
	public Rectangulo_JAGL(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}// Cierre del constructor
	
	
	/* 
	 * Metodo que devuelve el perimetro del rectangulo sumando los lados
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	

	
	/* 
	 * Metodo que devuelve el perimetro del rectangulo sumando los lados
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}// Fin de la clase
