package projeto;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 public class FigurasGeometricasTest {	
	 
	 private FigurasGeometricas fig;
	 
	 @Before
	 public void setUp() {
		 fig = new FigurasGeometricas();
		 
		 fig.setCirculo(10);
		 fig.setQuadrado(10);
		 fig.setRetangulo(10,11);
		 fig.setTriangulo(8,10,6);
	}
	
	//teste de saida
	 @Test
	 public void getRetangulo() {
		 assertNotNull(fig.getRetangulo());
	}
	@Test
	public void getCirculo() {
		 assertNotNull(fig.getCirculo());
	}
	@Test
	public void getQuadrado() {
		 assertNotNull(fig.getQuadrado());
	}
	@Test
	public void getTriangulo() {
		 assertNotNull(fig.getTriangulo());
	}	
	

}
