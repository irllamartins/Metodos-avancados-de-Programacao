package projeto;

public class Classe {
	private Turma turma;
	private DisciplinaProfessor disciplinaProfessor;
	
	public  Classe(Turma turma, DisciplinaProfessor disciplinaProfessor) {
		this.turma = turma;
		this.disciplinaProfessor = disciplinaProfessor ;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public DisciplinaProfessor getDisciplinaProfessor() {
		return disciplinaProfessor;
	}

	public void setDisciplinaProfessor(DisciplinaProfessor disciplinaProfessor) {
		this.disciplinaProfessor = disciplinaProfessor;
	}
	
	@Override
	public String toString() {
		return "Classe: " + turma.toString() + ", Professor: " + disciplinaProfessor.getProfessor().getNome()+ ", Disciplina: "+ disciplinaProfessor.getDisciplina().getNome();
	}

}
