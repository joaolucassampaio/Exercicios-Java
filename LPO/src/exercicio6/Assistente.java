package exercicio6;

public class Assistente extends Funcionario{

	public Assistente(String nome, int matricula) {
		super(nome, matricula);
	}

	@Override
	public double calculaSalario() {
		return super.getSalario_base();
	}
	
	
	
}
