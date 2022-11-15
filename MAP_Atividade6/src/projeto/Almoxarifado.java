package projeto;
import java.util.ArrayList;
import java.util.Iterator;

public class Almoxarifado {
	private ArrayList<Item> itens;
	private ArrayList<Item> pedidoCompra;
	
	public Almoxarifado() {
		this.itens = new ArrayList<Item>();
		this.pedidoCompra = new ArrayList<Item>();
	}
	
	public ArrayList<Item> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}

	public ArrayList<Item> getPedidoCompra() {
		return pedidoCompra;
	}

	public void setPedidoCompra(ArrayList<Item> pedidoCompra) {
		this.pedidoCompra = pedidoCompra;
	}

	public int estoque() {
		Iterator<Item> it = itens.iterator();
		while (it.hasNext()) {
			Item comparador = it.next();
			System.out.println(comparador.toString());
		}
		return itens.size();
	}
	public int listaPendente() {
		Iterator<Item> it = pedidoCompra.iterator();
		while (it.hasNext()) {
			Item comparador = it.next();
			System.out.println(comparador.toString());
		}
		return pedidoCompra.size();
	}
	public String pedidoCompra(int UPC,String nome, int quantidade) throws QtdException {
		if(quantidade>0) {
			for(int i=0;i<quantidade;i++) {
				pedidoCompra.add(new Item(UPC,nome));
			}
			return "Ação realizado com sucesso!";
		}
		else
			throw new QtdException();
	}

	public String itensComprados(int UPC,String nome, int quantidade) throws QtdException {
		
		if(quantidade>0) {
			for(int i=0;i<quantidade;i++) {
				itens.add(new Item(UPC,nome));
				atualizarListaPendente(UPC);
			}
				
			return "Ação realizado com sucesso!";
		}
		else
			throw new QtdException();
		
	}
	
	private void atualizarListaPendente(int UPC) {
		
		for(int i=0;i<pedidoCompra.size();i++) {
			
			if(pedidoCompra.get(i).getUPC()==UPC) {
				pedidoCompra.remove(i);
				i=pedidoCompra.size();
			}
		}
		
			
	}
	
}
