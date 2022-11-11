package projeto;

public class SistemaProfessor {
	private Professor professor;
	
	public SistemaProfessor(Professor professor) {
		this.professor = professor;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public boolean alocarProfessor(Professor professor,DisciplinaProfessor disciplinaProfessor) {
		disciplinaProfessor.setProfessores(professor);
		
		return true;
		
	}
	public String verDisciplinaProfessor(DisciplinaProfessor disciplinaProfessor) {
		disciplinaProfessor.toString();
		return disciplinaProfessor.toString();
	}

}
