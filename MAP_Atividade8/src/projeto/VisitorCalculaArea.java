package projeto;

public class VisitorCalculaArea implements VisitorIF{
	public double visitaQuadrado(Quadrado q) {
		return q.getLado()*q.getLado();
	}
	public double visitaRetangulo(Retangulo r) {
		return (r.getAltura()*2)+(r.getLargura()*2);
	}
	public double visitaTriangulo(Triangulo t){
		/*if(t.getLado1()==0|| t.getLado2()==0||t.getLado3()==0) {
			throw new TrianguloException();
		}*/
		 if(t.getLado1()==t.getLado2() && t.getLado1()==t.getLado3()) {
			return ((t.getLado1()*t.getLado1())* Math.sqrt(3))/4;
		}
		else if(t.getLado1()==t.getLado2() || t.getLado1()==t.getLado3() ||t.getLado2()==t.getLado3()) {
			double altura=0;
			
			if(t.getLado1()==t.getLado2()) {
				altura = Math.sqrt(t.getLado1()-(t.getLado3()*t.getLado3()/4));
				return (altura* t.getLado3())/2;
			}
			else if(t.getLado1()==t.getLado3()) {
				altura = Math.sqrt(t.getLado1()-(t.getLado2()*t.getLado2()/4));
				return (altura* t.getLado2())/2;
			}
			else {
				altura = Math.sqrt(t.getLado3()-(t.getLado1()*t.getLado1()/4));
				return (altura* t.getLado1())/2;
			}
			
		}
		/*else {
			double semiperimetro= perimetro()/2;
			return Math.sqrt(semiperimetro*(semiperimetro-t.getLado1())*(semiperimetro-t.getLado2())*(semiperimetro-t.getLado3()));
		}*/
		return (t.getLado1()+t.getLado2()+t.getLado3());
	}
	public double visitaCirculo(Circulo c) {
		return 3.14*c.getRaio()*c.getRaio();
	}
	public double visitaTrapezio(Trapezio tr) {
		return((tr.getBaseMaior()+tr.getBaseMenor())*tr.getAltura())/2;
	}
}
