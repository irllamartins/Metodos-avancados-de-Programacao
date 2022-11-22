package projeto;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ExcecoesTeste {
	 private Quadrilatero quadrilatero;
	 private Circunferencia circulo;
	 
		@Before
		public void setUp() {
			 quadrilatero = new Quadrilatero (10, 5, 7);
			 circulo = new Circunferencia(25);
		}
		//teste exceções para Retangulo
		@Test(expected=RetanguloException.class) 
		public void retanguloPerimetro() throws RetanguloException{
			quadrilatero.getRetangulo().setAltura(0);
			quadrilatero.retanguloPerimetro();
		}
		
		@Test(expected=RetanguloException.class) 
		public void retanguloArea() throws RetanguloException{
			quadrilatero.getRetangulo().setAltura(0);
			quadrilatero.retanguloArea();
		}
		//teste exceções para Quadrado
		@Test(expected=QuadradoException.class) 
		public void quadradoPerimetro() throws QuadradoException{
			quadrilatero.getQuadrado().setLado(0);
			quadrilatero.quadradoPerimetro();
		}
		
		@Test(expected=QuadradoException.class) 
		public void quadradoArea() throws QuadradoException{
			quadrilatero.getQuadrado().setLado(0);
			quadrilatero.quadradoArea();
		}
		//teste exceções para circulo
		@Test(expected=CirculoException.class) 
		public void circuloPerimetro() throws CirculoException {
			circulo.getCirculo().setRaio(0);
			circulo.circuloPerimetro();
		}
		
		//teste saida o perimetro de circulo
		@Test(expected=CirculoException.class) 
		public void AreaPerimetro() throws CirculoException {
			circulo.getCirculo().setRaio(0);
			circulo.circuloArea();
		}

		
}
