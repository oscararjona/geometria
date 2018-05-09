import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Circulotest {
	
	
	Circulo_oat primero=new Circulo_oat(7,"primero");
	Circulo_oat segundo=new Circulo_oat(5,"segundo");
	Circulo_oat tercero=new Circulo_oat(0,"tercero");
	

	@Test
	public void primertestArea() {
		assertEquals(153.9384,primero.area(),0);
	}

	@Test
	public void primertestPerimetro() {
	assertEquals (43.9824,primero.perimetro(),0);
	}
	@Test
	public void segundotestArea() {
		assertEquals(78.53999999999999,segundo.area(),0);
	}

	@Test
	public void segundotestPerimetro() {
	assertEquals(31.416,segundo.perimetro(),0);
	}
	@Test
	public void tercertestArea() {
		assertEquals(0,tercero.area(),0);
	}

	@Test
	public void tercertestPerimetro() {
	assertEquals(0,tercero.perimetro(),0);
	}

}
