package projeto;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 public class  EquilateroTeste {	
	 
	 @Before
	 public void setUp() {
		}
	

		@Test 
		public void desenhar() throws TrianguloException{
			assertEquals(Singleton.getSingleton().setTriangulo(60,60,60).get(0).desenhar(),"Desenhando um triangulo Equilatero!");
		}

		@Test 
		public void ToString() throws TrianguloException {
			assertEquals(Singleton.getSingleton().setTriangulo(60,60,60).toString(),"[Triangulo [ tipo: Equilatero, angulo1: 60.0, angulo2: 60.0, angulo3: 60.0]]");
		}
	
	
}
