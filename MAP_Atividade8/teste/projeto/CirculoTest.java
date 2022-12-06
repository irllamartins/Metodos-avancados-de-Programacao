package projeto;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 public class CirculoTest {	
	 VisitorIF visitorA;
	 VisitorIF visitorP;
	 VisitorIF visitorD;
	 VisitorIF visitorM;
	 Circulo circulo;
	 @Before
		public void setUp() {
		 visitorA = new VisitorCalculaArea();
		 visitorP = new VisitorCalculaPerimetro();
		 visitorD = new VisitorCalculaDesenha();
		 visitorM = new VisitorCalculaMaximiza();
			
		 
		 circulo = new Circulo(10);
		}
	
	//teste saida o perimetro
	@Test 
	public void Perimetro() throws CirculoException {
		assertEquals(circulo.aceitaVisita(visitorP),"62.800000000000004");
	}
	
	
	//teste saida area
	@Test 
	public void Area() throws CirculoException {
		assertEquals(circulo.aceitaVisita(visitorA),"314.0");
	}
	//teste saida de desenha
	@Test 
	public void Desenha() throws CirculoException {
		assertEquals(circulo.aceitaVisita(visitorD),"desenha circulo");
	}
		

		//teste saida mazimiza
	@Test 
	public void Maximiza() throws CirculoException {
		assertEquals(circulo.aceitaVisita(visitorM),"Figura maximizada!");
	}

}
