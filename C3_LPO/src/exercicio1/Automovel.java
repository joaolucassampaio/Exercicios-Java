package exercicio1;

public class Automovel {
	//definição de constantes
	private static final int NUMEROMAXIMOPRESTACOES = 24;
	public static final int GASOLINA = 1;
	public static final int FLEX = 2;
	public static final int DIESEL = 3;
	public static final int GAS = 4;
	
	//definição de atributos
	private String modelo;
	private String cor;
	private int combustivel;
	
	public Automovel(String modelo, String cor, int combustivel) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.combustivel = combustivel;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(int combustivel) {
		this.combustivel = combustivel;
	}

	@Override
	public String toString() {
		return "Automovel [modelo=" + modelo + ", cor=" + cor + ", movido a=" + combustivel + "]";
	}
	
	public int numeroPrestacoes() {
		return NUMEROMAXIMOPRESTACOES;
	}
	
	public int valor() {
		if(combustivel == 1) {
			return 60000;			
		} else if(combustivel == 3) {
			return 55000;
		} else if(combustivel == 4) {
			return 52000;
		} else if(combustivel == 2) {
			return 58000;
		}
		return 0;
	}
	
}
