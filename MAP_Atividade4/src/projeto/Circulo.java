package projeto;

public class Circulo {
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	@Override
	public String toString() {
		return "Circulo [raio=" + raio + "]";
	}
	

}
