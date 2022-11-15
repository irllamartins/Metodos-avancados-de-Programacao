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
	
	public boolean addRegistro(Registro registro) {
		int quantidade = disciplinaAluno.size();
		disciplinaAluno.add(registro);
		if(quantidade<disciplinaAluno.size()) {
			return true;
		}
		return false;
	}
	
	public int historico() {
		Iterator<Registro> it = disciplinaAluno.iterator();
		int cont=0;
		
		while (it.hasNext()) {
			Registro comparador = it.next();
			if(comparador.getDisciplinaProfessor().getDisciplina().getAtivo()==false) {
				System.out.println(comparador.toString());
				cont++;
			}
		}
		
		return cont;
	}
	
	public int rdm() {
		Iterator<Registro> it = disciplinaAluno.iterator();
		int cont=0;
		
		while (it.hasNext()) {
			Registro comparador = it.next();
			if(comparador.getDisciplinaProfessor().getDisciplina().getAtivo()==true) {
				System.out.println(comparador.toString());
				cont++;
			}
		}
		return cont;
	}

}
