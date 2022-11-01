package projeto;


public class Triangulo implements Propriedade{
	private int lado1;
	private int lado2;
	private int lado3;
	
	public Triangulo(int lado1,int lado2,int lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	public int getLado3() {
		return lado3;
	}

	public void setLado3(int lado3) {
		this.lado3 = lado3;
	}

	@Override
	public double area() throws TrianguloException {
		if(lado1==lado2 && lado1==lado3) {
			return ((lado1*lado1)* Math.sqrt(3))/4;
		}
		else if(lado1==lado2 || lado1==lado3 ||lado2==lado3) {
			double altura=0;
			
			if(lado1==lado2) {
				altura = Math.sqrt(lado1-(lado3*lado3/4));
				return (altura* lado3)/2;
			}
			else if(lado1==lado3) {
				altura = Math.sqrt(lado1-(lado2*lado2/4));
				return (altura* lado2)/2;
			}
			else {
				altura = Math.sqrt(lado2-(lado1*lado1/4));
				return (altura* lado1)/2;
			}
			
		}
		else {
			double semiperimetro= perimetro()/2;
			return Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3));
		}
	}

	@Override
	public double perimetro() throws TrianguloException {
		
		return lado1+lado2+lado3;
	}

	@Override
	public String desenhar() {
		if(lado1==lado2 && lado1==lado3) {
			return "Desenhando um triangulo Equilatero!";
		}
		else if(lado1==lado2 || lado1==lado3 ||lado2==lado3) {
			return "Desenhando um triangulo isoceles!";
		}
		else {
			return "Desenhando um triangulo Escaleno!";
		}
	}

	@Override
	public String toString(){
		try {
			return "Triangulo [lado1: " + lado1 + ", lado2: " + lado2 + ", lado3: " + lado3+", Perimetro: "+ perimetro() +", Area: "+ area()+ "]";
		} catch (TrianguloException e) {
			return  "Ocorreu um erro no calculo da area ou perimentro!";
		}
	}

	
	

}
