package projeto;

public class Main {

	public static void main(String[] args) {

		VisitorIF visitorA = new VisitorCalculaArea();
		VisitorIF visitorP = new VisitorCalculaPerimetro();
		VisitorIF visitorD = new VisitorCalculaDesenha();
		VisitorIF visitorM = new VisitorCalculaMaximiza();
		
		Quadrado quadrado = new Quadrado(10);
		System.out.println("->Quadrado");
		System.out.println("-Area");
		try {
		System.out.println(quadrado.aceitaVisita(visitorA));
		} catch (QuadradoException e) {
			
		}
		System.out.println("-Perimetro");
		try {
		System.out.println(quadrado.aceitaVisita(visitorP));
		} catch (QuadradoException e) {
			
		}
		System.out.println("-Desenha forma");
		try {
			System.out.println(quadrado.aceitaVisita(visitorD));
		} catch (QuadradoException e) {
				
		}
		System.out.println("-Maximinizar forma");
		try {
			System.out.println(quadrado.aceitaVisita(visitorM));
		} catch (QuadradoException e) {
				
		}
		System.out.println("-Area");
		try {
			System.out.println(quadrado.aceitaVisita(visitorA));
		} catch (QuadradoException e) {
				
		}
		System.out.println("-Perimetro");
		try {
			System.out.println(quadrado.aceitaVisita(visitorP));
		} catch (QuadradoException e) {
				
		}
		System.out.println("-Desenha forma");
		try {
			System.out.println(quadrado.aceitaVisita(visitorD));
		} catch (QuadradoException e) {
					
		}	
		System.out.println();

		Retangulo retangulo = new Retangulo(15,10);
		System.out.println("->Retangulo");
		System.out.println("-Area");
		try {
			System.out.println(retangulo.aceitaVisita(visitorA));
		} catch (RetanguloException e) {
			
		}
		System.out.println("-Perimetro");
		try {
			System.out.println(retangulo.aceitaVisita(visitorP));
		} catch (RetanguloException e) {
			
		}
		System.out.println("-Desenha forma");
		try {
			System.out.println(retangulo.aceitaVisita(visitorD));
		} catch (RetanguloException e) {
				
		}
		System.out.println("-Maximinizar forma");
		try {
			System.out.println(retangulo.aceitaVisita(visitorM));
		} catch (RetanguloException e) {
				
		}
		System.out.println("-Area");
		try {
			System.out.println(retangulo.aceitaVisita(visitorA));
		} catch (RetanguloException e) {
			
		}
		System.out.println("-Perimetro");
		try {
			System.out.println(retangulo.aceitaVisita(visitorP));
		} catch (RetanguloException e) {
			
		}
		System.out.println("-Desenha forma");
		try {
			System.out.println(retangulo.aceitaVisita(visitorD));
		} catch (RetanguloException e) {
				
		}
		System.out.println();
		
		Trapezio trapezio = new Trapezio(5,15,8,10,10);
		System.out.println("->Trapezio");
		System.out.println("-Area");
		try {
			System.out.println(trapezio.aceitaVisita(visitorA));
		} catch (TrapezioException e) {
			
		}
		System.out.println("-Perimetro");
		try {
			System.out.println(trapezio.aceitaVisita(visitorP));
		} catch (TrapezioException e) {
			
		}
		System.out.println("-Desenha forma");
		try {
			System.out.println(trapezio.aceitaVisita(visitorD));
		} catch (TrapezioException e) {
				
		}
		System.out.println("-Maximinizar forma");
		try {
			System.out.println(trapezio.aceitaVisita(visitorM));
		} catch (TrapezioException e) {
				
		}
		System.out.println("-Area");
		try {
			System.out.println(trapezio.aceitaVisita(visitorA));
		} catch (TrapezioException e) {
				
		}
		System.out.println("-Perimetro");
		try {
			System.out.println(trapezio.aceitaVisita(visitorP));
		} catch (TrapezioException e) {
				
		}
		System.out.println("-Desenha forma");
		try {
			System.out.println(trapezio.aceitaVisita(visitorD));
		} catch (TrapezioException e) {
					
		}
		System.out.println();
		
		Circulo circulo = new Circulo(10);
		System.out.println("->Circulo");
		System.out.println("-Area");
		try {
		System.out.println(circulo.aceitaVisita(visitorA));
		} catch (CirculoException e) {
			
		}
		System.out.println("-Perimetro");
		try {
			System.out.println(circulo.aceitaVisita(visitorP));
		} catch (CirculoException e) {
			
		}
		System.out.println("-Desenha forma");
		try {
			System.out.println(circulo.aceitaVisita(visitorD));
		} catch (CirculoException e) {
				
		}
		System.out.println("-Maximinizar forma");
		try {
			System.out.println(circulo.aceitaVisita(visitorM));
		} catch (CirculoException e) {
				
		}
		System.out.println("-Area");
		try {
			System.out.println(circulo.aceitaVisita(visitorA));
		} catch (CirculoException e) {
				
		}
		System.out.println("-Perimetro");
		try {
			System.out.println(circulo.aceitaVisita(visitorP));
		} catch (CirculoException e) {
				
		}
		System.out.println("-Desenha forma");
		try {
			System.out.println(circulo.aceitaVisita(visitorD));
		} catch (CirculoException e) {
					
		}
		System.out.println();
			
		Triangulo triangulo = new Triangulo(8,15,10);
		System.out.println("->Triangulo");
		System.out.println("-Area");
		try {
			System.out.println(triangulo.aceitaVisita(visitorA));
		} catch (TrianguloException e) {
		
		}
		System.out.println("-Perimetro");
		try {
			System.out.println(triangulo.aceitaVisita(visitorP));
		} catch (TrianguloException e) {
			
		}
		System.out.println("-Desenha forma");
		try {
			System.out.println(triangulo.aceitaVisita(visitorD));
		} catch (TrianguloException e) {
		
		}
		System.out.println("-Maximinizar forma");
		try {
			System.out.println(triangulo.aceitaVisita(visitorM));
		} catch (TrianguloException e) {
			
		}
		System.out.println("-Area");
		try {
			System.out.println(triangulo.aceitaVisita(visitorA));
		} catch (TrianguloException e) {
		
		}
		System.out.println("-Perimetro");
		try {
			System.out.println(triangulo.aceitaVisita(visitorP));
		} catch (TrianguloException e) {
			
		}
		System.out.println("-Desenha forma");
		try {
			System.out.println(triangulo.aceitaVisita(visitorD));
		} catch (TrianguloException e) {
		
		}
		
	}


}
