package projeto;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

 public class GradeHorarioTest {	
	 private GradeHoraria grade;
	 
		@Before
		public void setUp() throws HoraException, TurmaException{
			Professor professor = new Professor("Professor",111);
			
			 ArrayList<Aluno> alunos = new ArrayList<Aluno>();
			 ArrayList<Classe> classes = new ArrayList<Classe>();
				 
			 for(int i=0;i<5;i++) {
					 
			 	Aluno aluno = new Aluno("Aluno"+i,(int)1*i);		 			 	
			 	alunos.add(aluno);
			 	Disciplina disciplina = new Disciplina(111*i, "MAt"+i, 10+i,true);
			 	DisciplinaProfessor dp = new DisciplinaProfessor(professor, disciplina);
				 	
			 	classes.add(new Classe(new Turma(i,disciplina, alunos), dp));
			 }
				 
			grade = new GradeHoraria(classes);
			 
			}
	
	//teste disciplinas ministradas pelo professor
	@Test 
	public void disciplinaMinistradoProfessor() throws HoraException, TurmaException {
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
		ArrayList<Classe> resultado = grade.disciplinaMinistradoProfessor(111);
		
		for(int i=0;i<5;i++) {	
			assertEquals(   resultadoEsperado.get(i).getDisciplinaProfessor(), resultado.get(i).getDisciplinaProfessor());
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
			
		 assertEquals(60, grade.totalHorasAlunos(1)); 
	      
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
		 			 
		 assertEquals(5,grade.quantidadeAlunoDisciplina(111)); 
		}
		
	 
	//Teste de adicionar aluno de turma fechada
	@Test(expected=TurmaException.class) 
	public void addAluno() throws TurmaException, HoraException {  		
		grade.getClasses().get(1).getTurma().getDisciplina().setStatus(false);
		Aluno aluno = new Aluno("Aluno1",111);
		grade.getClasses().get(1).getTurma().addAluno(aluno);
	      
	  }
	//Teste de adicionar aluno de turma fechada
	@Test(expected=HoraException.class) 
	public void setHoras() throws HoraException {  		
		Disciplina disciplina = new Disciplina(111, "turma1", 0, true);
	  
	}

}
