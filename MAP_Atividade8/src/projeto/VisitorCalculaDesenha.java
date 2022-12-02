package projeto;

public class VisitorCalculaDesenha implements VisitorIF{
	public String visitaQuadrado(Quadrado q) {
		return "desenha quadrado";
	}
	public String visitaRetangulo(Retangulo r) {
		return "desenha retangulo";
	}
	public String visitaTriangulo(Triangulo t) {
		return "desenha triangulo";
	}
	public String visitaCirculo(Circulo c) {
		return "desenha circulo";
	}
	public String visitaTrapezio(Trapezio tr) {
		return "desenha trapezio";
	}
	
}
