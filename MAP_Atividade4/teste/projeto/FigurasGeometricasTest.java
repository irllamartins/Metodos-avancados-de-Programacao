package projeto;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 public class FigurasGeometricasTest {	
	 private FigurasGeometricas fig;
	 
		@Before
		public void setUp() {
			fig = new FigurasGeometricas(10, 5, 7, 25);
		}
	
	//teste saida o perimetro de circulo
	@Test 
	public void circuloPerimetro() {
		assertEquals(fig.circuloPerimetro(),"O perímetro do círculo é 157.0" );
	}
	
	
	//teste saida o perimetro de circulo
	@Test 
	public void quadradoPerimetro() {
		assertEquals(fig.quadradoPerimetro(),"O perímetro do quadrado é: 28.0" );
		}
		
	//teste saida o perimetro de circulo
	@Test 
	public void retanguloPerimetro() {
		assertEquals(fig.retanguloPerimetro(),"O perimetro deste retângulo é: 30.0" );
	}	

	//teste saida o perimetro de circulo
	@Test 
	public void testToString() {
		assertEquals(fig.toString(),"Todas as áreas são:  Circulo[A area do círculo é 1962.5,  O perímetro do círculo é 157.0] , Retangulo[ A área deste retângulo é: 50.0,O perimetro deste retângulo é: 30.0], Quadrado[A area do quadrado é: 49.0, O perímetro do quadrado é: 28.0]" );
	}
	

}
