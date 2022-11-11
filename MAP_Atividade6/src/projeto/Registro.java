package projeto;

public class Registro {
	private DisciplinaProfessor disciplinaProfessor;
	private int ano;
	private double nota;
	
	public Registro(DisciplinaProfessor disciplinaProfessor, int ano) {
		this.disciplinaProfessor = disciplinaProfessor;
		this.ano = ano;
	}

	public DisciplinaProfessor getDisciplinaProfessor() {
		return disciplinaProfessor;
	}

	public void setDisciplinaProfessor(DisciplinaProfessor disciplinaProfessor) {
		this.disciplinaProfessor = disciplinaProfessor;
	}



	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Registro [disciplinas: " + disciplinaProfessor.getDisciplina() +", ano: " + ano + ", nota: " + nota +", Professor: " + disciplinaProfessor.getDisciplina() + "]";
	}
	
	

}
