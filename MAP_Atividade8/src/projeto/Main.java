package projeto;

public class Main {

	public static void main(String[] args) {

		VisitorIF visitorCA = new VisitorCalculaArea();
		Circulo circulo = new Circulo(15);
		circulo.aceitaVisita(visitorCA);
		
	}


}
