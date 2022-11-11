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

	public boolean ocuparSalas(int numero) {
		Iterator<Sala> it = salas.iterator();
		while (it.hasNext()) {
			Sala comparador = it.next();
			if(numero==comparador.getNumero()) {
				
				comparador.setDisponivel(false);
				return true;
			}
		}
		return false;
	}
	public boolean liberarSalas(int numero) {
		Iterator<Sala> it = salas.iterator();
		while (it.hasNext()) {
			Sala comparador = it.next();
			if(numero==comparador.getNumero()) {
				comparador.setDisponivel(true);
				return true;
			}
		}
		return false;
	}
	public boolean salasDisponiveis() {
		Iterator<Sala> it = salas.iterator();
		while (it.hasNext()) {
			Sala comparador = it.next();
			if(comparador.getDisponivel()==true) {
				System.out.println(comparador.toString());
				return true;
			}
		}
		return false;	}
	public  boolean addSala(int numero, int capacidade,boolean disponivel) {
		salas.add(new Sala(numero, capacidade,disponivel));
		return true;
		
	}
}
