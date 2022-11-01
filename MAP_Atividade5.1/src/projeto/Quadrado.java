package projeto;

public class Quadrado implements Propriedade{
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
	
	public double perimetro() throws QuadradoException{
		if(getLado()>0) {
			return getLado()*4;
		}
		else {
			throw new QuadradoException();
		}
		
	}
	
	
	public double area() throws QuadradoException{
		if(getLado()>0) {
			return getLado()*getLado();
		}
		else {
			throw new QuadradoException();
		}
	}
	@Override
	public String toString() {
		try {
			return "Quadrado [lado: " + lado +", Perimetro: "+ perimetro() +", Area: "+ area()+"]";
		} catch (QuadradoException e) {
			return  "Ocorreu um erro no calculo da area ou perimentro!";
		}
	}

	@Override
	public String desenhar() {
		return "Desenhando um quadrado!";
	}
	
}
