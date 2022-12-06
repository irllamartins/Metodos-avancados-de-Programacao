package projeto;

public class VisitorCalculaArea implements VisitorIF{
	public String visitaQuadrado(Quadrado q) throws QuadradoException {
		if(q.getLado()<=0) {
			throw new QuadradoException();
		}
		return ""+q.getLado()*q.getLado();
	}
	public String visitaRetangulo(Retangulo r) throws RetanguloException {
		if(r.getLargura()<=0||r.getAltura()<=0) {
			throw new RetanguloException();
		}
		return ""+(r.getAltura()*r.getLargura());
	}
	public String visitaTriangulo(Triangulo t) throws TrianguloException{
		if(t.getLado1()<=0|| t.getLado2()<=0||t.getLado3()<=0) {
			throw new TrianguloException();
		}
		 if(t.getLado1()==t.getLado2() && t.getLado1()==t.getLado3()) {
			return ""+(((t.getLado1()*t.getLado1())* Math.sqrt(3))/4);
		}
		else if(t.getLado1()==t.getLado2() || t.getLado1()==t.getLado3() ||t.getLado2()==t.getLado3()) {
			double altura=0;
			
			if(t.getLado1()==t.getLado2()) {
				altura = Math.sqrt(t.getLado1()-(t.getLado3()*t.getLado3()/4));
				return ""+((altura* t.getLado3())/2);
			}
			else if(t.getLado1()==t.getLado3()) {
				altura = Math.sqrt(t.getLado1()-(t.getLado2()*t.getLado2()/4));
				return ""+((altura* t.getLado2())/2);
			}
			else {
				altura = Math.sqrt(t.getLado3()-(t.getLado1()*t.getLado1()/4));
				return ""+((altura* t.getLado1())/2);
			}
			
		}
		else {
			double semiperimetro= (t.getLado1()+t.getLado2()+t.getLado3())/2;
			return ""+ (Math.sqrt(semiperimetro*(semiperimetro-t.getLado1())*(semiperimetro-t.getLado2())*(semiperimetro-t.getLado3())));
		}
	}
	
	public String visitaCirculo(Circulo c) throws CirculoException {
		if(c.getRaio()<=0) {
			throw new CirculoException();
		}
		return ""+ (3.14*c.getRaio()*c.getRaio());
	}
	public String visitaTrapezio(Trapezio tr) throws TrapezioException {
		if(tr.getBaseMaior()<=0|| tr.getBaseMenor()<=0||tr.getAltura()<=0||tr.getLado1()<=0||tr.getLado2()<=0) {
			throw new TrapezioException();
		}
		return ""+(((tr.getBaseMaior()+tr.getBaseMenor())*tr.getAltura())/2);
	}
	
}
