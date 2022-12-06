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
	public String aceitaVisita(VisitorIF v) throws CirculoException {
		return v.visitaCirculo(this);
	}

}
