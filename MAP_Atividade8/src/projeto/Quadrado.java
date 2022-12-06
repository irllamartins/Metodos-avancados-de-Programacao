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
	
	
	public String aceitaVisita(VisitorIF v) throws QuadradoException {
		return v.visitaQuadrado(this);
	}
	
}
