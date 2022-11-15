package projeto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SistemaProfessorTeste {
	private SistemaProfessor sistemaProfessor;
	Professor ana ;
	DisciplinaProfessor port;
	Disciplina portugues;
	Professor jose;
	@Before
	public void setUp(){
		ana = new Professor(67345,"Ana");
	    jose = new Professor(12345,"José");
		sistemaProfessor = new SistemaProfessor(ana);
	
	 portugues = new Disciplina(2,"portugues",true);	
	 port = new DisciplinaProfessor(ana, portugues);
		
	}
	
	
	@Test
	public void alocarProfessorr() {
		sistemaProfessor.alocarProfessor(jose, port);
		assertEquals(sistemaProfessor.verDisciplinaProfessor(port),"ListaDisciplinaProfessor [professores: José, disciplina: portugues]");
	}

}
