package projeto;

import java.util.ArrayList;

public class Professor{
	private String nome;
	private int matricula;
	private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public Professor(String nome, int matricula, Disciplina disciplina) {
		this.nome = nome;
		this.matricula =  matricula;
		disciplinas.add(disciplina);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	

	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public void addDisciplinas(Disciplina disciplina) {
		disciplinas.add(disciplina);
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", matricula: " + matricula;
	}
	

	 

	
}
