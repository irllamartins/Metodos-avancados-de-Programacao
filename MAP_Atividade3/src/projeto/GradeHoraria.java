package projeto;

import java.util.ArrayList;

public class GradeHoraria {
	private ArrayList<Classe> classes= new ArrayList<Classe>();
	
	public GradeHoraria() {
		this.classes = classes;
		
	}
	
	
	public ArrayList<Classe> getClasses() {
		return classes;
	}


	public void setClasses(ArrayList<Classe> classes) {
		this.classes = classes;
	}

	public ArrayList<Classe> disciplinaMinistradoProfessor(int matricula) {
		ArrayList<Classe> disciplinasProfessor = new ArrayList<Classe>();
		
		for(Classe classe: getClasses()) {
			if(classe.getDisciplinaProfessor().getProfessor().getMatricula()==matricula) {
					
				disciplinasProfessor.add(classe);
			}
				
		}
		return disciplinasProfessor ;
	}
	//lista  alunos em uma disciplina
	public ArrayList<Aluno> alunosEmUmaDisciplinaEspecifica(int id) {
		for(int i=0;i<classes.size();i++) {
			if(classes.get(i).getTurma().getDisciplina().getId()==id) {
				return classes.get(i).getTurma().getAlunos();
			}
		}
		return null;
		
	}
	//quantidade de alunos
	public int quantidadeAlunoDisciplina(int id) {
		for(int i=0;i<classes.size();i++) {
			if(classes.get(i).getTurma().getDisciplina().getId()==id) {
				return classes.get(i).getTurma().getAlunos().size();
			}
		}
		return -1;
	}
	
	//disciplinas de um aluno
	public ArrayList<Classe> disciplinasDeAluno(int matricula) {
		ArrayList<Classe> disciplinasAluno = new ArrayList<Classe>();
		for(int i=0;i<classes.size();i++) {
			if(classes.get(i).getTurma().buscaAlunos(matricula) == true) {
				disciplinasAluno.add(classes.get(i));
			}
			
		}
		return disciplinasAluno;
	}
	//Procurar turma para adicionar aluno
	public void procurarTurmaAddAluno(int id, String nome, int matricula) throws TurmaException {
		for(Classe classe: classes) {
			if(classe.getTurma().getId()== id) {
				classe.getTurma().addAluno(nome,matricula);
			}
			
		}
	}
	//total de horas de um professor
	public int totalHorasProfessor(int matricula) {
		int CargaHoraria=0;
		
		for(Classe classe: getClasses()) {
			
			if(classe.getDisciplinaProfessor().getProfessor().getMatricula()==matricula && classe.getDisciplinaProfessor().getDisciplina().getStatus()==true ) {
				CargaHoraria+= classe.getDisciplinaProfessor().getDisciplina().getHoras();
				
			}
		}
		return CargaHoraria;
	}
	
	//total de horas de um aluno
	public int totalHorasAlunos(int matricula) {
		int CargaHoraria=0;
		
		for(int j=0;j<classes.size();j++) {
			for(int i=0;i <classes.get(j).getTurma().getAlunos().size();i++) {
				if(classes.get(j).getTurma().getAlunos().get(i).getMatricula()==matricula && classes.get(j).getTurma().getDisciplina().getStatus()==true) {
					CargaHoraria+=  classes.get(j).getTurma().getDisciplina().getHoras();
				}
			}
			
		}
		return CargaHoraria;
	}


	public void addTurma(int id, Disciplina disciplina, String nome, int matricula){	
			classes.add(new Classe(new Turma(id, disciplina),  new DisciplinaProfessor( new Professor(nome,matricula),  disciplina)));
	
		
	}
	@Override
	public String toString() {
		return "GradeHorarioTest [grade=" + getClasses().toString();
	}

}
