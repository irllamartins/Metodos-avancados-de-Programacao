package projeto;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class FinancaTeste {
	
	Financa financa;
	
	@Before
	public  void setUp() {
		financa = new Financa();
		financa.addConta(2, 50000, false);
	}
	@Test
	public void addConta() {
		assertTrue(financa.addConta(2, 50000,false));
	}
	@Test
	public void folhaPagamento()  {
		assertTrue(financa.folhaPagamento());
	}
	@Test
	public void emPendencia() {
		assertTrue(financa.emPendencia());
	}
	@Test
	public void pago() {
		assertTrue(financa.pago(2));
	}
	
}
