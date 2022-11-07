package projeto;

public class Carro extends Patrimonio {
	private int ano;

	public Carro(int id, double valor, int ano) {
		super(id, valor);

		this.ano = ano;

	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Carro [Id: " + getId() + ", Valor: " + getValor() + ", ano:" + ano + "]";
	}

}
