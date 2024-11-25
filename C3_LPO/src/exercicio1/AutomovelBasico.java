package exercicio1;

public class AutomovelBasico extends Automovel{
	
	private boolean retrovisorDoPassageiro, limpadorTraseiro, radioAmFm;
	
	public AutomovelBasico(String modelo, String cor, int combustivel) {
		super(modelo, cor, combustivel); //chama o construtor da superclasse
	}
	
	public AutomovelBasico(String modelo, String cor, int combustivel, boolean retrovisorDoPassageiro,
			boolean limpadorTraseiro, boolean radioAmFm) {
		super(modelo, cor, combustivel);
		this.retrovisorDoPassageiro = retrovisorDoPassageiro;
		this.limpadorTraseiro = limpadorTraseiro;
		this.radioAmFm = radioAmFm;
	}

	public boolean isRetrovisorDoPassageiro() {
		return retrovisorDoPassageiro;
	}

	public void setRetrovisorDoPassageiro(boolean retrovisorDoPassageiro) {
		this.retrovisorDoPassageiro = retrovisorDoPassageiro;
	}

	public boolean isLimpadorTraseiro() {
		return limpadorTraseiro;
	}

	public void setLimpadorTraseiro(boolean limpadorTraseiro) {
		this.limpadorTraseiro = limpadorTraseiro;
	}

	public boolean isRadioAmFm() {
		return radioAmFm;
	}

	public void setRadioAmFm(boolean radioAmFm) {
		this.radioAmFm = radioAmFm;
	}

	@Override
	public String toString() {
		return "AutomovelBasico [retrovisorDoPassageiro=" + retrovisorDoPassageiro + ", limpadorTraseiro="
				+ limpadorTraseiro + ", radioAmFm=" + radioAmFm + "]";
	}
	
	public int valor() {
		int valorOriginal = super.valor();
		if(retrovisorDoPassageiro) {
			return valorOriginal + 1250;
		} else if(limpadorTraseiro) {
			return valorOriginal + 500;
 		} else if(radioAmFm) {
 			return valorOriginal + 1500;
 		}
		return super.valor() + 0;
	}
	

}
