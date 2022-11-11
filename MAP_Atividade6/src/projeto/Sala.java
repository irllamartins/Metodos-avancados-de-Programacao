package projeto;

public class Sala {
	private int numero;
	private int capacidade;
	private boolean disponivel;
	public Sala( int numero,int capacidade, boolean disponivel) {
		this.numero = numero;
		this.capacidade = capacidade;
		this.disponivel = disponivel;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public boolean getDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	@Override
	public String toString() {
		return "Sala [numero: " + numero + ", capacidade: " + capacidade + ", disponivel: " + disponivel + "]";
	}
	
	

}
