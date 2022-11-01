package projeto;

public interface Propriedade {
	double area() throws CirculoException, RetanguloException, QuadradoException, TrianguloException;
	double perimetro() throws CirculoException, RetanguloException, QuadradoException, TrianguloException;
	String desenhar();
}
