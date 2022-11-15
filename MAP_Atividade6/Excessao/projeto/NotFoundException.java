package projeto;

public class NotFoundException  extends Exception{

	public NotFoundException() {
		System.err.println("Não encontrado! Verifique a escrita!");
	}

}
