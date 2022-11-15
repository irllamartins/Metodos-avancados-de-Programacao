package projeto;

public class DisciplinaProfessor {
	
	private Professor professor;
	private Disciplina disciplina;
	
	public DisciplinaProfessor(Professor professor ,Disciplina disciplina ) {
		this.disciplina = disciplina;
		this.professor = professor;
	}
	
	public Professor getProfessor() {
		return professor;
	}

	public void setProfessores(Professor professor) {
		this.professor = professor;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	
	@Override
	public String toString() {
		return "ListaDisciplinaProfessor [professores: " + professor.getNome() + ", disciplina: " + disciplina.getNome() + "]";
	}

		
}