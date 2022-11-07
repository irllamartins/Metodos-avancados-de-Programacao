package projeto;

public class Taxista extends Profissional {
	private int passageiro;
	private double km;
	public Taxista(String nome, int cpf, String profissao, double salario, int passageiro,double km) {
		super(nome, cpf, profissao, salario);
		atualizarPassageiro(passageiro);
	}
	
	public int getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(int passageiro) {
		this.passageiro = passageiro;
	}

	public void atualizarPassageiro(int passageiro) {
		setPassageiro(passageiro);
		
	}
	public double tarifa() {
		return passageiro*0.5;
	}
	public double desconto() {
		return km*0.01;
	}
	
	@Override
	public String toString() {
		return "Taxista [ Nome: " + getNome()+ ", Salario: "+ getSalario() + ", tarifa: " + tarifa() + ", desconto: " + desconto()  + "]";
	}

}