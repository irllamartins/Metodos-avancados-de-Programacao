package projeto;

public class TurmaException extends Exception{

	public TurmaException()  {
		System.err.println("Turma encerrada! Não pode adiciona mais aluno!");
	}

}
