package projeto;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

 public class ProfessorTeste {	
	 private GradeHoraria grade;
	 
		@Before
		public void setUp() throws HoraException, TurmaException{
			Professor professor = new Professor("Professor",111);
			
			 ArrayList<Aluno> alunos = new ArrayList<Aluno>();
			 ArrayList<Classe> classe = new ArrayList<Classe>();
				 
			 for(int i=0;i<5;i++) {
					 
			 	Aluno aluno = new Aluno("Aluno"+i,(int)1*i);		 			 	
			 	alunos.add(aluno);
			 	Disciplina disciplina = new Disciplina(111*i, "MAt"+i, 10+i,true);
			 	DisciplinaProfessor dp = new DisciplinaProfessor(professor, disciplina);
				 	
			 	classe.add(new Classe(new Turma(i,disciplina, alunos), dp));
			 }
				 
			grade = new GradeHoraria(classe);
			 
		}		
	
	//teste disciplinas ministradas pelo professor
	@Test 
	public void disciplinaMinistradoProfessor() throws HoraException, TurmaException {
			
		Professor professor = new Professor("Professor",111);
		ArrayList<Classe> resultadoEsperado = new ArrayList<Classe>();
		 ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		 
			 
		 for(int i=0;i<5;i++) {
				 
		 	Aluno aluno = new Aluno("Aluno"+i,(int)1*i);		 			 	
		 	alunos.add(aluno);
		 	Disciplina disciplina = new Disciplina(111*i, "MAt"+i, 10+i,true);
		 	DisciplinaProfessor dp = new DisciplinaProfessor(professor, disciplina);
			 	
		 	resultadoEsperado.add(new Classe(new Turma(i,disciplina, alunos), dp));
		 }
			 
		GradeHoraria grade1 = new GradeHoraria(resultadoEsperado);
		
		ArrayList<Classe> resultado = grade.disciplinaMinistradoProfessor(111);
		
		for(int i=0;i<5;i++) {	
			assertEquals(resultadoEsperado.get(i).getDisciplinaProfessor().getDisciplina().getId(), resultado.get(i).getDisciplinaProfessor().getDisciplina().getId());
		}
	}
	//Teste de total de horas do professor
	 @Test 
	 public void totalHorasProfessor() throws Exception { 
		 assertEquals(60, grade.totalHorasProfessor(111)); 
	 }

	

}
