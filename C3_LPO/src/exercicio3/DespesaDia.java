package exercicio3;

public class DespesaDia {
	private int dia, mes;
	private double valor;
	
	public DespesaDia(int dia, int mes, double valor) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.valor = valor;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "DespesaDia [dia=" + dia + ", mes=" + mes + ", valor=" + valor + "]";
	}
	
	
	
}
