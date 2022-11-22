package projeto;

public class Main {

	public static void main(String[] args) {

		FigurasGeometricas fig = new FigurasGeometricas(10, 5, 0, 25);
		
		
		System.out.println(fig.circuloArea());
		System.out.println(fig.circuloPerimetro());
		
		System.out.println(fig.quadradoArea());
		System.out.println(fig.quadradoPerimetro());
		
		System.out.println(fig.retanguloArea());
		System.out.println(fig.retanguloPerimetro());
		
		System.out.println(fig.toString());
		System.out.println(fig.figuras());
	}


}
