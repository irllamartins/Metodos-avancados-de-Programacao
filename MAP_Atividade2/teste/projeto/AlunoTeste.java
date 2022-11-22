package projeto;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

 public class AlunoTeste {	;
	 private GradeHoraria grade;

	 
	@Before
	public void setUp() throws HoraException, TurmaException{
				
			try {
			
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
					 
					 
			} catch (HoraException e) {
				e.printStackTrace();
		}
		 
	}
		

	//Teste listar disciplinas de um aluno
		 @Test 
		public void disciplinasDeAluno() throws Exception { 
			
			 ArrayList<Classe>  resultadoEsperado = new ArrayList<Classe>();	
			 Professor professor = new Professor("Professor",111);	
			 ArrayList<Aluno> alunos = new ArrayList<Aluno>();
			
				 
			 for(int i=0;i<5;i++) {
					 
			 	Aluno aluno = new Aluno("Aluno"+i,(int)1*i);		 			 	
			 	alunos.add(aluno);
			 	Disciplina disciplina = new Disciplina(111*i, "MAt"+i, 10+i,true);
			 	DisciplinaProfessor dp = new DisciplinaProfessor(professor, disciplina);
				 	
			 	resultadoEsperado.add(new Classe(new Turma(i,disciplina, alunos), dp));
			 }
				 
			GradeHoraria grade1 = new GradeHoraria(resultadoEsperado);
			
			ArrayList<Classe> resultado = grade1.disciplinasDeAluno(1);
			
			for(int i=0;i<5;i++) {
				assertEquals(   resultadoEsperado.get(i).toString(), resultado.get(i).toString());
			}
		}
	
	//Teste de total de horas do aluno 
	 @Test 
	public void totalHorasAluno() { 
			
		 assertEquals(60, grade.totalHorasAlunos(1)); 
	      
	    }
	    

	//Teste listar alunos em disciplina
		 @Test 
	public void alunosEmUmaDisciplina() throws Exception { 
			 
		assertNotNull(grade.alunosEmUmaDisciplinaEspecifica(111)); 
		      
	}	
		 
	 
	//Teste de adicionar aluno de turma fechada
	@Test(expected=TurmaException.class) 
	public void addAluno() throws TurmaException, HoraException { 
		ArrayList<Aluno> alunosteste = new ArrayList<Aluno>(); 		
		
		Disciplina disciplina = new Disciplina(111, "turma1", 10, false);
		Aluno aluno = new Aluno("Aluno1",111);
		//
		
		Turma turma = new Turma(1,disciplina,alunosteste);
		turma.addAluno(aluno);
		}


}
