package exercicio6;

// Atributos estáticos podem sim ter get e set
// Eles não são constantes, podem ser alterados
// Não se confunda pelo nome
// A "estaticidade" está relacionada com o fato deles serem iguais para todas as instâncias daquela classe
// E se você alterar ele em qualquer instância, muda para todas as outras

public abstract class Funcionario {
	private String nome;
	private int matricula;
	private static double salario_base = 1500;
	
	public Funcionario(String nome, int matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public static double getSalario_base() {
		return salario_base;
	}

	public static void setSalario_base(double salario_base) {
		Funcionario.salario_base = salario_base;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public abstract double calculaSalario();
	
}
