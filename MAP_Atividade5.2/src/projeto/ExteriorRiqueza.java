package projeto;

import java.util.ArrayList;
import java.util.Iterator;

public class ExteriorRiqueza {

	public ExteriorRiqueza() {
	}
	
	public String somatorioRiqueza(Profissional profissional,ArrayList<Profissional> profissionais) {
		Iterator<Profissional> it =  profissionais.iterator();
		int cont=0;
		double somaCategoria=0;
		
		while (it.hasNext()) {
			Profissional prof = it.next();
			
			if(prof.getProfissao() == profissional.getProfissao()) {
				cont++;
				somaCategoria+=prof.calculaPatrimonio();
			}
		}
		
		double media=(somaCategoria/cont)*1.5;
		
		if (media-profissional.calculaPatrimonio()<0) {
			
			return "Sim";
		}
		else {
			return "Nao";
		}
	}
	
}
