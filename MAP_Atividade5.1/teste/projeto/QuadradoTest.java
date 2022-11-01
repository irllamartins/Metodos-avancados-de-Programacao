package projeto;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 public class  QuadradoTest {	
	 
	 private FigurasGeometricas fig;
	 
	 @Before
	 public void setUp() {
		 fig = new FigurasGeometricas();
		 
		 fig.setCirculo(10);
		 fig.setQuadrado(10);
		 fig.setRetangulo(10,11);
		 fig.setTriangulo(8,10,6);
		}
	
	//teste saida o perimetro do quadrado
	@Test 
	public void Perimetro() throws QuadradoException{
		assertEquals( fig.getQuadrado().perimetro(),40,0.01);
	}
	
	
	//teste saida area do quadrado
	@Test 
	public void Area() throws QuadradoException {
		assertEquals(fig.getQuadrado().area(),100.0,0.01);
	}


}
