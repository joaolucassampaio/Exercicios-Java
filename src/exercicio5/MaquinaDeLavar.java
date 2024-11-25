package exercicio5;

public class MaquinaDeLavar extends Eletrodomestico{

	private int opcaoDeLavagem;
	
	public MaquinaDeLavar(boolean ligado, int voltagem, int opcaoDeLavagem) {
		super(ligado, voltagem);
		this.opcaoDeLavagem = opcaoDeLavagem;
	}

	public int getOpcaoDeLavagem() {
		return opcaoDeLavagem;
	}

	public void setOpcaoDeLavagem(int opcaoDeLavagem) {
		this.opcaoDeLavagem = opcaoDeLavagem;
	}

	@Override
	public void ligar() {
		this.opcaoDeLavagem = 1;
	}

	@Override
	public void desligar() {
		this.opcaoDeLavagem = 0;
	}
	
	
}
