package projeto;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TrianguloTest {
	VisitorIF visitorA;
	VisitorIF visitorP;
	VisitorIF visitorM;
	VisitorIF visitorD;
	Triangulo triangulo;

	@Before
	public void setUp() throws TrianguloException {
		 visitorA = new VisitorCalculaArea();
		 visitorP = new VisitorCalculaPerimetro();
		 visitorD = new VisitorCalculaDesenha();
		 visitorM = new VisitorCalculaMaximiza();
		
		triangulo = new Triangulo(8, 15, 10);
		
		
	}

	//teste saida o perimetro de circulo
	@Test 
	public void Perimetro() throws TrianguloException {
		assertEquals(triangulo.aceitaVisita(visitorP),"33");
	}
	
	
	//teste saida area de circulo
	@Test 
	public void Area() throws TrianguloException {
		assertEquals(triangulo.aceitaVisita(visitorA),"27.712812921102035");
	}
	//teste saida de desenha
	@Test 
	public void Desenha() throws TrianguloException {
		assertEquals(triangulo.aceitaVisita(visitorD),"desenha triangulo");
	}
		

		//teste saida mazimiza
	@Test 
	public void Maximiza() throws TrianguloException {
		assertEquals(triangulo.aceitaVisita(visitorM),"Figura maximizada!");
	}

}
