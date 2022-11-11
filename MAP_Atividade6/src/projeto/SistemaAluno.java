package projeto;

import java.util.ArrayList;
import java.util.Iterator;

public class SistemaAluno {
	private Aluno aluno;
	private ArrayList<Registro> disciplinaAluno = new ArrayList<Registro>();
	
	public SistemaAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public ArrayList<Registro> getDisciplinaAluno() {
		return disciplinaAluno;
	}

	public void setDisciplinaAluno(ArrayList<Registro> disciplinaAluno) {
		this.disciplinaAluno = disciplinaAluno;
	}
	
	public void addRegistro(Registro registro) {
		disciplinaAluno.add(registro);
	}
	public void historico() {
		Iterator<Registro> it = disciplinaAluno.iterator();
		while (it.hasNext()) {
			Registro comparador = it.next();
			if(comparador.getDisciplinaProfessor().getDisciplina().getAtivo()==false) {
				System.out.println(comparador.toString());
			}
		}	
	}
	public void rdm() {
		Iterator<Registro> it = disciplinaAluno.iterator();
		while (it.hasNext()) {
			Registro comparador = it.next();
			if(comparador.getDisciplinaProfessor().getDisciplina().getAtivo()==true) {
				System.out.println(comparador.toString());
			}
		}	
	}

}
