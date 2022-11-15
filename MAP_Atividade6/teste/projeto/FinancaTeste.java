package projeto;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FinancaTeste {
	
	Financa financa;
	
	@Before
	public  void setUp() throws QtdException, NegativeException {
		financa = new Financa();
		financa.addConta(2, 5000, false);
		financa.addRemanecente(5000);
	}
	@Test
	public void addRemanecente() throws NegativeException {
		assertEquals(financa.addRemanecente(5000),10000,0.0);
	}
	
	@Test
	public void addConta() throws QtdException {
		assertEquals(financa.addConta(2, 5000,false),"Ação realizado com sucesso!");
	}
	@Test
	public void folhaPagamento()  {
		assertEquals(financa.folhaPagamento(),1);
	}
	@Test
	public void emPendencia() {
		assertEquals(financa.emPendencia(),5000,0.0);
	}
	@Test
	public void quitado() {
		assertEquals(financa.quitado(),0,0.0);
	}
	
	@Test
	public void pago() throws NotFoundException, ImpossibleException, NegativeException {
		assertEquals(financa.quitarConta(2),"Ação realizado com sucesso!");
	}
	
}
