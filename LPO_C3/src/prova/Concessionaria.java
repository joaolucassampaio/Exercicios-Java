package prova;

import java.util.ArrayList;

import io.InOut;

public class Concessionaria {

	public static void main(String[] args) {
		ArrayList <Carro> listaCarros = new ArrayList<Carro>();
		
		String opcao;
		
		do {
			opcao = exibirMenu();
			switch(opcao) {
			case "1":
				cadastrar(listaCarros);
				break;
				
			case "2":
				pesquisar(listaCarros);
				break;
				
			case "3":
				alugar(listaCarros);
				break;
				
			case "4":
				devolver(listaCarros);
				break;
				
			case "5":
				listar(listaCarros);
				break;
				
			case "6":
				InOut.msgDeAviso("Encerrando...", "Encerando o programa...");
				break;
				
			default:
                InOut.msgDeErro("Erro", "Opcao invalida! Tente novamente.");
			}
		} while(!opcao.equals("6"));
		InOut.msgDeAviso(null, "Programa encerrado com sucesso!");

}

	private static void listar(ArrayList<Carro> listaCarros) {
		// TODO Auto-generated method stub
		
	}

	private static void devolver(ArrayList<Carro> listaCarros) {
	    int codigo = InOut.leInt("Digite o código do carro que deseja devolver:");
	    int posicao = buscarCarroPorCodigo(listaCarros, codigo);

	    if (posicao != -1) {
	        Carro carro = listaCarros.get(posicao);

	        if (carro.isLocado()) {
	            int valorAPagar = carro.devolver();
	            String mensagem = String.format(
	                "Carro devolvido com sucesso! Valor a pagar: R$ %.2f",
	                (double) valorAPagar
	            );
	            InOut.msgDeAviso("Sucesso", mensagem);
	        } else {
	            InOut.msgDeErro("Erro", "O carro não está locado.");
	        }
	    } else {
	        InOut.msgDeErro("Erro", "Código do carro não encontrado!");
	    }
	}


	private static void alugar(ArrayList<Carro> listaCarros) {
	    int codigo = InOut.leInt("Digite o código do carro que deseja alugar:");
	    int posicao = buscarCarroPorCodigo(listaCarros, codigo);

	    if (posicao != -1) {
	        Carro carro = listaCarros.get(posicao);
	        if (carro.locar()) {
	            InOut.msgDeAviso("Sucesso", "Carro Locado Com Sucesso!");
	        } else {
	            InOut.msgDeErro("Erro", "O carro já está locado!");
	        }
	    } else {
	        InOut.msgDeErro("Erro", "Código do carro não encontrado!");
	    }
	}


	private static void pesquisar(ArrayList<Carro> listaCarros) {
	    int codigo = InOut.leInt("Digite o código do carro que deseja pesquisar:");
	    int posicao = buscarCarroPorCodigo(listaCarros, codigo);

	    if (posicao != -1) {
	        Carro carroEncontrado = listaCarros.get(posicao);
	        String mensagem = "O carro está na posição " + posicao + " da lista.\n"
	                        + "Código: " + carroEncontrado.getCodigo() + "\n"
	                        + "Modelo: " + carroEncontrado.getModelo() + "\n"
	                        + "Dias alugados: " + carroEncontrado.getNumDias() + "\n"
	                        + "Locado: " + (carroEncontrado.isLocado() ? "Sim" : "Não");
	        
	        InOut.msgDeAviso("Carro Encontrado!", mensagem);
	    } else {
	        InOut.msgDeErro("Não encontrado", "Nenhum carro com o código informado foi encontrado.");
	    }
	}


	private static int buscarCarroPorCodigo(ArrayList<Carro> listaCarros, int codigo) {
	    for (int i = 0; i < listaCarros.size(); i++) {
	        if (listaCarros.get(i).getCodigo() == codigo) {
	            return i;
	        }
	    }
	    return -1;
	}


	private static void cadastrar(ArrayList<Carro> listaCarros) {
		int codigo = InOut.leInt("Qual é o código do carro?");
		String modelo = InOut.leString("Qual é o modelo do carro");
		int numDias = InOut.leInt("Por quantos dias?");
		
		
		Carro carro = new Carro(codigo, modelo, numDias);
		
		listaCarros.add(carro);
	}

	private static String exibirMenu() {
		String opcao;
        opcao = InOut.leString("Bem-vindo(a) ao Sistema de Atendimento ao Cliente!\n\n"
            + "Como posso te ajudar hoje?\n"
            + "1- Cadastrar;\n"
            + "2- Pesquisar;\n"
            + "3- Alugar;\n"
            + "4- Devolver;\n"
            + "5- Listar.\n"
            + "6- Sair do Programa.\n\n"
            + "Digite a opção desejada:");
        return opcao;
	}

}
