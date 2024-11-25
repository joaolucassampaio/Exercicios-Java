package exercicio4;

public class Cachorro extends Animal{

	public Cachorro(String nomeDoAnimal) {
		super(nomeDoAnimal);
	}

	@Override
	public String caminha() {
		return super.getNomeDoAnimal() + " está correndo!";
	}

	@Override
	public String late() {
		return super.late();
	}
	
	

}
