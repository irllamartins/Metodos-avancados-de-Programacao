package projeto;

import java.util.ArrayList;

public class Turma {
	private	int id;
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	private Disciplina disciplina;
	
	public Turma(int id, Disciplina disciplina,ArrayList<Aluno> alunos ) {
		this.disciplina = disciplina;
		this.alunos = alunos;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	

	public void addAluno(Aluno aluno) throws TurmaException {
		if(disciplina.getStatus()==true) {
			alunos.add(aluno);
		}
		else
			 throw new TurmaException();
		
	}
	public int verQuantidadeAlunos() {
		return alunos.size();
	}
	public void listarAlunos() {
		for(Aluno aluno: alunos) {
			System.out.println(aluno.toString());
		}
	}
	public boolean buscaAlunos(int matricula) {
		boolean encontrou=false;
		for(Aluno aluno: alunos) {
			if(aluno.getMatricula()==matricula) {
				encontrou=true;
			}
		}
		return encontrou;
	}

	@Override
	public String toString() {
		return "idTurma: " + getId() + ", horas: " + disciplina.getHoras()  + ", status: "+ disciplina.getStatus() + ", QuantidadeAlunos: " + verQuantidadeAlunos();
	}
	
}
