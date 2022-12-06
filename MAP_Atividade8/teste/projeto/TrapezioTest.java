package projeto;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TrapezioTest {
	VisitorIF visitorA;
	VisitorIF visitorP;
	VisitorIF visitorM;
	VisitorIF visitorD;
	Trapezio trapezio;

	@Before
	public void setUp() throws RetanguloException {
		 visitorA = new VisitorCalculaArea();
		 visitorP = new VisitorCalculaPerimetro();
		 visitorD = new VisitorCalculaDesenha();
		 visitorM = new VisitorCalculaMaximiza();

		trapezio = new Trapezio(5, 15, 8, 10, 10);

	}

	//teste saida o perimetro
	@Test 
	public void Perimetro() throws TrapezioException {
		assertEquals(trapezio.aceitaVisita(visitorP),"40.0");
	}
			
			
	//teste saida area
	@Test 
	public void Area() throws TrapezioException {
		assertEquals(trapezio.aceitaVisita(visitorA),"80.0");
	}
	//teste saida de desenha
	@Test 
	public void Desenha() throws TrapezioException {
		assertEquals(trapezio.aceitaVisita(visitorD),"desenha trapezio");
	}
				
	
	//teste saida mazimiza
	@Test 
	public void Maximiza() throws TrapezioException {
		assertEquals(trapezio.aceitaVisita(visitorM),"Figura maximizada!");
	}
}
