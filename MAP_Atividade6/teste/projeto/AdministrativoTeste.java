package projeto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AdministrativoTeste {
	private Administrativo administrativo;
	
	@Before
	public void setUp() {
		administrativo = new Administrativo();
		administrativo.AgendarCompromisso("01/12/2020", "12:00", "Entrevista");
	}

	
	@Test
	public void AgendarCompromisso() {
		assertTrue(administrativo.AgendarCompromisso("02/12/2020", "12:00", "Entrevista"));
	}

	
	@Test
	public void compromissoAgendado() {
		assertTrue(administrativo.compromissoAgendado());
		
	}
	@Test
	public void concluirCompromisso() {
		assertTrue(administrativo.concluirCompromisso("01/12/2020", "12:00"));
		
	}
}
