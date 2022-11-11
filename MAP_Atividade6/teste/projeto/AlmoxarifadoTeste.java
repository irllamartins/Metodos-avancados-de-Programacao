package projeto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AlmoxarifadoTeste {
	private Almoxarifado almoxarifado;
	
	@Before
	public void setUp() {
		almoxarifado = new Almoxarifado();
		
	}
	@Test
	public void estoque() {
		assertTrue(almoxarifado.estoque());
	}
	
	@Test
	public void pedidoCompra() {
		assertTrue(almoxarifado.pedidoCompra(22345, "Cadeira",8));
	}

	
	@Test
	public void listaPendente() {
		assertTrue(almoxarifado.listaPendente());
		
	}
	@Test
	public void itensComprados() {
		assertTrue(almoxarifado.itensComprados(12345, "Mesa",5));
		
	}
}
