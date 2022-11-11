package projeto;

public class DataException extends Exception{

	public DataException() {
		System.err.println("Falha no registro da data e hora! Verifiwur o formato: Data (dd/mm/yyyy) e Hora(hh:mm:ss)");
	}

}
