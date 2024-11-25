package exercicio5;

public class Radio extends Eletrodomestico {
	private int banda, volume;
	private double sintonia;
	
	private static final int AM = 1;
	private static final int FM = 2;
	
	public Radio(boolean ligado, int voltagem, int banda, int volume, double sintonia) {
		super(ligado, voltagem);
		this.banda = banda;
		this.volume = volume;
		this.sintonia = sintonia;
	}

	public int getBanda() {
		return banda;
	}

	public void setBanda(int banda) {
		this.banda = banda;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public double getSintonia() {
		return sintonia;
	}

	public void setSintonia(double sintonia) {
		this.sintonia = sintonia;
	}

	@Override
	public void ligar() {
		this.banda = FM;
		this.sintonia = 88.1;
		this.volume = 10;
	}

	@Override
	public void desligar() {
		this.sintonia = 0;
		this.volume = 0;
	}
	
	
	
}
