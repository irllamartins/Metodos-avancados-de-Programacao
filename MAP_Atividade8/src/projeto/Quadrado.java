package projeto;

public class Quadrado implements ElementoConcretoIF{
	private int lado;
	
	public Quadrado(int lado) {
		this.lado = lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	
	public void aceitaVisita(VisitorIF v) {
		 v.visitaQuadrado(this);
	}
	
	
	/*@Override
	public String toString() {
		try {
			return "Quadrado [lado: " + lado +", Perimetro: "+ perimetro() +", Area: "+ area()+"]";
		} catch (QuadradoException e) {
			return  "Ocorreu um erro no calculo da area ou perimentro!";
		}
	}*/

	
}
