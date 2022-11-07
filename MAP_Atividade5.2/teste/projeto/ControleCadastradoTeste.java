package projeto;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class ControleCadastradoTeste {

	public ControleCadastradoTeste() {
		// TODO Auto-generated constructor stub
	}
	ControleCadastrado cadastrado = new ControleCadastrado();
	
	Profissional ivo;
	Profissional jessica;
	Profissional fernando;
	Profissional gustavo;
	
	@Before
	public void setUp() {
		
		ivo = new Professor("Ivo Dias", 123456789, "professor", 1000, 1000, 1200);
		jessica = new Medico("Jessica", 675467789, "medica", 1000, 10, 100);
		fernando = new Taxista("Fernando", 823455439, "taxista", 1000, 10, 10);
		
		cadastrado.addContribuente(ivo);
		cadastrado.addContribuente(fernando);
		cadastrado.addContribuente(jessica);
		
		gustavo = new Caminhaneiro("Gustavo Dias", 12364789, "caminhaneiro", 1000, 15, 10);

	}

	public void addContribuente() {
		assertEquals(cadastrado.addContribuente(gustavo),true);
	}

}
