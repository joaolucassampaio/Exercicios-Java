package exercicio6;

import java.util.ArrayList;

import io.InOut;

public class AppFuncionario {

	public static void main(String[] args) {
		ArrayList <Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
		
		cadastrarFuncionarios(listaFuncionarios);
		imprimirFuncionarios(listaFuncionarios);
		somaSalárioFuncionarios(listaFuncionarios);
		
	}

	private static void somaSalárioFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
		double somaSalario = 0;
		for(int i=0; i<listaFuncionarios.size(); i++) {
			Funcionario funcionario = listaFuncionarios.get(i);
			somaSalario += funcionario.calculaSalario();
		}
		InOut.msgDeInformacao("Soma dos salários:", "A soma dos salários dos funcionários é: " + somaSalario);
	}

	private static void imprimirFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
		for(int i=0; i<listaFuncionarios.size(); i++){
			Funcionario funcionario = listaFuncionarios.get(i);
			
			InOut.msgDeInformacao("Funcionários:", 
					"Nome: " + funcionario.getNome() +
					"\nMatrícula: " + funcionario.getMatricula() +
					"\nSalário: " + funcionario.calculaSalario()); //Isso é um exemplo de polimorfismo
			//Por isso ele é tão forte, você pode usar a classe abstrata como referência "funcionario" para todas as outras classes que dela herdam
			//E pode acessar um método com mesmo nome para todas, mas que age diferente em cada uma. Fortíssimo.
		}
	}

	private static void cadastrarFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
		Gerente funcionario1 = new Gerente("João", 1);
		Assistente funcionario2 = new Assistente("Anna", 2);
		Vendedor funcionario3 = new Vendedor("Dongwa", 3, 500);
		
		listaFuncionarios.add(funcionario1);
		listaFuncionarios.add(funcionario2);
		listaFuncionarios.add(funcionario3);
	}
}
