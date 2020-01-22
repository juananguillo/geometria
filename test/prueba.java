

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class prueba {

	static final double PI = 3.1416;
	Circulo_JAGL uno= new Circulo_JAGL(7, "Circulo");
	Circulo_JAGL dos = new Circulo_JAGL(0, "Circulo");
	Circulo_JAGL tres = new Circulo_JAGL(-3, "Circulo");
	@Test
	void testArea() {
		assertEquals(153.9384, uno.area());
		assertEquals(0, dos.area());
		assertEquals(28.2744, tres.area());
	}

	@Test
	void testPerimetro() {
		assertEquals(43.9824, uno.perimetro());
		assertEquals(0, dos.perimetro());
		assertEquals(18.8496, tres.perimetro());
	}

	

}

