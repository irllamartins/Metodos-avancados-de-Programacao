package projeto;

public class NegativeException extends Exception{

	public NegativeException() {
		System.err.println("Falha no registro! Adicione saldo valida!(positivo)");
	}

}
