package projeto;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 public class  QuadradoTest {	
	 
	 VisitorIF visitorA;
	 VisitorIF visitorP;
	 VisitorIF visitorM;
	 VisitorIF visitorD;

	 Quadrado quadrado;
	 @Before
		public void setUp() {
		 
		 visitorA = new VisitorCalculaArea();
		 visitorP = new VisitorCalculaPerimetro();
		 visitorD = new VisitorCalculaDesenha();
		 visitorM = new VisitorCalculaMaximiza();
		 
		 quadrado = new Quadrado(10);
			
		}
	
	//teste saida o perimetro
		@Test 
		public void Perimetro() throws QuadradoException {
			assertEquals(quadrado.aceitaVisita(visitorP),"40");
		}
		
		
		//teste saida area
		@Test 
		public void Area() throws QuadradoException {
			assertEquals(quadrado.aceitaVisita(visitorA),"100");
		}
		//teste saida de desenha
		@Test 
		public void Desenha() throws QuadradoException {
			assertEquals(quadrado.aceitaVisita(visitorD),"desenha quadrado");
		}
			

			//teste saida mazimiza
		@Test 
		public void Maximiza() throws QuadradoException {
			assertEquals(quadrado.aceitaVisita(visitorM),"Figura maximizada!");
		}
}
