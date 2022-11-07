package projeto;

public class Caminhaneiro extends Profissional {
	private double toneladas;
	private float km;
	public Caminhaneiro(String nome, int cpf, String profissao, double salario,double peso,float km) {
		super(nome, cpf, profissao, salario);
		atualizarToneladas(peso);
		atualizarKm(km);
	}
	
	public double getToneladas() {
		return toneladas;
	}

	public void setToneladas(double peso) {
		this.toneladas = peso;
	}
	
	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public void atualizarToneladas(double peso) {
		setToneladas(peso);
		
	}
	public void atualizarKm(float km) {
		setKm(km);
		
	}
	public double tarifa() {
		if(toneladas<11) {
			return 500;
		}
		else
		return (toneladas-10)*100+500;
	}
	public double desconto() {
		return km*0.01;
	}
	@Override
	public String toString() {
		return "Caminhaneiro [ Nome: " + getNome()+ ", Salario: "+ getSalario() + ", tarifa: " + tarifa() + ", desconto: " + desconto()  + "]";
	}
}
