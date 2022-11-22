package projeto;

import java.util.ArrayList;

public class Singleton {

	private static Singleton singleton = null;
	private static Circulo circulo;
	private ArrayList<Quadrado> quadrados;
	private ArrayList<Triangulo> triangulos;

	private Singleton() {
		this.quadrados = new ArrayList<Quadrado>();
		this.triangulos = new ArrayList<Triangulo>();

	}

	public static Singleton getSingleton() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

	public static Circulo getCirculo() {
		return circulo;
	}

	public Circulo setCirculo(double raio) {
		if (circulo == null) {
			Singleton.circulo = new Circulo(raio);
		}
		return circulo;

	}

	public ArrayList<Quadrado> getQuadrado() {
		return quadrados;
	}

	public void setQuadrado(int lado) {
		quadrados.add(new Quadrado(lado));
	}

	public ArrayList<Triangulo> getTriangulo() {
		return triangulos;
	}

	public ArrayList<Triangulo> setTriangulo(double angulo1, double angulo2, double angulo3) throws TrianguloException {
		ArrayList<Triangulo> trianguloEncontrado = new ArrayList<Triangulo>();

		if (triangulos.size() == 0) {
			triangulos.add(criarTriangulo(angulo1, angulo2, angulo3));
			trianguloEncontrado.add(triangulos.get(triangulos.size() - 1));
			return trianguloEncontrado;
		} else if (triangulos.size() < 3) {

			for (int i = 0; i < triangulos.size(); i++) {
				if (triangulos.get(i) instanceof Equilatero && angulo1 == angulo2 && angulo1 == angulo3) {
					trianguloEncontrado.add(triangulos.get(triangulos.size() - 1));
					return trianguloEncontrado;
				} else if (triangulos.get(i) instanceof Isoceles
						&& (angulo1 == angulo2 && angulo2!= angulo3 || angulo1 == angulo3 && angulo2!= angulo3 || angulo1 != angulo2 && angulo2 == angulo3)) {
					trianguloEncontrado.add(triangulos.get(triangulos.size() - 1));
					return trianguloEncontrado;
				} else if (triangulos.get(i) instanceof Retangulo
						&& (angulo1 != angulo2 && angulo1 != angulo3 && angulo2 != angulo3)) {
					trianguloEncontrado.add(triangulos.get(triangulos.size() - 1));
					return trianguloEncontrado;
				} else if (i + 1 == triangulos.size()) {
					triangulos.add(criarTriangulo(angulo1, angulo2, angulo3));
					trianguloEncontrado.add(triangulos.get(triangulos.size() - 1));
					return trianguloEncontrado;
				}
			}
		}

		else
			trianguloEncontrado = triangulos;

		return trianguloEncontrado;
	}

	private Triangulo criarTriangulo(double angulo1, double angulo2, double angulo3) throws TrianguloException {
		Triangulo triangulo;

		if (angulo1 + angulo2 + angulo3 != 180 || angulo1 ==0|| angulo2  == 0|| angulo3==0 ) {
			 throw new TrianguloException();
		} else {
			if (angulo1 == angulo2 && angulo1 == angulo3) {

				triangulo = new Equilatero(angulo1, angulo2, angulo3);
			} else if (angulo1 == angulo2 || angulo1 == angulo3 || angulo2 == angulo3) {
				triangulo = new Isoceles(angulo1, angulo2, angulo3);
			} else {
				triangulo = new Retangulo(angulo1, angulo2, angulo3);
			}
			return triangulo;
		}

	}

	@Override
	public String toString() {
		return "FigurasGeometricas [" + circulo.toString() + ", " + quadrados.toString() + ", " + triangulos.toString()
				+ "]";
	}

	

}
