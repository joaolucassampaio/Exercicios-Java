package exercicio4;

public class Ave extends Animal{

	public Ave(String nomeDoAnimal) {
		super(nomeDoAnimal);
	}

	@Override
	public String caminha() {
		return super.getNomeDoAnimal() + " está voando!";
		
		
	}

	@Override
	public String canta() {
		// TODO Auto-generated method stub
		return super.canta();
	}

}
