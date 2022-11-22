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
			
			grade = new GradeHoraria();
			for(int i=0;i<5;i++) {
			 	
				grade.addTurma(i, new Disciplina(111*i, "MAt"+i, 10+i,true),"Professor",111);
			}
				 
			for(int i=0;i<5;i++) {
				 grade.procurarTurmaAddAluno(i,"Aluno"+i,1*i);
			}
			 
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
		
	 
	//Teste de adicionar aluno de turma fechada
	@Test(expected=HoraException.class) 
	public void setHoras() throws HoraException {  		
		grade.addTurma(1, new Disciplina(111, "MAt",0,true),"Professor",111);
	  
	}

}
