package projeto;
import java.util.ArrayList;
import java.util.Iterator;

public class Financa {
	private ArrayList<Pagamento> pagamentos;
	private double saldo;
	public Financa() {
		this.pagamentos = new ArrayList<Pagamento>();
		this.saldo = 0;
	}
	
	public ArrayList<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public void setPagamentos(ArrayList<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public double addRemanecente(double acrescemo) throws NegativeException {
		if(acrescemo>=0) {
			setSaldo(getSaldo()+acrescemo);
			return getSaldo();
		}
		else 
			throw new NegativeException();
		
	}

	public int folhaPagamento() {
		Iterator<Pagamento> it = pagamentos.iterator();

		while (it.hasNext()) {
			Pagamento comparador = it.next();
			System.out.println(comparador.toString());
		}
		return pagamentos.size();
	}
	
	public double emPendencia() {
		double divida=0;
		Iterator<Pagamento> it = pagamentos.iterator();

		while (it.hasNext()) {
			Pagamento comparador = it.next();
			if(comparador.getSaldado()==false) {
				System.out.println(comparador.toString());
				divida+=comparador.getPreco();
			}
		}
		return divida;
	}
	public double quitado() {
		double valor=0;
		Iterator<Pagamento> it = pagamentos.iterator();

		while (it.hasNext()) {
			Pagamento comparador = it.next();
			if(comparador.getSaldado()==true) {
				System.out.println(comparador.toString());
				valor+=comparador.getPreco();
			}
		}
		return valor;
	}
	public String quitarConta(int processo) throws NotFoundException, ImpossibleException, NegativeException {
		Iterator<Pagamento> it = pagamentos.iterator();

		while (it.hasNext()) {
			Pagamento comparador = it.next();
			if(comparador.getNumero_processo()==processo) {
				if(comparador.getSaldado()==false ) {
					if(saldo>=comparador.getPreco()) {
						comparador.setSaldado(true);
						saldo-=comparador.getPreco();
						return "Ação realizado com sucesso!";
					}
					throw new NegativeException();
				}
				throw new ImpossibleException();
			}
		}
		throw new NotFoundException();
	}
	
	public String addConta(int numero_processo,int preco, boolean pago) throws QtdException {
		int quantindade = pagamentos.size();
		pagamentos.add(new Pagamento(numero_processo, preco, pago));
		
		if(quantindade<pagamentos.size()) {
			return "Ação realizado com sucesso!"; 
		}
		else 
			throw new QtdException(); 
	}


}
