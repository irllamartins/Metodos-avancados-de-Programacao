package projeto;

public class FigurasGeometricas{

	private Retangulo retangulo;
	private Circulo circulo;
	private Quadrado quadrado;
	private Triangulo triangulo;

	public FigurasGeometricas(){
		
	}
	

	public Retangulo getRetangulo() {
		return retangulo;
	}


	public void setRetangulo(int altura, int largura) {
		this.retangulo = new Retangulo(altura,largura);
	}


	public Circulo getCirculo() {
		return circulo;
	}


	public void setCirculo(double raio) {
		this.circulo = new Circulo(raio);
	}


	public Quadrado getQuadrado() {
		return quadrado;
	}


	public void setQuadrado(int lado) {
		this.quadrado = new Quadrado(lado);
	}


	public Triangulo getTriangulo() {
		return triangulo;
	}


	public void setTriangulo(int lado1,int lado2,int lado3) {
		this.triangulo = new Triangulo(lado1,lado2,lado3);
	}


	@Override
	public String toString() {
		return "FigurasGeometricas [" + retangulo.toString() + ", " + circulo.toString() + ", " + quadrado.toString()
				+ ", " + triangulo.toString() + "]";
	}

	
	
	
}
