package projeto;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ExteriorRiquezaTeste {

	
	ControleCadastrado cadastrado;
	ExteriorRiqueza riqueza; 
	CalculaImposto calcular;
	
	Profissional ivo;
	Profissional jessica;
	Profissional fernando;
	Profissional gustavo;
	Profissional ana;
	Profissional joao;
	
	Patrimonio casa1;
	Patrimonio carro1;
	Patrimonio casa2;
	Patrimonio carro2;
	@Before
	public void setUp() {
		cadastrado = new ControleCadastrado();
		riqueza = new ExteriorRiqueza(); 
		calcular = new CalculaImposto();
		
		ivo = new Professor("Ivo Dias", 123456789, "professor", 1000, 1000, 1200);
		jessica = new Medico("Jessica", 675467789, "medica", 1000, 10, 100);
		fernando = new Taxista("Fernando", 823455439, "taxista", 1000, 10, 10);
		gustavo = new Caminhaneiro("Gustavo Dias", 12364789, "caminhaneiro", 1000, 15, 10);
		ana = new Taxista("Ana", 965455439, "taxista", 1000, 10, 1000);
		joao = new Caminhaneiro("Joao Dias", 123456789, "caminhaneiro", 1000, 0, 10);
		
		cadastrado.addContribuente(ivo);
		cadastrado.addContribuente(fernando);
		cadastrado.addContribuente(ana);
		cadastrado.addContribuente(joao);
		cadastrado.addContribuente(jessica);
		cadastrado.addContribuente(gustavo);
		
		casa1 = new Casa(1, 50000, 100); 
		carro1 = new Carro(1, 80000,2020);
		casa2 = new Casa(2, 10000, 100); 
		carro2 = new Carro(2, 100000,2022);
		
		cadastrado.getLista().get(0).addPatrimonio(casa1);
		cadastrado.getLista().get(1).addPatrimonio(casa2);
		cadastrado.getLista().get(2).addPatrimonio(casa1);
		cadastrado.getLista().get(2).addPatrimonio(carro2);
		cadastrado.getLista().get(3).addPatrimonio(carro1);
		cadastrado.getLista().get(4).addPatrimonio(carro1);
		cadastrado.getLista().get(4).addPatrimonio(carro2);
		cadastrado.getLista().get(4).addPatrimonio(casa1);
	}
	@Test
	public void somatorioRiqueza() {
		assertEquals(riqueza.somatorioRiqueza(cadastrado.getLista().get(2), cadastrado.getLista()),"Sim");
	}
}
