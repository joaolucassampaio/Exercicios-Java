package exercicio4;

import java.util.ArrayList;

import io.InOut;

public class UsaAnimal {

	public static void main(String[] args) {
		ArrayList <Animal> listaAnimais = new ArrayList<Animal>();
		
		cadastrarAnimais(listaAnimais);
		lateMiaCanta(listaAnimais);
		todosCaminhem(listaAnimais);
	}

	private static void todosCaminhem(ArrayList<Animal> listaAnimais) {
		for(int i=0; i<listaAnimais.size(); i++) {
			Animal animal = listaAnimais.get(i);
			
			if(animal instanceof Cachorro) {
				Cachorro cachorro = (Cachorro) animal;//casting
				InOut.msgDeInformacao("Caminha", cachorro.caminha());
			} else if(animal instanceof Gato) {
				Gato gato = (Gato) animal;
				InOut.msgDeInformacao("Salta", gato.caminha());
			} else if(animal instanceof Ave) {
				Ave ave = (Ave) animal;
				InOut.msgDeInformacao("Voa", ave.caminha());
			}
		}
	}

	private static void lateMiaCanta(ArrayList<Animal> listaAnimais) {
		for(int i=0; i<listaAnimais.size(); i++) {
			Animal animal = listaAnimais.get(i);
			
			if(animal instanceof Cachorro) {
				Cachorro cachorro = (Cachorro) animal;//casting
				InOut.msgDeInformacao("Late", cachorro.late());
			} else if(animal instanceof Gato) {
				Gato gato = (Gato) animal;
				InOut.msgDeInformacao("Mia", gato.mia());
			} else if(animal instanceof Ave) {
				Ave ave = (Ave) animal;
				InOut.msgDeInformacao("Mia", ave.canta());
				
			}
		}
	}

	private static void cadastrarAnimais(ArrayList<Animal> listaAnimais) {
		Cachorro animal1 = new Cachorro("Lucky");
		Cachorro animal2 = new Cachorro("Jolie");
		Gato animal3 = new Gato("Sagwa");
		Gato animal4 = new Gato("Dongwa");
		Ave animal5 = new Ave("Staraptor");
		
		listaAnimais.add(animal1);
		listaAnimais.add(animal2);
		listaAnimais.add(animal3);
		listaAnimais.add(animal4);
		listaAnimais.add(animal5);
	}

}
