package projeto;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

 public class AlunoTeste {
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
		

	//Teste listar disciplinas de um aluno
		 @Test 
		public void disciplinasDeAluno() throws Exception { 
			
			 GradeHoraria gradeEsperado = new GradeHoraria();
				 
			 for(int i=0;i<5;i++) {
				 	
				 gradeEsperado.addTurma(i, new Disciplina(111*i, "MAt"+i, 10+i,true),"Professor",111);
				 gradeEsperado.procurarTurmaAddAluno(111,"Aluno"+i,1*i);
			}
				 
			
			ArrayList<Classe> resultado = grade.disciplinasDeAluno(1);
			ArrayList<Classe> resultadoEsperado = gradeEsperado.disciplinasDeAluno(1);
			
			for(int i=0;i<5;i++) {
				assertEquals( resultadoEsperado.get(i).toString(), resultado.get(i).getTurma().toString());
			}
		}
	
	//Teste de total de horas do aluno 
	 @Test 
	public void totalHorasAluno() { 
		 assertEquals(11, grade.totalHorasAlunos(1)); 
	      
	    }
	    

	//Teste listar alunos em disciplina
		 @Test 
	public void alunosEmUmaDisciplina()  { 
			 
		assertNotNull(grade.alunosEmUmaDisciplinaEspecifica(111)); 
		      
	}	
		 
	 
	//Teste de adicionar aluno de turma fechada
	@Test(expected=TurmaException.class) 
	public void addAluno() throws TurmaException{ 
		grade.getClasses().get(1).getTurma().getDisciplina().setStatus(false);
		grade.procurarTurmaAddAluno(111,"Aluno",1);
	}


}
