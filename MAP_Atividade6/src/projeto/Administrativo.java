package projeto;
import java.util.ArrayList;
import java.util.Iterator;

public class Administrativo {
	private ArrayList<Agenda> agenda;

	public Administrativo() {
		this.agenda = new ArrayList<Agenda>();
	}

	public String AgendarCompromisso(String data, String hora, String observacao) throws AddException {
		int quantindade = agenda.size();
		agenda.add(new Agenda(data, hora, observacao));
		if(quantindade<agenda.size()) {
			return "Ação realizado com sucesso!";
		}
		throw new AddException();
	}
	public String concluirCompromisso(String data, String hora) throws NotFoundException {
		for(int i=0;i<agenda.size();i++) {
			if(agenda.get(i).getData()==data && agenda.get(i).getHora()==hora) {
				agenda.remove(i);
				return "Ação realizado com sucesso!";
			}
		}
		throw new NotFoundException();
	}

	public int compromissoAgendado() {
		int quantidade = 0;
		Iterator<Agenda> it = agenda.iterator();
		while (it.hasNext()) {
			Agenda comparador = it.next();
			System.out.println(comparador.toString());
			quantidade++;
		}
		return quantidade;
	}
}
