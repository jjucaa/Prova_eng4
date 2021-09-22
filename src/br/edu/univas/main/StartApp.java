package br.edu.univas.main;
import java.util.Scanner;

import br.edu.univas.design.AbstractFactory;
import br.edu.univas.design.Comida;
import br.edu.univas.design.Animal;
import br.edu.univas.design.Provider;
import br.edu.univas.design.Tipo;

public class StartApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("***ANIMAIS***");
		System.out.println("1 - Vertebrados");
		System.out.println("2 - Invertebrados");
		System.out.println("Digite sua opção:");
		
		int option = scanner.nextInt();
		
		if (option == 1) {
			AbstractFactory factory = Provider.getAnimalType(Tipo.VERTEBRADO);
			Comida elephant = factory.getAnimal(Animal.ELEPHANT);
			elephant.eat();

			Comida shark = factory.getAnimal(Animal.SHARK);
			shark.eat();

		} else if (option == 2) {
			AbstractFactory factory = Provider.getAnimalType(Tipo.INVERTEBRADO);
			Comida ant = factory.getAnimal(Animal.ANT);
			ant.eat();

			Comida bee = factory.getAnimal(Animal.BEE);
			bee.eat();
		}
		
		scanner.close();
	}
}
