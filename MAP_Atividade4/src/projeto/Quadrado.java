package projeto;

public class Quadrado {
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

	@Override
	public String toString() {
		return "Quadrado [lado=" + lado + "]";
	}
	
}
