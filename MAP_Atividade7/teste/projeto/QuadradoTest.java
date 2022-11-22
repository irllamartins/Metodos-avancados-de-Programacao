package projeto;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 public class  QuadradoTest {	
	 
	 
	 @Before
	 public void setUp() {
		 Singleton.getSingleton().setQuadrado(10);
		}
	
	//teste saida o perimetro do quadrado
	@Test 
	public void Perimetro() throws QuadradoException{
		assertEquals( Singleton.getSingleton().getQuadrado().get(0).perimetro(),40.0,0.01);
	}
	
	
	//teste saida area do quadrado
	@Test 
	public void Area() throws QuadradoException  {
		assertEquals( Singleton.getSingleton().getQuadrado().get(0).area(),100.0,0.01);
	}
 
	@Test 
	public void ToString() {
		assertEquals(Singleton.getSingleton().getQuadrado().get(0),"Quadrado [lado: 10, Perimetro: 40.0, Area: 100.0]");
	}
}
