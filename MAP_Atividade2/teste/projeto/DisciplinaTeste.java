package projeto;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

 public class DisciplinaTeste {	
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
	@Test(expected=HoraException.class) 
	public void setHoras() throws HoraException {  		
		Disciplina disciplina = new Disciplina(111, "turma1", 0, true);
	  
	}

}
