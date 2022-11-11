package projeto;

public class Disciplina {
	private int id;
	private String nome;
	private boolean ativo;
	public Disciplina(int id, String nome, boolean ativo){
		this.id = id;
		this.nome = nome;
		this.ativo = ativo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(boolean status) {
		this.ativo = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return  nome + ", ativo:" + ativo ;
	}
	
	

}
