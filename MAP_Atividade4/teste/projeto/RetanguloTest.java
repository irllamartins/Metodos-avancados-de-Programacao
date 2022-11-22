package projeto;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 public class  RetanguloTest {	
	 private Quadrilatero quadrilatero;
	 
		@Before
		public void setUp() {
			 quadrilatero = new Quadrilatero (10, 5, 7);
		}
	
	//teste saida o perimetro de circulo
	@Test 
	public void retanguloPerimetro() throws RetanguloException{
		assertEquals( quadrilatero.retanguloPerimetro(),30.0,0.01);
	}
	
	
	//teste saida o perimetro de circulo
	@Test 
	public void retanguloArea() throws RetanguloException {
		assertEquals(quadrilatero.retanguloArea(), 50.0,0.01);
	}
	
	
}
