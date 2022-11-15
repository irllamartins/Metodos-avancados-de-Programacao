package projeto;

public class ImpossibleException extends Exception{

	public ImpossibleException() {
		System.err.println("Ação negada! Verifique o status da ação pedida!");
	}

}
