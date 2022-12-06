package projeto;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class RetanguloTest {
	VisitorIF visitorA;
	VisitorIF visitorP;
	VisitorIF visitorM;
	VisitorIF visitorD;
	Retangulo retangulo;

	@Before
	public void setUp() throws RetanguloException {
		 visitorA = new VisitorCalculaArea();
		 visitorP = new VisitorCalculaPerimetro();
		 visitorD = new VisitorCalculaDesenha();
		 visitorM = new VisitorCalculaMaximiza();

		retangulo = new Retangulo(15, 10);
		
	}

	//teste saida o perimetro
		@Test 
	public void Perimetro() throws RetanguloException {
		assertEquals(retangulo.aceitaVisita(visitorP),"50");
	}
			
			
	//teste saida area
	@Test 
	public void Area() throws RetanguloException {
		assertEquals(retangulo.aceitaVisita(visitorA),"150");
	}
	//teste saida de desenha
	@Test 
	public void Desenha() throws RetanguloException {
		assertEquals(retangulo.aceitaVisita(visitorD),"desenha retangulo");
	}
				

	//teste saida mazimiza
	@Test 
	public void Maximiza() throws RetanguloException {
		assertEquals(retangulo.aceitaVisita(visitorM),"Figura maximizada!");
	}

}
