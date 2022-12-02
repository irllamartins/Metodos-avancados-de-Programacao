package projeto;

public class VisitorCalculaPerimetro implements VisitorIF{
	public double visitaQuadrado(Quadrado q) {
		return q.getLado()^4;
	}
	public double visitaRetangulo(Retangulo r) {
		return r.getAltura()*r.getLargura();
	}
	public double visitaTriangulo(Triangulo t) {
		return (t.getLado1()*t.getLado2())/2;
	}
	public double visitaCirculo(Circulo c) {
		return 2*3.14*c.getRaio();
	}
	public double visitaTrapezio(Trapezio tr) {
		return tr.getBaseMaior()+tr.getBaseMenor()+tr.getLado1()+tr.getLado2();
	}


}
