package projeto;
import java.util.ArrayList;
import java.util.Iterator;

public class Financa {
	private ArrayList<Pagamento> pagamentos;
	public Financa() {
		this.pagamentos = new ArrayList<Pagamento>();
	}
	public boolean folhaPagamento() {
		Iterator<Pagamento> it = pagamentos.iterator();

		while (it.hasNext()) {
			Pagamento comparador = it.next();
			System.out.println(comparador.toString());
		}
		return true;
	}
	public boolean emPendencia() {
		Iterator<Pagamento> it = pagamentos.iterator();

		while (it.hasNext()) {
			Pagamento comparador = it.next();
			if(comparador.getSaldado()==false) {
				System.out.println(comparador.toString());
			}
		}
		return true;
	}
	public boolean pago(int processo) {
		Iterator<Pagamento> it = pagamentos.iterator();
		boolean status=false;
		while (it.hasNext()) {
			Pagamento comparador = it.next();
			if(comparador.getNumero_processo()==processo) {
				status= true;
				comparador.setSaldado(true);
			}
		}
		return status;
	}
	public boolean addConta(int numero_processo,int preco, boolean pago) {
		int quantindade = pagamentos.size();
		pagamentos.add(new Pagamento(numero_processo, preco, pago));
		
		if(quantindade<pagamentos.size()) {
			return true; 
		}
		else return false;
	}

	
	public void balancoCota() {
		
	}

}
