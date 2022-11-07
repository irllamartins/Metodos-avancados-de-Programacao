package projeto;

import java.util.ArrayList;
import java.util.Iterator;

public class Profissional {
	private String nome;
	private int cpf;
	private String profissao;
	private double salario;
	private ArrayList<Patrimonio> patrimonio;
	
	public Profissional(String nome, int cpf,  String profissao, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
		this.salario = salario;
		this.patrimonio = new ArrayList<Patrimonio>();
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public ArrayList<Patrimonio> getPatrimonio() {
		return patrimonio;
	}

	public void setPatrimonio(ArrayList<Patrimonio> patrimonio) {
		this.patrimonio = patrimonio;
	}
	public boolean addPatrimonio(Patrimonio novo) {
		int itens = patrimonio.size();
		patrimonio.add(novo);
		if(itens<patrimonio.size()) {
			return true;
		}
		else
			return false;
		
	}
	public double calculaPatrimonio() {
		Iterator<Patrimonio> p =  getPatrimonio().iterator();
		double soma=0;
		
		while (p.hasNext()) {
			Patrimonio patrimonio = p.next();
			soma+=patrimonio.getValor();
			
		}
		return soma;
	}
	

}
