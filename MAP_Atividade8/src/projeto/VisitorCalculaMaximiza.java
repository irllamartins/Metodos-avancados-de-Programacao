package projeto;

public class VisitorCalculaMaximiza implements VisitorIF{
	public String visitaQuadrado(Quadrado q) throws QuadradoException {
		if(q.getLado()<=0) {
			throw new QuadradoException();
		}
		q.setLado(q.getLado()*2);
		return "Figura maximizada!";
	}
	public String visitaRetangulo(Retangulo r) throws RetanguloException {
		if(r.getLargura()<=0||r.getAltura()<=0) {
			throw new RetanguloException();
		}
		r.setAltura(r.getAltura()*2);
		r.setLargura(r.getLargura()*2);
		return "Figura maximizada!";
	}
	public String visitaTriangulo(Triangulo t) throws TrianguloException {
		if(t.getLado1()<=0|| t.getLado2()<=0||t.getLado3()<=0) {
			throw new TrianguloException();
		}
		t.setLado1(t.getLado1()*2);
		t.setLado2(t.getLado2()*2);
		t.setLado3(t.getLado3()*2);
		return "Figura maximizada!";
	}
	public String visitaCirculo(Circulo c) throws CirculoException {
		if(c.getRaio()<=0) {
			throw new CirculoException();
		}
		c.setRaio(c.getRaio()*2);
		return "Figura maximizada!";
	}
	public String visitaTrapezio(Trapezio tr) throws TrapezioException {
		if(tr.getBaseMaior()<=0|| tr.getBaseMenor()<=0||tr.getAltura()<=0||tr.getLado1()<=0||tr.getLado2()<=0) {
			throw new TrapezioException();
		}
		tr.setBaseMaior(tr.getBaseMaior()*2);
		tr.setBaseMenor(tr.getBaseMenor()*2);
		tr.setAltura(tr.getAltura()*2);
		tr.setLado1(tr.getLado1()*2);
		tr.setLado2(tr.getLado2()*2);
		return "Figura maximizada!";
	}

}
