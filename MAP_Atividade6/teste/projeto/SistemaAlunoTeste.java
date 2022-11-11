package projeto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SistemaAlunoTeste {
	private SistemaAluno sistemaAluno;
	private Registro portugues1;
	Professor ana ;
	DisciplinaProfessor port;
	Disciplina portugues;
	Professor jose;
	Aluno caio;
	@Before
	public void setUp(){
		caio = new Aluno(31234,"Caio");
		ana = new Professor(67345,"Ana");
		sistemaAluno= new SistemaAluno(caio);
	
	 portugues = new Disciplina(2,"portugues",true);	
	 port = new DisciplinaProfessor(ana, portugues);
	 
	 portugues1= new Registro (port, 2020);
	}
	
	@Test
	public void addRegistro() {
		assertTrue(sistemaAluno.addRegistro(portugues1));
	}

}
