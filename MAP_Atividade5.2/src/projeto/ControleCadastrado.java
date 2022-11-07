package projeto;

import java.util.ArrayList;
import java.util.Iterator;

public class ControleCadastrado {
	private ArrayList<Profissional> lista;
	
	public ControleCadastrado() {
		this.lista = new ArrayList<Profissional>();
	}

	public ArrayList<Profissional> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Profissional> lista) {
		this.lista = lista;
	}
	
	public boolean addContribuente(Profissional ivo) {
		int pessoas = lista.size();
		lista.add(ivo);
		if(pessoas<lista.size()) {
			return true;
		}
		else
			return false;
		
	}
	
	public void listarContribuente() {
		Iterator<Profissional> p =  lista.iterator();
		
		while (p.hasNext()) {
			Profissional profissional = p.next();
			System.out.println(profissional.toString());
			
		}
	}
	

}
