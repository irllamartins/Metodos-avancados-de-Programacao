package projeto;

public class Main {

	public static void main(String[] args) {
		
		ControleGeral sistema = new ControleGeral();
		
		
		System.out.println("\n-------------------------------------------------------");
		System.out.println("Administrativas (reuniões agendadas com a diretoria, entrevistas)\n");
		
		try {
			System.out.println("Add compromisso");
			System.out.println(sistema.addCompromisso());
			System.out.println();
		}
		catch (AddException e) {
		}
		
		try {
			System.out.println("Concluir compromisso");
			System.out.println(sistema.concluirCompromisso());
			System.out.println();
			
		}
		catch (NotFoundException e4) {
		}
		System.out.println("Visualizar compromisso");
		System.out.println(sistema.verCompromisso());
		
		System.out.println("\n-------------------------------------------------------");
		System.out.println("À infra-estrutura (alocação de salas).\n");
		
		try {
			System.out.println("Adicionar sala");
			System.out.println(sistema.addSala());
			System.out.println();
		} catch (AddException e3) {
			
		}
		
		try {
			System.out.println("Liberar sala");
			System.out.println(sistema.liberarSala());
			System.out.println();
		}
		catch (NotFoundException e2) {
			
		}
		catch (ImpossibleException e2) {
		}
		
		try {
			System.out.println("Ocupar sala");
			System.out.println(sistema.ocuparSala());
			System.out.println();
		} 
		catch (NotFoundException e1) {
		} 
		catch (ImpossibleException e1) {
		}
		
		try {
			System.out.println("Lista de salas");
			System.out.println(sistema.salaDisponivel());
		}
		catch (NotFoundException e1) {
		}
		System.out.println("\n-------------------------------------------------------");
		System.out.println("Ao almoxarifado (estoque, pedido de compra)\n");
		System.out.println("Adicionar pedidos para compra");
		try {
			System.out.println(sistema.addPedidoCompra());
			System.out.println();
		}
		catch (QtdException e) {
		}
		System.out.println("Lista de pedidos pendente");
		System.out.println(sistema.listaPendente());
		System.out.println();
		
		try {
			System.out.println("Compras realizas");
			System.out.println(sistema.compras());
			System.out.println();
		} catch (QtdException e) {
		}
		System.out.println("Exemplo");
		System.out.println();
		System.out.println(sistema.listaPendente());
		System.out.println();
		System.out.println(sistema.estoque());
		
		System.out.println("\n-------------------------------------------------------");
		System.out.println("Financeiras ( folha de pagamento)\n");
		
		try {
			System.out.println(sistema.addConta());
			System.out.println();
		}
		catch (AddException | QtdException e) {
		}
		try {
			System.out.println("valor do saldo atual: "+sistema.addRemanecente());
			System.out.println();
		}
		catch (NegativeException e) {
			
		}
		System.out.println("Contas pendentes");
			System.out.println(sistema.contaPendente());
			System.out.println();
		
		try {
			System.out.println("Pagar conta(s)");
			System.out.println(sistema.quitarConta());
			System.out.println();
		} catch (NotFoundException | ImpossibleException | NegativeException e1) {
			
		}
		System.out.println("Contas pagas");
		System.out.println(sistema.contaQuitada());
		System.out.println();
		
		System.out.println("Lista de todas contas");
		System.out.println(sistema.folhaPagamento());
		System.out.println();
		
		System.out.println("Resumo");
		System.out.println(sistema.balancoFinanceiro());
		System.out.println();
		
		System.out.println("\n-------------------------------------------------------");
		System.out.println("Relacionada aos alunos (histórico e RDM)\n");
		
		System.out.println("RDM");
		System.out.println("Contem "+sistema.RDM()+" disciplina(s) cadastradas");
		System.out.println("\nHistorico");
		System.out.println("Contem "+sistema.historico()+" disciplina(s) cadastradas");
		
		System.out.println("\n-------------------------------------------------------");
		System.out.println("Relacionadas ao professores (alocação por disciplina)\n");
		
		System.out.println(sistema.alocaProfessor());
		
		
	}

}
