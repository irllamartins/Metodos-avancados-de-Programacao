package projeto;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ExcecoesTeste {
	private FigurasGeometricas fig;
	 
	 @Before
	 public void setUp() {
		 fig = new FigurasGeometricas();
		 
		 fig.setCirculo(0);
		 fig.setQuadrado(0);
		 fig.setRetangulo(10,0);
		 fig.setTriangulo(8,0,6);
		}
	 
	//teste exceções para Retangulo
	 
	@Test(expected=RetanguloException.class) 
	public void Perimetro() throws RetanguloException{
		assertEquals(fig.getRetangulo().perimetro(),42 ,0.01);
	}
		
	@Test(expected=RetanguloException.class) 
	public void retanguloArea() throws RetanguloException {
		assertEquals(fig.getRetangulo().area(), 110,0.01);
	}
	
	//teste exceções para Quadrado
	@Test(expected=QuadradoException.class) 
	public void Perimetro() throws QuadradoException{
		assertEquals( fig.getQuadrado().perimetro(),40,0.01);
	}
	
	//teste saida area do quadrado
	@Test(expected=QuadradoException.class) 
	public void Area() throws QuadradoException {
		assertEquals(fig.getQuadrado().area(),100.0,0.01);
	}
		
	//teste exceções para circulo
	
	@Test(expected=TrianguloException.class) 
	public void Perimetro() throws TrianguloException{
		assertEquals(fig.getTriangulo().perimetro(), 24, 0.01);
	}
		
	//teste saida o perimetro de circulo
	@Test(expected=TrianguloException.class) 
	public void Area() throws TrianguloException {
		assertEquals(fig.getTriangulo().area(), 24, 0.01);
	}
		
}
