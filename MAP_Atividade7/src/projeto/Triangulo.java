package projeto;


public abstract class Triangulo {
	private double angulo1;
	private double angulo2;
	private double angulo3;
	public Triangulo(double angulo1,double angulo2,double angulo3) {
		this.angulo1 = angulo1;
		this.angulo2 = angulo2;
		this.angulo3 = angulo3;
		
	}

	public double getAngulo1() {
		return angulo1;
	}

	public void setAngulo1(double angulo1) {
		this.angulo1 = angulo1;
	}

	public double getAngulo2() {
		return angulo2;
	}

	public void setAngulo2(double angulo2) {
		this.angulo2 = angulo2;
	}

	public double getAngulo3() {
		return angulo3;
	}

	public void setAngulo3(double angulo3) {
		this.angulo3 = angulo3;
	}

	public abstract String desenhar();

	public abstract String toString();

	
	

}
