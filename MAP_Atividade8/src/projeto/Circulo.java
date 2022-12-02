package projeto;

public class Circulo implements ElementoConcretoIF{
	private double raio;
	
	public Circulo(double r) {
		this.raio = r;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public void aceitaVisita(VisitorIF v) {
		 v.visitaCirculo(this);
	}
	
	/*@Override
	public String toString() {
		try {
			return "Circulo [raio: " + raio +"]";
		} catch (CirculoException e) {
			return  "Ocorreu um erro no calculo da area ou perimentro!";
		}
	
	}*/
	

}
