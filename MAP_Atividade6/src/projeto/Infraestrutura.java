package projeto;
import java.util.ArrayList;
import java.util.Iterator;

public class Infraestrutura {
	private ArrayList<Sala> salas;
	public Infraestrutura() {
		this.salas = new ArrayList<Sala>();
	}
	
	public ArrayList<Sala> getSalas() {
		return salas;
	}

	public void setSalas(ArrayList<Sala> salas) {
		this.salas = salas;
	}

	public String ocuparSalas(int numero) throws ImpossibleException, NotFoundException {
		Iterator<Sala> it = salas.iterator();
		while (it.hasNext()) {
			Sala comparador = it.next();
			if(numero==comparador.getNumero()) {
				if(true==comparador.getDisponivel()) {
					comparador.setDisponivel(false);
					return "Ação realizado com sucesso!";
				}
				throw new ImpossibleException();

			}
		}
		throw new NotFoundException();
	}
	public String liberarSalas(int numero) throws ImpossibleException, NotFoundException {
		Iterator<Sala> it = salas.iterator();
		while (it.hasNext()) {
			Sala comparador = it.next();
			if(numero==comparador.getNumero()) {
				if(false==comparador.getDisponivel()) {
					comparador.setDisponivel(true);
					return "Ação realizado com sucesso!";
				}
				throw new ImpossibleException();

			}
		}
		throw new NotFoundException();
	}
	public int salasDisponiveis() {
		int quantidade = 0;
		Iterator<Sala> it = salas.iterator();
		while (it.hasNext()) {
			Sala comparador = it.next();
			if(comparador.getDisponivel()==true) {
				System.out.println(comparador.toString());
				quantidade++;
			}
		}
		return quantidade;	
	}
	
	public String addSala(int numero, int capacidade,boolean disponivel) throws AddException {
		int quantidade = salas.size();
		salas.add(new Sala(numero, capacidade,disponivel));
		if(quantidade<salas.size()) {
			return "Ação realizado com sucesso!";
		}
		else
			throw new AddException();
		
	}
}
