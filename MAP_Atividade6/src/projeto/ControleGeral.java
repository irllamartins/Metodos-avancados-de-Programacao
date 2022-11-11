package projeto;

public class ControleGeral {
	private Almoxarifado almoxarifado;
	private Financa financa;
	private Infraestrutura infraestrutura;
	private SistemaAluno sistemaAluno;
	private Administrativo administrativo;
	private SistemaProfessor sistemaProfessor;
	
	public ControleGeral() {
		this.almoxarifado = new Almoxarifado();
		this.financa =  new Financa();
		this.infraestrutura = new Infraestrutura();
		this.sistemaAluno = new SistemaAluno(null);
		this.setSistemaProfessor(new SistemaProfessor(null));
		this.administrativo = new Administrativo();
	}

	public Almoxarifado getAlmoxarifado() {
		return almoxarifado;
	}

	public void setAlmoxarifado(Almoxarifado almoxarifado) {
		this.almoxarifado = almoxarifado;
	}

	public Financa getFinanca() {
		return financa;
	}

	public void setFinanca(Financa financa) {
		this.financa = financa;
	}

	public Infraestrutura getInfraestrutura() {
		return infraestrutura;
	}

	public void setInfraestrutura(Infraestrutura infraestrutura) {
		this.infraestrutura = infraestrutura;
	}



	public Administrativo getAdministrativo() {
		return administrativo;
	}

	public void setAdministrativo(Administrativo administrativo) {
		this.administrativo = administrativo;
	}

	public SistemaAluno getSistemaAluno(Aluno caio) {
		return sistemaAluno;
	}

	public void setSistemaAluno(SistemaAluno sistemaAluno) {
		this.sistemaAluno = sistemaAluno;
	}

	public SistemaProfessor getSistemaProfessor() {
		return sistemaProfessor;
	}

	public void setSistemaProfessor(SistemaProfessor sistemaProfessor) {
		this.sistemaProfessor = sistemaProfessor;
	}




	

}
