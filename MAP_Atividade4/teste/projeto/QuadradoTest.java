package projeto;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 public class  QuadradoTest {	
	 private Quadrilatero quadrilatero;
	 
	@Before
	public void setUp() {
		 quadrilatero = new Quadrilatero (10, 5, 7);
	}
	
	//teste saida o perimetro do quadrado
	@Test 
	public void quadradoPerimetro() throws QuadradoException{
		assertEquals( quadrilatero.quadradoPerimetro(),28.0,0.01);
	}
	
	
	//teste saida area do quadrado
	@Test 
	public void quadradoArea() throws QuadradoException {
		assertEquals(quadrilatero.quadradoArea(),49.0,0.01);
	}


}
