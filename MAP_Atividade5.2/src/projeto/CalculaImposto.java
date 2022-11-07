package projeto;

public class CalculaImposto {

	public CalculaImposto() {
		
	}
	
	public String imposto(Professor profissional) {
			double valor = profissional.tarifa()-profissional.desconto();
			if(valor<=0) {
				return profissional.toString()+"Inseto!";
			}
			else {
				return profissional.toString()+"O valor do imposto é "+valor;
			}


	}
	public String imposto(Taxista profissional) {
		double valor = profissional.tarifa()-profissional.desconto();
		if(valor<=0) {
			return profissional.toString()+"Inseto!";
		}
		else {
			return profissional.toString()+"O valor do imposto é "+valor;
		}

	}
	public String imposto(Medico profissional) {
		double valor = profissional.tarifa()-profissional.desconto();
		if(valor<=0) {
			return profissional.toString()+"Inseto!";
		}
		else {
			return profissional.toString()+"O valor do imposto é "+valor;
		}

	}
	public String imposto(Caminhaneiro profissional) {
		double valor = profissional.tarifa()-profissional.desconto();
		if(valor<=0) {
			return profissional.toString()+"Inseto!";
		}
		else {
			return profissional.toString()+"O valor do imposto é "+valor;
		}
	}

}
