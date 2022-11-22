package projeto;

public class Circunferencia {
	
	private Circulo circulo;
	private double pi=3.14;
	public Circunferencia(double raio) {
		this.circulo = new Circulo(raio);
	}
	public Circulo getCirculo() {
		return circulo;
	}
	public void setCirculo(Circulo circulo) {
		this.circulo = circulo;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public double circuloPerimetro() throws CirculoException {
		if(circulo.getRaio()>0) {
			return circulo.getRaio()*pi*2;
		}
		else {
			 throw new CirculoException();
		}
		
	}
	public double circuloArea() throws CirculoException {
		if(circulo.getRaio()>0) {
			return circulo.getRaio()*circulo.getRaio()*pi;
		}
		else {
			 throw new CirculoException();
		}
		
	}

}
