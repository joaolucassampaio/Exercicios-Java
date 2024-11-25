package exercicio5;

import java.util.ArrayList;

import io.InOut;

public class UsaEletrodomestico {

	public static void main(String[] args) {
		ArrayList <Eletrodomestico> listaEletrodomesticos = new ArrayList<Eletrodomestico>();
		
		cadastrarEletrodomesticos(listaEletrodomesticos);
		ligarTodos(listaEletrodomesticos);
		alterarRadio(listaEletrodomesticos);
		alterarTv(listaEletrodomesticos);
		imprimirEletrodomesticos(listaEletrodomesticos);
	}

	private static void imprimirEletrodomesticos(ArrayList<Eletrodomestico> listaEletrodomesticos) {
		for(int i=0; i<listaEletrodomesticos.size(); i++) {
			Eletrodomestico eletrodomestico = listaEletrodomesticos.get(i);
			
			if(eletrodomestico instanceof TV) {
				TV tv = (TV) eletrodomestico;
				InOut.msgDeInformacao("Eletrodomesticos", 
						"Eletrodomestico: TV" + 
						"Ligada: " + tv.isLigado()
						"");
			}
			
		}
		
	}

	private static void alterarTv(ArrayList<Eletrodomestico> listaEletrodomesticos) {
		for(int i=0; i<listaEletrodomesticos.size(); i++) {
			Eletrodomestico eletrodomestico = listaEletrodomesticos.get(i);
			
			if(eletrodomestico instanceof TV) {
				TV tv = (TV) eletrodomestico;
				tv.setCanal(12);
			}
		}
	}

	private static void alterarRadio(ArrayList<Eletrodomestico> listaEletrodomesticos) {
		for(int i=0; i<listaEletrodomesticos.size(); i++) {
			Eletrodomestico eletrodomestico = listaEletrodomesticos.get(i);
			
			if(eletrodomestico instanceof Radio) {
				Radio radio = (Radio) eletrodomestico;
				radio.setVolume(15);
				radio.setSintonia(101.5);
				radio.setVoltagem(220);
			}
		}
	}

	private static void ligarTodos(ArrayList<Eletrodomestico> listaEletrodomesticos) {
		for(int i=0; i<listaEletrodomesticos.size(); i++) {
			Eletrodomestico eletrodomestico = listaEletrodomesticos.get(i);
			eletrodomestico.ligar();
		}
	}

	private static void cadastrarEletrodomesticos(ArrayList<Eletrodomestico> listaEletrodomesticos) {
		TV eletrodomestico1 = new TV(false, 110, 0, 0, 29);
		Radio eletrodomestico2 = new Radio(false, 110, 0, 0, 0);
		MaquinaDeLavar eletrodomestico3 = new MaquinaDeLavar(false, 110, 0);
		
		listaEletrodomesticos.add(eletrodomestico1);
		listaEletrodomesticos.add(eletrodomestico2);
		listaEletrodomesticos.add(eletrodomestico3);
	}

}
