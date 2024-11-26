package prova;

// Ela herda a implementação da Interface também

public class CarroVip extends Carro {
	
	private static int diaria = 120;
	
	public CarroVip(int codigo, String modelo, int numDias) {
		super(codigo, modelo, numDias);
	}
	
}
