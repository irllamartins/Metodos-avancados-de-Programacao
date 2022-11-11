package projeto;

import org.junit.Before;

public class AlmoxarifadoTeste {
	
	
	public AlmoxarifadoTeste() {
		
		Almoxarifado almoxarifado;
		
		@Before
		public void setUp() {
			almoxarifado.pedidoCompra(12345, "Mesa",3);
			almoxarifado.pedidoCompra(22345, "Cadeira",8);
			almoxarifado.listaPendente();
			almoxarifado.itensComprados(12345, "Mesa",5);
			
		}
		public void pedidoCompra() {
			
		}
		
	}

}
