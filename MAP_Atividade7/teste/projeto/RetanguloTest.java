package projeto;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 public class  RetanguloTest {	
	
	
	 @Before
	 public void setUp() {
		
		}
	
	
	@Test
	public void desenhar() throws TrianguloException {
		assertEquals(Singleton.getSingleton().setTriangulo(90, 10, 80).get(0).desenhar(),
				"Desenhando um triangulo Retangulo!");
	}

	@Test
	public void ToString() throws TrianguloException {
		assertEquals(Singleton.getSingleton().setTriangulo(90, 10, 80).toString(),
				"[Triangulo [ tipo: Retangulo, angulo1: 90.0, angulo2: 10.0, angulo3: 80.0]]");
	}
	
	
}
