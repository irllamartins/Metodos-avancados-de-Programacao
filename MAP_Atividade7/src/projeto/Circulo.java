package projeto;

public class Circulo implements Propriedade{
	private double raio;
	private double pi=3.14;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double perimetro() throws CirculoException {
		if(getRaio()>0) {
			return getRaio()*pi*2;
		}
		else {
			 throw new CirculoException();
		}
		
	}
	@Override
	public double area() throws CirculoException {
		if(getRaio()>0) {
			return getRaio()*getRaio()*pi;
		}
		else {
			 throw new CirculoException();
		}
		
	}
	@Override
	public String toString() {
		try {
			return "Circulo [raio: " + raio +", Perimetro: "+ perimetro() +", Area: "+ area()+"]";
		} catch (CirculoException e) {
			return  "Ocorreu um erro no calculo da area ou perimentro!";
		}
	}
	@Override
	public String desenhar() {
		return "Desenhando um circulo!";

	}
	

}
