package exercicio6;

public class Vendedor extends Funcionario {
	
	private double comissao;
	
	public Vendedor(String nome, int matricula, double comissao) {
		super(nome, matricula);
		this.comissao = comissao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}


	@Override
	public double calculaSalario() {
		double recebe = (super.getSalario_base() + comissao);
 		return recebe;
	}
	
}
