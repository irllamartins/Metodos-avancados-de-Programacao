package projeto;

public class Professor extends Profissional{
	private double material;
	private double salarioMinimo;
	public Professor(String nome, int cpf, String profissao, double salario, double material, double salarioMinimo) {
		super(nome, cpf, profissao, salario);
		this.material = material;
		this.salarioMinimo = salarioMinimo;
	
	}
	
	public double getMaterial() {
		return material;
	}

	public void setMaterial(double material) {
		this.material = material;
	}

	public double getSalarioMinimo() {
		return salarioMinimo;
	}

	public void setSalarioMinimo(double salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
	}

	public void atualizarMaterial(double materialGasto) {
		setMaterial(materialGasto);
		
	}
	public void atualizarSalarioMinimo(double salarioMinimo) {
		setSalarioMinimo(salarioMinimo);
		
	}
	public double tarifa() {
		if(getSalario()<=salarioMinimo) {
			return getSalario()*0.05;
		}
		else if(getSalario()<=salarioMinimo*5) {
			return getSalario()*0.1;
		}
		return getSalario()*0.2;
	}
	public double desconto() {
		return material*0.5;
	}

	@Override
	public String toString() {
		return "Professor [ Nome: " + getNome()+ ", Salario: "+ getSalario() + ", tarifa: " + tarifa() + ", desconto: " + desconto()  + "]";
	}
	
	

}
