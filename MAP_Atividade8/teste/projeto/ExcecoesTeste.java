package projeto;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ExcecoesTeste {
	 VisitorIF visitorA;
	 VisitorIF visitorP;
	 Triangulo triangulo;
	 Retangulo retangulo;
	 Circulo circulo;
	 Trapezio trapezio;
	 Quadrado quadrado;
	 @Before
		public void setUp() throws RetanguloException  {
		 visitorA = new VisitorCalculaArea();
		 visitorP = new VisitorCalculaPerimetro();
			
		 
			triangulo = new Triangulo(8,15,0);
			retangulo = new Retangulo(15,-1);
			circulo = new Circulo(0);
			quadrado = new Quadrado(0);
			trapezio = new Trapezio(5,0,8,10,10);
				
			
		}


	// teste exceções para Retangulo

	@Test(expected = RetanguloException.class)
	public void retanguloPerimetro() throws RetanguloException {
		assertEquals(retangulo.aceitaVisita(visitorP), "50");
	}

	@Test(expected = RetanguloException.class)
	public void retanguloArea() throws RetanguloException {
		assertEquals(retangulo.aceitaVisita(visitorA), "-15");
	}

	// teste exceções para Quadrado
	@Test(expected = QuadradoException.class)
	public void quadradoPerimetro() throws QuadradoException {
		assertEquals(quadrado.aceitaVisita(visitorP), "40");
	}

	// teste saida area do quadrado
	@Test(expected = QuadradoException.class)
	public void quadradoArea() throws QuadradoException {
		assertEquals(quadrado.aceitaVisita(visitorA), "100.0");
	}

	// teste exceções o perimetro de circulo

	@Test(expected = TrianguloException.class)
	public void trianguloPerimetro() throws TrianguloException {
		assertEquals(triangulo.aceitaVisita(visitorP)," 24");
	}

	// teste saida a area do circulo
	@Test(expected = TrianguloException.class)
	public void trianguloArea() throws  TrianguloException {
		assertEquals(triangulo.aceitaVisita(visitorA), "24");
	}
	// teste exceções para circulo

	@Test(expected = CirculoException.class)
	public void circuloPerimetro() throws CirculoException {
		assertEquals(circulo.aceitaVisita(visitorP)," 24");
	}

	// teste saida area de circulo
	@Test(expected = CirculoException.class)
	public void circuloArea() throws CirculoException {
		assertEquals(circulo.aceitaVisita(visitorA), "24");
	}
}
