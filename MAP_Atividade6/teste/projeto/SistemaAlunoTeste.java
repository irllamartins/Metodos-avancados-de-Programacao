package projeto;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class SistemaAlunoTeste {
	private SistemaAluno sistemaAluno;
	private Registro matematica1;
	private Registro portugues1;
	private Registro historia1;
	private Professor ana;
	private Aluno caio;
		
	private DisciplinaProfessor mat ;
	private DisciplinaProfessor port;
	private DisciplinaProfessor hist;
	
	private Disciplina matematica;
	private Disciplina portugues;
	private Disciplina historia;
	private Professor jose;


	@Before
	public void setUp() {
		caio = new Aluno(31234, "Caio");
		
		jose = new Professor(12345,"José");
		ana = new Professor(67345, "Ana");
		
		sistemaAluno = new SistemaAluno(caio);
		
		matematica = new Disciplina(1,"matematica",true);
		portugues = new Disciplina(2, "portugues", true);
		historia = new Disciplina(3,"historia",false);
		
		mat = new DisciplinaProfessor(jose, matematica);
		port = new DisciplinaProfessor(ana, portugues);
		hist = new DisciplinaProfessor(ana, historia);
		
		matematica1= new Registro (mat, 2020);
		portugues1 = new Registro(port, 2020);
		historia1= new Registro (hist, 2020);
		
		sistemaAluno.addRegistro(matematica1);
		sistemaAluno.addRegistro(portugues1);
		sistemaAluno.addRegistro(historia1);
	}

	@Test
	public void addRegistro() {
		assertTrue(sistemaAluno.addRegistro(portugues1));
	}
	@Test
	public void RDM() {
		assertEquals(sistemaAluno.rdm(),2);
	}
	@Test
	public void historico() {
		assertEquals(sistemaAluno.historico(),1);
	}

}
