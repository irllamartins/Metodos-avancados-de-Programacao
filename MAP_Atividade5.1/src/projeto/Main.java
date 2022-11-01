package projeto;

public class Main {

	public static void main(String[] args) {

		FigurasGeometricas fig = new FigurasGeometricas();
		
		fig.setCirculo(10);
		fig.setQuadrado(10);
		fig.setRetangulo(10,11);
		fig.setTriangulo(8,10,6);
		
		
		System.out.println(fig.getCirculo().toString());
		System.out.println(fig.getQuadrado().toString());
		System.out.println(fig.getRetangulo().toString());
		System.out.println(fig.getTriangulo().toString());

	}


}
