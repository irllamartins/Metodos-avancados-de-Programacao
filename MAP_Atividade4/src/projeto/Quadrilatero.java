package projeto;

public class Quadrilatero {
	private Quadrado quadrado;
	private Retangulo retangulo;
	
	public Quadrilatero(int altura, int largura,int lado) {
		this.quadrado = new Quadrado(lado);
		this.retangulo = new Retangulo(altura,largura);
	}
	
	
	public Quadrado getQuadrado() {
		return quadrado;
	}


	public void setQuadrado(Quadrado quadrado) {
		this.quadrado = quadrado;
	}


	public Retangulo getRetangulo() {
		return retangulo;
	}


	public void setRetangulo(Retangulo retangulo) {
		this.retangulo = retangulo;
	}


	public double quadradoPerimetro() throws QuadradoException{
		if(quadrado.getLado()>0) {
			return quadrado.getLado()*4;
		}
		else {
			throw new QuadradoException();
		}
		
	}
	public double retanguloPerimetro() throws RetanguloException{
		if(retangulo.getLargura()>0 && retangulo.getAltura()>0) {
			return (retangulo.getLargura()*2)+(retangulo.getAltura()*2);
		}
		else {
			throw new RetanguloException();
		}
	}
	
	public double quadradoArea() throws QuadradoException{
		if(quadrado.getLado()>0) {
			return quadrado.getLado()*quadrado.getLado();
		}
		else {
			throw new QuadradoException();
		}
	}
	public double retanguloArea() throws RetanguloException{
		if(retangulo.getLargura()>0 && retangulo.getAltura()>0) {
			return retangulo.getLargura()*retangulo.getAltura();
		}
		else {
			throw new RetanguloException();
		}
		
	}

}
