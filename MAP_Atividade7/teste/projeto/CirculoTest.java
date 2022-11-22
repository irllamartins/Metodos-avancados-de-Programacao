package projeto;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CirculoTest {
	@Before
	public void setUp() {

	}
	@Test
	public void circuloArea() throws CirculoException {
		assertEquals(Singleton.getSingleton().setCirculo(10).area(), 314.0, 0.01);
	}

	@Test
	public void circuloPerimetro() throws CirculoException {
		assertEquals(Singleton.getSingleton().setCirculo(10).perimetro(), 62.800000000000004, 0.01);
	}

	@Test
	public void ToString() throws CirculoException {
		assertEquals(Singleton.getSingleton().setCirculo(10).toString(),
				"Circulo [raio: 10.0, Perimetro: 62.800000000000004, Area: 314.0]");
	}

	@Test
	public void Desenhar() throws CirculoException {
		assertEquals(Singleton.getSingleton().setCirculo(10).desenhar(), "Desenhando um circulo!");
	}

}
