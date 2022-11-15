package projeto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AlmoxarifadoTeste {
	private Almoxarifado almoxarifado;
	
	@Before
	public void setUp() throws QtdException {
		almoxarifado = new Almoxarifado();
		almoxarifado.pedidoCompra(22345, "Cadeira",8);
		
	}
	@Test
	public void estoque() {
		assertEquals(almoxarifado.estoque(),0);
	}
	
	@Test
	public void pedidoCompra() throws QtdException {
		assertEquals(almoxarifado.pedidoCompra(22345, "Cadeira",8),"Ação realizado com sucesso!");
	}

	
	@Test
	public void listaPendente() {
		assertEquals(almoxarifado.listaPendente(),8);
		
	}
	@Test
	public void itensComprados() throws QtdException {
		assertEquals(almoxarifado.itensComprados(12345, "Mesa",5),"Ação realizado com sucesso!");
		
	}
}
