package projeto;

public class Main {

	public static void main(String[] args) {

		VisitorIF visitorQA = new VisitorCalculaArea();
		VisitorIF visitorQP = new VisitorCalculaArea();
		Quadrado quadrado = new Quadrado(10);
		quadrado.aceitaVisita(visitorQA);
		quadrado.aceitaVisita(visitorQP);
		
		

		VisitorIF visitorRA = new VisitorCalculaArea();
		VisitorIF visitorRP = new VisitorCalculaArea();
		Retangulo retangulo = new Retangulo(15,10);
		retangulo.aceitaVisita(visitorRA);
		retangulo.aceitaVisita(visitorRP);
		

		VisitorIF visitorTrA = new VisitorCalculaArea();
		VisitorIF visitorTrP = new VisitorCalculaArea();
		Trapezio trapezio = new Trapezio(5,15,8,10,10);
		trapezio.aceitaVisita(visitorTrA);
		trapezio.aceitaVisita(visitorTrP);
		

		VisitorIF visitorCA = new VisitorCalculaArea();
		VisitorIF visitorCP = new VisitorCalculaArea();
		Circulo circulo = new Circulo(15);
		circulo.aceitaVisita(visitorCA);
		circulo.aceitaVisita(visitorCP);
		circulo.aceitaVisita(visitorCP);
		
		VisitorIF visitorTA = new VisitorCalculaArea();
		VisitorIF visitorTP = new VisitorCalculaArea();
		Triangulo triangulo = new Triangulo(8,15,10);
		triangulo.aceitaVisita(visitorTA);
		triangulo.aceitaVisita(visitorTP);
	}


}
