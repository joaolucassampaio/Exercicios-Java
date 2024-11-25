package exercicio4;

public abstract class Animal {
	
	private String nomeDoAnimal;
	
	public Animal(String nomeDoAnimal) {
		super();
		this.nomeDoAnimal = nomeDoAnimal;
	}

	public String getNomeDoAnimal() {
		return nomeDoAnimal;
	}

	public void setNomeDoAnimal(String nomeDoAnimal) {
		this.nomeDoAnimal = nomeDoAnimal;
	}

	@Override
	public String toString() {
		return "Animal [nomeDoAnimal=" + nomeDoAnimal + "]";
	}

	public abstract String caminha();
	
	public String late() {
		return "Au au";
	}
	
	public String mia() {
		return "Miau";
	}
	
	public String canta() {
		return "canta";
	}
}
