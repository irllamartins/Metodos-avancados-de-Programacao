package projeto;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 public class CirculoTest {	
	 private Circunferencia circulo;
	 @Before
		public void setUp() {
			circulo = new Circunferencia(25);
		}
	
	//teste saida o perimetro de circulo
	@Test 
	public void circuloPerimetro() throws CirculoException {
		assertEquals(circulo.circuloPerimetro(),157.0 ,0.01);
	}
	
	
	//teste saida o perimetro de circulo
	@Test 
	public void AreaPerimetro() throws CirculoException {
		assertEquals(circulo.circuloArea(),1962.5,0.01);
	}

}
