package projeto;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ExcecoesTeste {

	@Before
	public void setUp() {
		Singleton.getSingleton().setQuadrado(0);
	}

	// teste exceções para Quadrado
	@Test(expected = QuadradoException.class)
	public void quadradoPerimetro() throws QuadradoException {
		assertEquals(Singleton.getSingleton().getQuadrado().get(0).perimetro(), 40, 0.01);
	}

	@Test(expected = QuadradoException.class)
	public void quadradoArea() throws QuadradoException {
		assertEquals(Singleton.getSingleton().getQuadrado().get(0).area(), 100.0, 0.01);
	}

	// teste exceções triangulo equilatero
	@Test(expected = TrianguloException.class)
	public void isocelesDesenhar() throws TrianguloException {
		assertEquals(Singleton.getSingleton().setTriangulo(0, 60, 60).get(0).desenhar(),
				"Desenhando um triangulo Equilatero!");
	}

	@Test(expected = TrianguloException.class)
	public void isocelesToString() throws TrianguloException {
		assertEquals(Singleton.getSingleton().setTriangulo(0, 60, 60).toString(),
				"[Triangulo [ tipo: Equilatero, angulo1: 60.0, angulo2: 60.0, angulo3: 60.0]]");
	}

	// teste exceções para triangulo Retangulo

	@Test(expected = TrianguloException.class)
	public void retanguloDesenhar() throws TrianguloException {
		assertEquals(Singleton.getSingleton().setTriangulo(90, 10, 0).get(0).desenhar(),
				"Desenhando um triangulo Retangulo!");

	}

	@Test(expected = TrianguloException.class)
	public void retanguloToString() throws TrianguloException {
		assertEquals(Singleton.getSingleton().setTriangulo(90, 0, 80).toString(),
				"[Triangulo [ tipo: Retangulo, angulo1: 90.0, angulo2: 10.0, angulo3: 80.0]]");

	}

	// teste exceções para triangulo Isoceles
	@Test(expected = TrianguloException.class)
	public void desenhar() throws TrianguloException{
		assertEquals(Singleton.getSingleton().setTriangulo(70,70,0).get(0).desenhar(),"Desenhando um triangulo isoceles!");
	}

	@Test(expected = TrianguloException.class)
	public void ToString() throws TrianguloException {
		assertEquals(Singleton.getSingleton().setTriangulo(70,70,0).toString(),"[Triangulo [ tipo: Isoceles, angulo1: 70.0, angulo2: 70.0, angulo3: 40.0]]");
	}

	// teste exceções do circulo

	@Test(expected = CirculoException.class)
	public void circuloPerimetro() throws CirculoException {
		assertEquals(Singleton.getSingleton().setCirculo(0).area(), 314.0, 0.01);
	}

	@Test(expected = CirculoException.class)
	public void circuloArea() throws CirculoException {
		assertEquals(Singleton.getSingleton().setCirculo(0).perimetro(), 62.800000000000004, 0.01);
	}
}
