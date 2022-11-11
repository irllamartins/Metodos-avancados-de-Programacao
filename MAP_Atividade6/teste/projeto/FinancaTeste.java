package projeto;

import static org.junit.Assert.assertTrue;

import org.junit.Before;

public class FinancaTeste {

	public FinancaTeste() {
		// TODO Auto-generated constructor stub
	}
	
	Financa financa;
	
	@Before
	public void setUp() {
		financa = new Financa();
		
	}

	public void addConta() {
		assertTrue(financa.addConta(2, 50000,false));
	}

}
