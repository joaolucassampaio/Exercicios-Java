package exercicio6;

public class Gerente extends Funcionario{
	
	//Não precisa redeclarar os atributos, só usar os gets e sets
	//Já são herdados
	
	public Gerente(String nome, int matricula) {
		super(nome, matricula);
	}

	@Override
	public double calculaSalario() {
		double recebe = (super.getSalario_base() * 2);
		return recebe;
	}
	
}
