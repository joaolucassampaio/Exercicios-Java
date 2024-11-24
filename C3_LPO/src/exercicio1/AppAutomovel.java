package exercicio1;

import java.util.ArrayList;

import io.InOut;

public class AppAutomovel {

	public static void main(String[] args) {
		ArrayList<Automovel> listaAutomoveis = new ArrayList<Automovel>();
		
		cadastrarAutomoveis(listaAutomoveis);
		imprimirAutomoveis(listaAutomoveis);
		mudarCambio(listaAutomoveis);
		imprimirBasicos(listaAutomoveis);
		imprimirPossuemRadio(listaAutomoveis);
	}

	private static void imprimirPossuemRadio(ArrayList<Automovel> listaAutomoveis) {
		for(int i=0; i<listaAutomoveis.size(); i++) {
			Automovel automovel = listaAutomoveis.get(i);
			if(automovel instanceof AutomovelBasico) {
				AutomovelBasico automovelBasico = (AutomovelBasico) automovel; //casting
				if(automovelBasico.isRadioAmFm()) {
					InOut.msgDeInformacao("Automóveis que possuem rádio:", 
							"Modelo: " + automovelBasico.getModelo());
				}
			}
		}
		
		for(int i=0; i<listaAutomoveis.size(); i++) {
			Automovel automovel = listaAutomoveis.get(i);
			if(automovel instanceof AutomovelDeLuxo) {
				AutomovelDeLuxo automovelDeLuxo = (AutomovelDeLuxo) automovel; //casting
				if(automovelDeLuxo.isRadioAmFm()) {
					InOut.msgDeInformacao("Automóveis que possuem rádio:", 
							"Modelo: " + automovelDeLuxo.getModelo());
				}
			} 
		}
	}

	private static void imprimirBasicos(ArrayList<Automovel> listaAutomoveis) {
		for(int i=0; i<listaAutomoveis.size(); i++) {
			Automovel automovel = listaAutomoveis.get(i);
			if(automovel instanceof AutomovelBasico && !(automovel instanceof AutomovelDeLuxo)) {
				AutomovelBasico automovelBasico = (AutomovelBasico) automovel;
				InOut.msgDeInformacao("Automóveis Básicos:", 
						"Modelo: " + automovelBasico.getModelo());
			}
		}
	}

	private static void mudarCambio(ArrayList<Automovel> listaAutomoveis) {
		for(int i=0; i<listaAutomoveis.size(); i++) {
			Automovel automovel = listaAutomoveis.get(i);
			if(automovel instanceof AutomovelDeLuxo) {
				AutomovelDeLuxo automovelDeLuxo = (AutomovelDeLuxo) automovel; //casting
				if(automovelDeLuxo.isDirecaoHidraulica()) {
					automovelDeLuxo.setCambioAutomatico(false);					
				} else {
					automovelDeLuxo.setCambioAutomatico(true);	
				}
			}
		}
	}

	private static void imprimirAutomoveis(ArrayList<Automovel> listaAutomoveis) {
		for(int i=0; i<listaAutomoveis.size(); i++) {
			InOut.msgDeInformacao("Automóvel " + (i+1), 
					"Modelo: " + listaAutomoveis.get(i).getModelo() +
					"\nValor: " + listaAutomoveis.get(i).valor() +
					"\nNúmero máximo de Prestações: " + listaAutomoveis.get(i).numeroPrestacoes());
		}
	}

	private static void cadastrarAutomoveis(ArrayList<Automovel> listaAutomoveis) {
		Automovel automovel1 = new Automovel("corolla", "prata", 1);
		AutomovelBasico automovel2 = new AutomovelBasico("civic", "preto", 1, false, false, false);
		AutomovelBasico automovel3 = new AutomovelBasico("ranger", "branca", 1, true, true, true);
		AutomovelDeLuxo automovel4 = new AutomovelDeLuxo("bugatti veyron", "vermelha", 1, true, true, true, false, true, false);
		AutomovelDeLuxo automovel5 = new AutomovelDeLuxo("lamborghini aventador", "amarela", 1, true, true, true, true, false, true);
		
		listaAutomoveis.add(automovel1);
		listaAutomoveis.add(automovel2);
		listaAutomoveis.add(automovel3);
		listaAutomoveis.add(automovel4);
		listaAutomoveis.add(automovel5);
	}
	
}