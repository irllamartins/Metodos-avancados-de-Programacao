package projeto;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculaImpostoTeste {
	private CalculaImposto calcular;
	Profissional ivo;
	Profissional jessica;
	Profissional fernando;
	Profissional gustavo;

	@Before
	public void setUp() {
		calcular = new CalculaImposto();

		ivo = new Professor("Ivo Dias", 123456789, "professor", 1000, 1000, 1200);
		jessica = new Medico("Jessica", 675467789, "medica", 1000, 10, 100);
		fernando = new Taxista("Fernando", 823455439, "taxista", 1000, 10, 10);
		gustavo = new Caminhaneiro("Gustavo Dias", 12364789, "caminhaneiro", 1000, 15, 10);

	}

	// teste saida o imposto taxista
	@Test
	public void ImpostoTaxista() {
		assertEquals(calcular.imposto((Taxista) fernando),
				"Taxista [ Nome: Fernando, Salario: 1000.0, tarifa: 5.0, desconto: 0.0]O valor do imposto é 5.0");
	}

	// teste saida o imposto professor
	@Test
	public void ImpostoProfessor() {
		assertEquals(calcular.imposto((Professor) ivo),
				"Professor [ Nome: Ivo Dias, Salario: 1000.0, tarifa: 50.0, desconto: 500.0]Inseto!");
	}

	// teste saida o imposto medico
	@Test
	public void ImpostoMedico() {
		assertEquals(calcular.imposto((Medico) jessica),
				"Medico [ Nome: Jessica, Salario: 1000.0, tarifa: 100.0, desconto: 100.0]Inseto!");
	}

	// teste saida o imposto Caminhaneiro
	@Test
	public void ImpostoCaminhaneiro() {
		assertEquals(calcular.imposto((Caminhaneiro) gustavo),
				"Caminhaneiro [ Nome: Gustavo Dias, Salario: 1000.0, tarifa: 1000.0, desconto: 0.1]O valor do imposto é 999.9");
	}

}
