package projeto;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class IsocelesTeste {
	 @Before
	 public void setUp() {
		}
	

		@Test 
		public void desenhar() throws TrianguloException{
			assertEquals(Singleton.getSingleton().setTriangulo(70,70,40).get(0).desenhar(),"Desenhando um triangulo isoceles!");
		}

		@Test 
		public void ToString() throws TrianguloException {
			assertEquals(Singleton.getSingleton().setTriangulo(70,70,40).toString(),"[Triangulo [ tipo: Isoceles, angulo1: 70.0, angulo2: 70.0, angulo3: 40.0]]");
		}
}
