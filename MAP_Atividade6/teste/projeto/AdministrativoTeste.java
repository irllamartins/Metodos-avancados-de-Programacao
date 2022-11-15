package projeto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AdministrativoTeste {
	private Administrativo administrativo;
	
	@Before
	public void setUp() throws AddException {
		administrativo = new Administrativo();
		administrativo.AgendarCompromisso("01/12/2020", "12:00", "Entrevista");
	}

	
	@Test
	public void AgendarCompromisso() throws AddException {
		assertEquals(administrativo.AgendarCompromisso("02/12/2020", "12:00", "Entrevista"),"Ação realizado com sucesso!");
	}

	
	@Test
	public void compromissoAgendado() {
		assertEquals(administrativo.compromissoAgendado(),1);
		
	}
	@Test
	public void concluirCompromisso() throws NotFoundException {
		assertEquals(administrativo.concluirCompromisso("01/12/2020", "12:00"),"Ação realizado com sucesso!");
		
	}
}
