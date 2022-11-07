package projeto;

public class Medico extends Profissional {
	private int paciente;
	private double despesas;
	public Medico(String nome, int cpf, String profissao, double salario, int paciente, double despesas) {
		super(nome, cpf, profissao, salario);
		atualizarPaciente(paciente);
		atualizarDespesas(despesas);
	}
	
	public int getPaciente() {
		return paciente;
	}

	public void setPaciente(int paciente) {
		this.paciente = paciente;
	}

	public double getDespesas() {
		return despesas;
	}

	public void setDespesas(double despesas) {
		this.despesas = despesas;
	}

	public void atualizarPaciente(int paciente) {
		setPaciente(paciente);	
	}
	
	public void atualizarDespesas(double despesas) {
		setDespesas(despesas);	
	}
	public double tarifa() {
		return paciente*10;
	}
	public double desconto() {
		return despesas;
	}

	@Override
	public String toString() {
		return "Medico [ Nome: " + getNome()+ ", Salario: "+ getSalario() + ", tarifa: " + tarifa() + ", desconto: " + desconto()  + "]"; 
		
	}
	

}
