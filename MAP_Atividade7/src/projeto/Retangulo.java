package projeto;


public class Retangulo extends Triangulo {
	
	public Retangulo(double angulo1,double angulo2,double angulo3) {
		super(angulo1,angulo2,angulo3);
	}


	@Override
	public String desenhar() {

		return "Desenhando um triangulo Retangulo!";
	}
	
	@Override
	public String toString(){
		return "Triangulo [ tipo: Retangulo, angulo1: " + getAngulo1() + ", angulo2: " + getAngulo2() + ", angulo3: " + getAngulo3()+"]";
	}

}
