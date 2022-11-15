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

	//Administrativas (reuniões agendadas com a diretoria, entrevistas)
	
	public String addCompromisso() throws AddException {		
		getAdministrativo().AgendarCompromisso("02/12/2020", "12:00", "Entrevista");
		getAdministrativo().AgendarCompromisso("20/06/2021", "14:00", "Reuniao");
		getAdministrativo().AgendarCompromisso("20/06/2021", "15:00", "Reuniao");
		
		return getAdministrativo().AgendarCompromisso("20/06/2021", "16:00", "Reuniao");
		
	}
	
	public String concluirCompromisso() throws NotFoundException {
		
		return getAdministrativo().concluirCompromisso("20/06/2021","14:00");
		
	}
	
	public String verCompromisso() {
		int quantidade = getAdministrativo().compromissoAgendado();
		
		if(quantidade == 0) {
			return "Não existe compromisso agendado!";
		}
		return "\nExiste "+ quantidade +" compromisso(s) agendado!";
	}
	
	//À infra-estrutura (alocação de salas)
	
	public String addSala() throws AddException {

		getInfraestrutura().addSala(001, 20, true);
		getInfraestrutura().addSala(002, 20, true);
		getInfraestrutura().addSala(003, 20, false);
		getInfraestrutura().addSala(100, 50, true);
		
		return getInfraestrutura().addSala(101, 50, false);
		
	}
	
	public String liberarSala() throws NotFoundException, ImpossibleException {
		
		return getInfraestrutura().liberarSalas(101);
		
	}
	public String ocuparSala() throws NotFoundException, ImpossibleException {
			
		return getInfraestrutura().ocuparSalas(002);
	}
	
	public String salaDisponivel() throws NotFoundException {
		int quantidade =  getInfraestrutura().salasDisponiveis();
		
		if(quantidade == 0) {
			return "Não existe sala disponivel!";
		}
		return "\nExiste "+ quantidade +" sala(s) disponivel(is)!";

	}
	//Ao almoxarifado (estoque, pedido de compra
	
	//Só o ultimo vai ser considerado porque o restante é para encher dados no programa
	public String addPedidoCompra() throws QtdException {
		
		getAlmoxarifado().pedidoCompra(12345, "Mesa",3);
		return getAlmoxarifado().pedidoCompra(22345, "Cadeira",8)+" item(ns) adicionado(s) no pedido para compra!";
	}
	
	public String listaPendente() {
		return getAlmoxarifado().listaPendente()+" Item(ns) pendente(s) no pedido para compra!";
	}
	
	public String compras() throws QtdException {
		
		return getAlmoxarifado().itensComprados(12345, "Mesa",5)+" Item(ns) adicionado(s) no estoque!";
		
	}
	
	public String estoque() {
		return getAlmoxarifado().estoque()+" item(ns) no estoque!";
	}
	
	
	//Financeiras ( folha de pagamento)
	public String addConta() throws AddException, QtdException {
		
		getFinanca().addConta(1, 8000, false);
		getFinanca().addConta(2, 50000, false);
		
		return getFinanca().addConta(3, 150000, false);
	}
	
	public String quitarConta() throws NotFoundException, ImpossibleException, NegativeException {
		return getFinanca().quitarConta(1);
	}
	
	public double contaPendente() {
		return getFinanca().emPendencia();
	}
	
	public double contaQuitada() {
		return getFinanca().quitado();
	}
	public double addRemanecente() throws NegativeException{
		double acrescimo = 20000;
		return getFinanca().addRemanecente(acrescimo);
	}
	public String folhaPagamento() {
		return "Folha(s) total(is) "+getFinanca().folhaPagamento();
	}
	public String balancoFinanceiro() {
		double quitado = contaQuitada();
		double pendente = contaPendente();

		return "Saldo :"+ getFinanca().getSaldo()+" Saldo total de contas :"+ (quitado-pendente);
	}
	
	//Relacionada aos alunos (histórico e RDM)
	public int RDM() {
		//dados de teste
				Professor jose = new Professor(12345,"José");
				Professor ana = new Professor(67345,"Ana");
				
				Aluno caio = new Aluno(31234,"Caio");
				
				Disciplina matematica = new Disciplina(1,"matematica",true);
				Disciplina portugues = new Disciplina(2,"portugues",true);
				
				
				DisciplinaProfessor port = new DisciplinaProfessor(ana, portugues);
				
				DisciplinaProfessor mat = new DisciplinaProfessor(jose, matematica);
				
				Registro matematica1= new Registro (mat, 2020);
				Registro portugues1= new Registro (port, 2020);
				
				getSistemaAluno(caio).setAluno(caio);
				getSistemaAluno(caio).addRegistro(matematica1);
				getSistemaAluno(caio).addRegistro(portugues1);
			
				return getSistemaAluno(caio).rdm();
	}
	public int historico() {
		
		Aluno caio = new Aluno(31234,"Caio");
		Professor ana = new Professor(67345,"Ana");
		
		Disciplina historia = new Disciplina(3,"historia",false);
		DisciplinaProfessor hist = new DisciplinaProfessor(ana, historia);
		
		Registro historia1= new Registro (hist, 2020);
		
		getSistemaAluno(caio).addRegistro(historia1);
		getSistemaAluno(caio).getDisciplinaAluno().get(2).setNota(9);
		return getSistemaAluno(caio).historico();
	}
	//Relacionadas ao professores (alocação por disciplina)
	
	public String alocaProfessor() {
		Professor ana = new Professor(67345,"Ana");
		Disciplina portugues = new Disciplina(2,"portugues",true);
		DisciplinaProfessor port = new DisciplinaProfessor(ana, portugues);
	
		Professor jessica = new Professor(45345,"Jessica");
		
		getSistemaProfessor();
		getSistemaProfessor().alocarProfessor(jessica,port);
	
		return getSistemaProfessor().verDisciplinaProfessor(port);
	}
}
