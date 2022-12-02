package projeto;

public class Retangulo implements ElementoConcretoIF{
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
	public void aceitaVisita(VisitorIF v) {
		v.visitaRetangulo(this);
		
	}

	
	
	/*@Override
	public String toString() {
		try {
			return "Retangulo [altura: " + altura + ", largura: " + largura +", Perimetro: "+ perimetro() +", Area: "+ area()+ "]";
		} catch ( RetanguloException e) {
			return "Ocorreu um erro no calculo da area ou perimentro!";
		}
	}*/

	
}
