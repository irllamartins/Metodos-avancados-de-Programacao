package projeto;


public class Equilatero extends Triangulo {

	public Equilatero(double angulo1,double angulo2,double angulo3) {
		super(angulo1,angulo2,angulo3);
	}

	
	@Override
	public String desenhar() {
		return "Desenhando um triangulo Equilatero!";
	}
	
	@Override
	public String toString(){
		return "Triangulo [ tipo: Equilatero, angulo1: " + getAngulo1() + ", angulo2: " + getAngulo2() + ", angulo3: " + getAngulo3()+"]";
	}
	

}
