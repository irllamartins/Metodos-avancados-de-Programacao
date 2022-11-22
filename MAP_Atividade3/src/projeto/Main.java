package projeto;

import java.util.ArrayList;

public class Main {
	

	public static void main(String[] args) throws HoraException, TurmaException  {
		GradeHoraria grade = new GradeHoraria();
		
			 
		for(int i=0;i<5;i++) {
							 	
			grade.addTurma(i, new Disciplina(111*i, "MAt"+i, 10+i,true),"Professor",111);
		}
			 
		for(int i=0;i<5;i++) {
			 grade.procurarTurmaAddAluno(i,"Aluno"+i,1*i);
		}
		
		ArrayList<Classe> disciplinasProfessor = new ArrayList<Classe>();	
		ArrayList<Aluno> listaAlunos = new ArrayList<>();
		ArrayList<Classe> disciplinaDoAluno = new ArrayList<>();

		System.out.println( "1 - Quais disciplinas um professor está ministrando?");
		
		disciplinasProfessor = grade.disciplinaMinistradoProfessor(111);
		
		for(int i=0;i<disciplinasProfessor.size();i++) {
			System.out.println(disciplinasProfessor.get(i).getTurma().toString());
		}
		
		System.out.println( "\n2 - Qual o horário de um professor?");

		System.out.println(grade.totalHorasProfessor(111)+" Horas\n");
	
		System.out.println( "3 - Quais os alunos de uma dada disciplina?");
		
		
		listaAlunos = grade.alunosEmUmaDisciplinaEspecifica(111);
		for(int i=0;i<listaAlunos.size();i++) {
			System.out.println(listaAlunos.get(i).toString());
		}
		System.out.println();
		System.out.println( "4 - Quais as disciplinas de um aluno?");
		
		
		disciplinaDoAluno = grade.disciplinasDeAluno(1);
		
		for(int i=0;i<disciplinaDoAluno.size();i++) {
			System.out.println(disciplinaDoAluno.get(i).toString());
		}
		System.out.println();
		System.out.println( "5 - Qual o horário de um aluno?");
		
		System.out.println(grade.totalHorasAlunos(1)+" Horas\n");
							
	System.out.println( "6 - Qual o número de alunos de uma disciplina?");
		
		System.out.println(grade.quantidadeAlunoDisciplina(111)+" Alunos\n");

	}

}
