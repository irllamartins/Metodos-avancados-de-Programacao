package projeto;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 public class  RetanguloTest {	
	 private FigurasGeometricas fig;
	 
	 @Before
	 public void setUp() {
		 fig = new FigurasGeometricas();
		 
		 fig.setCirculo(10);
		 fig.setQuadrado(10);
		 fig.setRetangulo(10,11);
		 fig.setTriangulo(8,10,6);
		}
	
	//teste saida o perimetro de retangulo
	@Test 
	public void Perimetro() throws RetanguloException{
		assertEquals(fig.getRetangulo().perimetro(),42 ,0.01);
	}
	
	//teste saida o perimetro de retangulo
	@Test 
	public void retanguloArea() throws RetanguloException {
		assertEquals(fig.getRetangulo().area(), 110,0.01);
	}
	
	
}
