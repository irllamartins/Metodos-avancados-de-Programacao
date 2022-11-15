package projeto;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class InfraestruturaTeste {
	Infraestrutura  infraestrutura;
	@Before
	public  void setUp() throws AddException {
		 infraestrutura = new Infraestrutura();
		 infraestrutura.addSala(003, 20, false);
		 infraestrutura.addSala(100, 50, true);
		 infraestrutura.addSala(101, 50, false);
	}
	@Test
	public void ocuparSalas() throws ImpossibleException, NotFoundException {
		assertEquals(infraestrutura.ocuparSalas(100),"Ação realizado com sucesso!");
	}
	@Test
	public void liberarSalas() throws ImpossibleException, NotFoundException  {
		assertEquals(infraestrutura.liberarSalas(003),"Ação realizado com sucesso!");
	}
	@Test
	public void salasDisponiveis() {
		assertEquals(infraestrutura.salasDisponiveis(),1);
	}
	@Test
	public void addSala() throws AddException {
		assertEquals(infraestrutura.addSala(001, 20, false),"Ação realizado com sucesso!");
	}
}
