package projeto;

public class Retangulo implements Propriedade{
	private int altura;
	private int largura;
	
	public Retangulo(int altura,int largura){
		this.altura = altura;
		this.largura = largura;
	}
	
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	
	@Override
	public double area() throws RetanguloException {
		if(getLargura()>0 && getAltura()>0) {
			return getLargura()*getAltura();
		}
		else {
			throw new RetanguloException();
		}
	}


	@Override
	public double perimetro() throws RetanguloException {
		if(getLargura()>0 && getAltura()>0) {
			return (getLargura()*2)+(getAltura()*2);
		}
		else {
			throw new RetanguloException();
		}
		
	}
	@Override
	public String desenhar() {
		return "Desenhando um retangulo!";
	}
	@Override
	public String toString() {
		try {
			return "Retangulo [altura: " + altura + ", largura: " + largura +", Perimetro: "+ perimetro() +", Area: "+ area()+ "]";
		} catch ( RetanguloException e) {
			return "Ocorreu um erro no calculo da area ou perimentro!";
		}
	}

	
}
