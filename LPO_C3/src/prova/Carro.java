package prova;

public class Carro implements Interface {
	//Atributos de instância
	private int codigo;
	private String modelo;
	private boolean locado;
	private int numDias;
	
	//Atributos estáticos
	private static int numLocados = 0;//armazena a qtd de carros que estão locados
	private static int diaria = 75;
	
	public Carro(int codigo, String modelo, int numDias) {
		super();
		this.codigo = codigo;
		this.modelo = modelo;
		this.locado = false;
		this.numDias = numDias;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumDias() {
		return numDias;
	}

	public void setNumDias(int numDias) {
		this.numDias = numDias;
	}

	public int getCodigo() {
		return codigo;
	}

	public boolean isLocado() {
		return locado;
	}

	public static int getNumLocados() {
		return numLocados;
	}

	public static double getDiaria() {
		return diaria;
	}

	@Override
	public boolean locar() {
		if(locado) {
			return false;
		} else {
			this.locado = true;
			Carro.numLocados++;
			return true;			
		}
	}

	@Override
	public int devolver() {
		int valorLocacao = 0;
		if(!locado) {
			return 0;
		} else {
			this.locado = false;
			Carro.numLocados--;
			
			valorLocacao = (this.numDias * Carro.diaria);
			
		}
		return valorLocacao;
	}
	 
}
