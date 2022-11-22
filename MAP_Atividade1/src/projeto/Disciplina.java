package projeto;

import java.util.ArrayList;

public class Disciplina {
	
	private int id;
	private String nome;
	private int horas;
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	public Disciplina(int id, String nome, int horas) {
		this.id = id;
		this.nome = nome;
		this.horas =  horas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	public int verQuantidadeAlunos() {
		return alunos.size();
	}
	public void listaAlunos() {
		for(Aluno aluno: alunos) {
			System.out.println(aluno.toString());
		}
	}
	

}
