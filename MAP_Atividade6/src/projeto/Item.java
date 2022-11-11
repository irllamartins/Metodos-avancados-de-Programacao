package projeto;

public class Item {
	private int UPC;
	private String nome;
	public Item(int UPC,String nome) {
		this.nome = nome;
		this.UPC= UPC;
	}
	public int getUPC() {
		return UPC;
	}
	public void setUPC(int UPC) {
		this.UPC = UPC;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Item [UPC: " + UPC + ", nome: " + nome + "]";
	}
	

}
