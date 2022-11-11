package projeto;
import java.util.ArrayList;
import java.util.Iterator;

public class Administrativo {
	private ArrayList<Agenda> agenda;

	public Administrativo() {
		this.agenda = new ArrayList<Agenda>();
	}

	public boolean AgendarCompromisso(String data, String hora, String observacao) {
		int quantindade = agenda.size();
		agenda.add(new Agenda(data, hora, observacao));
	
		if(quantindade<agenda.size()) {
			return true; 
		}
		else return false;
	}
	public boolean concluirCompromisso(String data, String hora) {
		for(int i=0;i<agenda.size();i++) {
			if(agenda.get(i).getData()==data && agenda.get(i).getHora()==hora) {
				agenda.remove(i);
				return true;
			}
		}
		return false;
	}

	public boolean compromissoAgendado() {
		Iterator<Agenda> it = agenda.iterator();
		boolean status = false;
		while (it.hasNext()) {
			Agenda comparador = it.next();
			System.out.println(comparador.toString());
			status=true;
		}
		return status;
	}
}
