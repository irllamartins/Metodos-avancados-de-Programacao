package projeto;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 public class  TrianguloTest {	
	 private FigurasGeometricas fig;
	 
	 @Before
	 public void setUp() {
		 fig = new FigurasGeometricas();
		 
		 fig.setCirculo(10);
		 fig.setQuadrado(10);
		 fig.setRetangulo(10,11);
		 fig.setTriangulo(8,10,6);
		}
	
	//teste saida o perimetro de circulo
	@Test 
	public void Perimetro() throws TrianguloException{
		assertEquals(fig.getTriangulo().perimetro(), 24, 0.01);
	}
	
	
	//teste saida o perimetro de circulo
	@Test 
	public void Area() throws TrianguloException {
		assertEquals(fig.getTriangulo().area(), 24, 0.01);
	}
	
	
}
