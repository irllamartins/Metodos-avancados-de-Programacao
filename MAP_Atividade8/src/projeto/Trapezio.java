package projeto;

public class Trapezio {
	private double baseMenor;
	private double baseMaior;
	private double altura;
	private double lado1;
	private double lado2;
	public Trapezio(double maior,double menor, double altura, double lado1, double lado2) {
		this.baseMaior = maior;
		this.baseMenor = menor;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	
	public double getBaseMenor() {
		return baseMenor;
	}


	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}


	public double getBaseMaior() {
		return baseMaior;
	}


	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getLado1() {
		return lado1;
	}


	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}


	public double getLado2() {
		return lado2;
	}


	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}


	public void aceitaVisita(VisitorIF v) {
		 v.visitaTrapezio(this);
	}
}
