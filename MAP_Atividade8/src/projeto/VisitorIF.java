package projeto;

public interface VisitorIF {
	public double visitaQuadrado(Quadrado q);
	public double visitaCirculo(Circulo c);
	public double visitaRetangulo(Retangulo r);
	public double visitaTriangulo(Triangulo t) ;
	public double visitaTrapezio(Trapezio tr);
}
