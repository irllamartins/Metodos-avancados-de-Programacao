package projeto;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

 public class ProfessorTeste {	
	 private GradeHoraria grade;
	 
		@Before
		public void setUp() throws HoraException, TurmaException{
			grade = new GradeHoraria();
			for(int i=0;i<5;i++) {
			 	
				grade.addTurma(i, new Disciplina(111*i, "MAt"+i, 10+i,true),"Professor",111);
			}
				 
			for(int i=0;i<5;i++) {
				 grade.procurarTurmaAddAluno(i,"Aluno"+i,1*i);
			}
			 
		}		
	
	//teste disciplinas ministradas pelo professor
	@Test 
	public void disciplinaMinistradoProfessor() throws HoraException, TurmaException {
			
		ArrayList<Classe> resultadoEsperado = new ArrayList<Classe>();
		GradeHoraria grade1 = new GradeHoraria();
		
		for(int i=0;i<5;i++) {
		 	
			grade1.addTurma(i, new Disciplina(111*i, "MAt"+i, 10+i,true),"Professor",111);
		}
			 
		for(int i=0;i<5;i++) {
			 grade1.procurarTurmaAddAluno(i,"Aluno"+i,1*i);
		}
		
		ArrayList<Classe> resultado = grade.disciplinaMinistradoProfessor(111);
		resultadoEsperado = grade1.disciplinaMinistradoProfessor(111);
		
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
