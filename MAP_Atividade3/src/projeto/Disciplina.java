package projeto;

public class Disciplina {
	
	private int id;
	private String nome;
	private int horas;
	private boolean status;
	
	public Disciplina(int id, String nome, int horas,boolean status) throws HoraException {
		this.id = id;
		this.nome = nome;
		setHoras(horas);
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) throws HoraException {
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

	public void setHoras(int horas) throws HoraException {
		if(horas>0) {
			this.horas = horas;
		}
		else {
			 throw new HoraException(); 
			 }
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Id: " + id + ", nome: " + nome + ", horas: " + horas + ", status: " + status ;
	}
}
