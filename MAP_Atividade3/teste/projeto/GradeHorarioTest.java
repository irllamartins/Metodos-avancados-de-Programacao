package projeto;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

 public class GradeHorarioTest {	
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
	
		 GradeHoraria grade = new GradeHoraria();
		 
		 for(int i=0;i<5;i++) {
			 	
			 grade.addTurma(i, new Disciplina(111*i, "MAt"+i, 10+i,true),"Professor",111);
			 grade.procurarTurmaAddAluno(111,"Aluno"+i,1*i);
		}
			 
		
		ArrayList<Classe> resultado = grade.disciplinasDeAluno(1);
		ArrayList<Classe> resultadoEsperado = grade.disciplinasDeAluno(1);
		
		for(int i=0;i<5;i++) {
			assertEquals(resultadoEsperado.get(i).toString(), resultado.get(i).toString());
			
		}
	}
	//Teste listar disciplinas de um aluno
		 @Test 
		public void disciplinasDeAluno() throws Exception { 
			
			 ArrayList<Classe>  resultadoEsperado = new ArrayList<Classe>();	
			 Professor professorTest = new Professor("Professor",111);	
			 ArrayList<Aluno> alunosTest = new ArrayList<Aluno>();
			
				 
			 for(int i=0;i<5;i++) {
					 
			 	Aluno aluno = new Aluno("Aluno"+i,(int)1*i);		 			 	
			 	alunosTest.add(aluno);
			 	Disciplina disciplina = new Disciplina(111*i, "MAt"+i, 10+i,true);
			 	DisciplinaProfessor dp = new DisciplinaProfessor(professorTest, disciplina);
				 	
			 	resultadoEsperado.add(new Classe(new Turma(i,disciplina, alunosTest), dp));
			 }
				 
			GradeHoraria grade1 = new GradeHoraria(resultadoEsperado);
				
			ArrayList<Classe> resultado = grade.disciplinasDeAluno(1);
			
			for(int i=0;i<resultado.size();i++) {
				assertEquals(resultadoEsperado.get(i).toString(), resultado.get(i).toString());
			}
		}
	
	//Teste de total de horas do aluno rever
	 @Test 
	public void totalHorasAluno() { 
			
		 assertEquals(11, grade.totalHorasAlunos(1)); 
	      
	    }
	    
		//Teste de total de horas do professor
		 @Test 
	public void totalHorasProfessor() throws Exception { 
	     assertEquals(60, grade.totalHorasProfessor(111)); 
		 }
	
	//Teste listar alunos em disciplina
		 @Test 
	public void alunosEmUmaDisciplina() throws Exception { 
			 
		assertNotNull(grade.alunosEmUmaDisciplinaEspecifica(111)); 
		      
	}	
		 
	 
 
		 //Teste ver quantidade de alunos em uma disciplina
		 @Test 
	public void quantidadeAlunoDisciplina() throws HoraException { 
		 			 
		 assertEquals(1,grade.quantidadeAlunoDisciplina(111)); 
		}

		


}
