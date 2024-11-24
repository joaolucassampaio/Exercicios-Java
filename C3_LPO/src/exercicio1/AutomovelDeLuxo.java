package exercicio1;

public class AutomovelDeLuxo extends AutomovelBasico{

	private boolean direcaoHidraulica, cambioAutomatico, vidroETravaEletrica;
	private static final int NUMEROMAXIMOPRESTACOES = 36;
	
	public AutomovelDeLuxo(String modelo, String cor, int combustivel) {
		super(modelo, cor, combustivel);
	}

	public AutomovelDeLuxo(String modelo, String cor, int combustivel, 
            boolean retrovisorDoPassageiro, boolean limpadorTraseiro, boolean radioAmFm,
            boolean direcaoHidraulica, boolean cambioAutomatico, boolean vidroETravaEletrica) {
			super(modelo, cor, combustivel, retrovisorDoPassageiro, limpadorTraseiro, radioAmFm);  // Chama o construtor de AutomovelBasico
			this.direcaoHidraulica = direcaoHidraulica;
			this.cambioAutomatico = cambioAutomatico;
			this.vidroETravaEletrica = vidroETravaEletrica;
}


	public boolean isDirecaoHidraulica() {
		return direcaoHidraulica;
	}

	public void setDirecaoHidraulica(boolean direcaoHidraulica) {
		this.direcaoHidraulica = direcaoHidraulica;
	}

	public boolean isCambioAutomatico() {
		return cambioAutomatico;
	}

	public void setCambioAutomatico(boolean cambioAutomatico) {
		this.cambioAutomatico = cambioAutomatico;
	}

	public boolean isVidroETravaEletrica() {
		return vidroETravaEletrica;
	}

	public void setVidroETravaEletrica(boolean vidroETravaEletrica) {
		this.vidroETravaEletrica = vidroETravaEletrica;
	}

	@Override
	public String toString() {
		return "AutomovelDeLuxo [direcaoHidraulica=" + direcaoHidraulica + ", cambioAutomatico=" + cambioAutomatico
				+ ", vidroETravaEletrica=" + vidroETravaEletrica + "]";
	}
	
	public int numeroPrestacoes() {
		return NUMEROMAXIMOPRESTACOES;
	}
	
	public int valor() {
		if(direcaoHidraulica) {
			return super.valor() + 2500;
		} else if(cambioAutomatico) {
			return super.valor() + 3000;
		} else if(vidroETravaEletrica) {
			return super.valor() + 1700;
		}
		return super.valor() + 0;
	}
}
