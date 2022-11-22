package projeto;

import java.util.ArrayList;

public class Turma {
	private int id;
	private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public Turma(int id) {
		this.id = id;	
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Disciplina> getDisciplina() {
		return disciplinas;
	}

	public void setDisciplina(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public void addDisciplinas(Disciplina disciplina) {
		disciplinas.add(disciplina);
	}
	
	public int totalHoras() {
		int horas=0;
		
		for( Disciplina disciplina:  disciplinas) {
			horas+= disciplina.getHoras();
		}
		return horas;
	}


	
	

}
