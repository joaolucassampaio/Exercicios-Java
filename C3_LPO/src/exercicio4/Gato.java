package exercicio4;

public class Gato  extends Animal{

	public Gato(String nomeDoAnimal) {
		super(nomeDoAnimal);
	}

	@Override
	public String caminha() {
		return super.getNomeDoAnimal() + " está pulando!";
	}

	@Override
	public String late() {
		return super.late();
	}

}
