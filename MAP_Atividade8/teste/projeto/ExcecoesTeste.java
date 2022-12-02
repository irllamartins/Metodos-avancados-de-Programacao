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
		fig.setRetangulo(10, 0);
		fig.setTriangulo(0, 5, 6);
	}

	// teste exceções para Retangulo

	@Test(expected = RetanguloException.class)
	public void retanguloPerimetro() throws RetanguloException {
		assertEquals(fig.getRetangulo().perimetro(), 42, 0.01);
	}

	@Test(expected = RetanguloException.class)
	public void retanguloArea() throws RetanguloException {
		assertEquals(fig.getRetangulo().area(), 110, 0.01);
	}

	// teste exceções para Quadrado
	@Test(expected = QuadradoException.class)
	public void quadradoPerimetro() throws QuadradoException {
		assertEquals(fig.getQuadrado().perimetro(), 40, 0.01);
	}

	// teste saida area do quadrado
	@Test(expected = QuadradoException.class)
	public void quadradoArea() throws QuadradoException {
		assertEquals(fig.getQuadrado().area(), 100.0, 0.01);
	}

	// teste exceções o perimetro de circulo

	@Test(expected = TrianguloException.class)
	public void trianguloPerimetro() throws TrianguloException {
		assertEquals(fig.getTriangulo().perimetro(), 24, 0.01);
	}

	// teste saida a area do circulo
	@Test(expected = TrianguloException.class)
	public void trianguloArea() throws TrianguloException {
		assertEquals(fig.getTriangulo().area(), 24, 0.01);
	}
	// teste exceções para circulo

	@Test(expected = CirculoException.class)
	public void circuloPerimetro() throws CirculoException {
		assertEquals(fig.getCirculo().perimetro(), 24, 0.01);
	}

	// teste saida area de circulo
	@Test(expected = CirculoException.class)
	public void circuloArea() throws CirculoException {
		assertEquals(fig.getCirculo().area(), 24, 0.01);
	}
}
