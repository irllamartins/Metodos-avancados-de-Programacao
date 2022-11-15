package projeto;

public class QtdException extends Exception{

	public QtdException() {
		System.err.println("Falha no registro! Adicione numero de quantidade valida!(quantidade>0)");
	}

}
