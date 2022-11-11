package projeto;

public class Agenda {
	private String data;
	private String hora;
	private String compromisso;
	public Agenda(String data, String hora, String compromisso) {
		this.data = data;
		this.hora = hora;
		this.compromisso = compromisso;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	public String getCompromisso() {
		return compromisso;
	}
	public void setCompromisso(String compromisso) {
		this.compromisso = compromisso;
	}
	@Override
	public String toString() {
		return "Agenda [ Compromisso:  "+ getCompromisso()+" data: " + data + ", hora: " + hora + "]";
	}
	
	
}
