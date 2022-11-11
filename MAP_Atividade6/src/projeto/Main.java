package projeto;

public class Main {

	public static void main(String[] args) {
		
		ControleGeral sistema = new ControleGeral();
		
		//dados de teste
		Professor jose = new Professor(12345,"José");
		Professor ana = new Professor(67345,"Ana");
		Professor jessica = new Professor(45345,"Jessica");
		
		Aluno caio = new Aluno(31234,"Caio");
		
		Disciplina matematica = new Disciplina(1,"matematica",true);
		Disciplina portugues = new Disciplina(2,"portugues",true);
		Disciplina historia = new Disciplina(3,"historia",false);
		
		DisciplinaProfessor port = new DisciplinaProfessor(ana, portugues);
		DisciplinaProfessor hist = new DisciplinaProfessor(ana, historia);
		DisciplinaProfessor mat = new DisciplinaProfessor(jose, matematica);
		
		Registro matematica1= new Registro (mat, 2020);
		Registro portugues1= new Registro (port, 2020);
		Registro historia1= new Registro (hist, 2020);
		
		System.out.println("\nAdministrativas (reuniões agendadas com a diretoria, entrevistas)\n");
		sistema.getAdministrativo().AgendarCompromisso("02/12/2020", "12:00", "Entrevista");
		sistema.getAdministrativo().AgendarCompromisso("20/06/2021", "14:00", "Reuniao");
		sistema.getAdministrativo().AgendarCompromisso("20/06/2021", "15:00", "Reuniao");
		sistema.getAdministrativo().AgendarCompromisso("20/06/2021", "16:00", "Reuniao");
		sistema.getAdministrativo().concluirCompromisso("20/06/2021","14:00");
		
		sistema.getAdministrativo().compromissoAgendado();
		
		System.out.println("\nÀ infra-estrutura (alocação de salas).\n");
		sistema.getInfraestrutura().addSala(001, 20, true);
		sistema.getInfraestrutura().addSala(002, 20, true);
		sistema.getInfraestrutura().addSala(003, 20, false);
		sistema.getInfraestrutura().addSala(100, 50, true);
		sistema.getInfraestrutura().addSala(101, 50, false);
		sistema.getInfraestrutura().liberarSalas(101);
		sistema.getInfraestrutura().salasDisponiveis();
		
		System.out.println("\nAo almoxarifado (estoque, pedido de compra)\n");
		sistema.getAlmoxarifado().pedidoCompra(12345, "Mesa",3);
		sistema.getAlmoxarifado().pedidoCompra(22345, "Cadeira",8);
		sistema.getAlmoxarifado().listaPendente();
		sistema.getAlmoxarifado().itensComprados(12345, "Mesa",5);
		
		System.out.println();
		sistema.getAlmoxarifado().listaPendente();
		System.out.println();
		sistema.getAlmoxarifado().estoque();
		
		System.out.println("\nFinanceiras ( folha de pagamento)\n");
		sistema.getFinanca().addConta(1, 10000, true);
		sistema.getFinanca().addConta(2, 50000, false);
		sistema.getFinanca().addConta(3, 150000, false);
		sistema.getFinanca().pago(2);
		
		sistema.getFinanca().emPendencia();
		
		System.out.println("\nRelacionada aos alunos (histórico e RDM)\n");
		sistema.getSistemaAluno(caio).setAluno(caio);
		sistema.getSistemaAluno(caio).addRegistro(matematica1);
		sistema.getSistemaAluno(caio).addRegistro(portugues1);
		sistema.getSistemaAluno(caio).addRegistro(historia1);
		sistema.getSistemaAluno(caio).getDisciplinaAluno().get(2).setNota(9);
		System.out.println("RDM");
		sistema.getSistemaAluno(caio).rdm();
		System.out.println("\nHistorico");
		sistema.getSistemaAluno(caio).historico();
		
		System.out.println("\nRelacionadas ao professores (alocação por disciplina)\n");
		sistema.getSistemaProfessor();
		sistema.getSistemaProfessor().alocarProfessor(jessica,port);
		System.out.println(sistema.getSistemaProfessor().verDisciplinaProfessor(port));
		
		
	}

}
