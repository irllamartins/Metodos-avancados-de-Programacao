package projeto;

public class FigurasGeometricas{

	private Circunferencia circunferencia;
	private Quadrilatero quadrilatero ;

	public FigurasGeometricas(int altura, int largura, int lado, int raio){
		this.circunferencia = new Circunferencia(raio);
		this.quadrilatero  = new Quadrilatero (altura,largura,lado);
		
	}
	
	
	public Circunferencia getCircunferencia() {
		return circunferencia;
	}


	public void setCircunferencia(Circunferencia circunferencia) {
		this.circunferencia = circunferencia;
	}


	public Quadrilatero getQuadrilatero() {
		return quadrilatero;
	}


	public void setQuadrilatero(Quadrilatero quadrilatero) {
		this.quadrilatero = quadrilatero;
	}


	public String circuloPerimetro(){
		try {
			return "O perímetro do círculo é "+ circunferencia.circuloPerimetro();
		}
		catch(CirculoException e) {
			
		}
		return "O perímetro do círculo não foi criado";
	}
	
	public String circuloArea() {
		try {
			return "A area do círculo é "+circunferencia.circuloArea();
		}
		catch(CirculoException e) {
			
		}
		return "A area do círculo não foi criado";
	}
	
	public String quadradoPerimetro(){

		try {
			return "O perímetro do quadrado é: " + quadrilatero.quadradoPerimetro();
		}
		catch(QuadradoException e) {
			
		}
		return "O perímetro do quadrado não foi criado";
	}
	
	public String quadradoArea() {
		try {
			return "A area do quadrado é: "+ quadrilatero.quadradoArea();
		}
		catch(QuadradoException e) {
			
		}
		return "A area do quadrado não foi criado";
		
	}
	
	public String retanguloPerimetro(){
		try {
			return "O perimetro deste retângulo é: "+ quadrilatero.retanguloPerimetro();
		}
		catch(RetanguloException e) {
			
		}
		return "O perimetro do retangulo não criado";
	}
		
	public String retanguloArea() {
		
		try {
			return "A área deste retângulo é: " +quadrilatero.retanguloArea();
		}
		catch(RetanguloException e) {
			
		}
		return "A area do etangulo não criado";
	}
	public String figuras() {
			return "Todas as figuras"+circunferencia.getCirculo().toString() + ",  "+ quadrilatero.getQuadrado().toString() +", "+ quadrilatero.getRetangulo().toString();
		
	}
	@Override
	public String toString() {
			return "Todas as áreas são:  Circulo[" + circuloArea() + ",  "+ circuloPerimetro() +"] , Retangulo[ "+ retanguloArea()+","+ retanguloPerimetro()+ "], Quadrado[" + quadradoArea()+", "+ quadradoPerimetro()+ "]";
		
	}
	
	
}