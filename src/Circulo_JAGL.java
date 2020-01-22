import static org.junit.jupiter.api.Assertions.assertEquals;

public class Circulo_JAGL extends FiguraGeometrica_JAGL {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_JAGL(double r, String tipoFigura) {
		super(tipoFigura);
		
		radio = r;
		if (radio<0) {
			radio=radio*-1;
			
			
		}		
		
	}

	@Override
	public double area() {
		
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {

		return radio * 2 * PI;
		
	}

}
