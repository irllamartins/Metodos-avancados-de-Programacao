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
	public String aceitaVisita(VisitorIF v) throws RetanguloException {
		return v.visitaRetangulo(this);
		
	}
	
}
