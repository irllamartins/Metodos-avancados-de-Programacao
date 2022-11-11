package projeto;

public class Pagamento {
	private int numero_processo;
	private double preco;
	private boolean saldado;
	public Pagamento(int numero_processo,double preco,boolean saldado) {
		this.numero_processo=numero_processo;
		this.preco=preco;
		this.saldado = saldado;
	}
	public int getNumero_processo() {
		return numero_processo;
	}
	public void setNumero_processo(int numero_processo) {
		this.numero_processo = numero_processo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public boolean getSaldado() {
		return saldado;
	}
	public void setSaldado(boolean saldado) {
		this.saldado = saldado;
	}
	@Override
	public String toString() {
		return "Pagamento [numero_processo: " + numero_processo + ", preco: " + preco + ", saldado: " + saldado + "]";
	}
	
}
