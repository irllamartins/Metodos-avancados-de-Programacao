package projeto;



public class Main {

	public static void main(String[] args) {
		ControleCadastrado cadastrado = new ControleCadastrado();
		ExteriorRiqueza riqueza = new ExteriorRiqueza(); 
		CalculaImposto calcular = new CalculaImposto();
		
		Profissional ivo = new Professor("Ivo Dias", 123456789, "professor", 1000, 1000,  1200);
		Profissional jessica = new Medico("Jessica", 675467789, "medica", 1000, 10, 100);
		Profissional fernando = new Taxista("Fernando", 823455439, "taxista", 1000, 10, 10);
		Profissional ana = new Taxista("Ana", 965455439, "taxista", 1000, 10, 1000);
		Profissional joao = new Caminhaneiro("Joao Dias", 123456789, "caminhaneiro", 1000, 0, 10);
		Profissional gustavo = new Caminhaneiro("Gustavo Dias", 12364789, "caminhaneiro", 1000, 15, 10);
		
		Patrimonio casa1 = new Casa(1, 50000, 100); 
		Patrimonio carro1 = new Carro(1, 80000,2020);
		Patrimonio casa2 = new Casa(2, 10000, 100); 
		Patrimonio carro2 = new Carro(2, 100000,2022); 
		
		cadastrado.addContribuente(ivo);
		cadastrado.addContribuente(fernando);
		cadastrado.addContribuente(ana);
		cadastrado.addContribuente(joao);
		cadastrado.addContribuente(jessica);
		cadastrado.addContribuente(gustavo);
		
		cadastrado.getLista().get(0).addPatrimonio(casa1);
		cadastrado.getLista().get(1).addPatrimonio(casa2);
		cadastrado.getLista().get(2).addPatrimonio(casa1);
		cadastrado.getLista().get(2).addPatrimonio(carro2);
		cadastrado.getLista().get(3).addPatrimonio(carro1);
		cadastrado.getLista().get(4).addPatrimonio(carro1);
		cadastrado.getLista().get(4).addPatrimonio(carro2);
		cadastrado.getLista().get(4).addPatrimonio(casa1);
		
		System.out.println("Cadastrar contribuintes.\n");
		cadastrado.listarContribuente();
		
		System.out.println("\nCalcular e mostrar impostos e descontos associados a um contribuinte.\n");
		for(int i=0;i<cadastrado.getLista().size();i++) {
			if(cadastrado.getLista().get(i) instanceof Professor) {
				System.out.println(calcular.imposto((Professor) cadastrado.getLista().get(i)));
			}
			else if(cadastrado.getLista().get(i) instanceof Taxista) {
				System.out.println(calcular.imposto((Taxista) cadastrado.getLista().get(i)));
			}
			else if(cadastrado.getLista().get(i) instanceof Medico) {
				System.out.println(calcular.imposto((Medico) cadastrado.getLista().get(i)));
			}
			else if(cadastrado.getLista().get(i) instanceof Caminhaneiro) {
				System.out.println(calcular.imposto((Caminhaneiro) cadastrado.getLista().get(i)));
			}
			
		}
		System.out.println("\nListar os contribuintes em função dos sinais exteriores de riqueza indicando se são excessivos ou não.\n");
		for(int i=0;i<cadastrado.getLista().size();i++) {
			System.out.println(cadastrado.getLista().get(i)+" "+riqueza.somatorioRiqueza(cadastrado.getLista().get(i), cadastrado.getLista()));
			
		}
	}


}
