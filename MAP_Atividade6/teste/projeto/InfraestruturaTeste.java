package projeto;


import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class InfraestruturaTeste {
	Infraestrutura  infraestrutura;
	@Before
	public  void setUp() {
		 infraestrutura = new Infraestrutura();
		 infraestrutura.addSala(003, 20, false);
		 infraestrutura.addSala(100, 50, true);
		 infraestrutura.addSala(101, 50, false);
	}
	@Test
	public void ocuparSalas() {
		assertTrue(infraestrutura.ocuparSalas(100));
	}
	@Test
	public void liberarSalas()  {
		assertTrue(infraestrutura.liberarSalas(003));
	}
	@Test
	public void salasDisponiveis() {
		assertTrue(infraestrutura.salasDisponiveis());
	}
	@Test
	public void addSala() {
		assertTrue(infraestrutura.addSala(001, 20, false));
	}
}
