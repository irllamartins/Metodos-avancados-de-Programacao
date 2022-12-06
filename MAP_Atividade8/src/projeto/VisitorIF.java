package projeto;

public interface VisitorIF {
	public String visitaQuadrado(Quadrado q) throws QuadradoException;
	public String visitaCirculo(Circulo c) throws CirculoException;
	public String visitaRetangulo(Retangulo r) throws RetanguloException;
	public String visitaTriangulo(Triangulo t) throws TrianguloException ;
	public String visitaTrapezio(Trapezio tr) throws TrapezioException;
}
