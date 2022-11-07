package projeto;

public class Casa extends Patrimonio {
	private float area;

	public Casa(int id, double valor, float area) {
		super(id, valor);

		this.area = area;

	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Casa [Id: " + getId() + ", Valor: " + getValor() + ", area: " + area + "]";
	}

}
