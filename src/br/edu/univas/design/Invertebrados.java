package br.edu.univas.design;

import br.edu.univas.vo.Formiga;
import br.edu.univas.vo.BeeHappy;

public class Invertebrados implements AbstractFactory{

    @Override
    public Comida getAnimal(Animal animal) {
        if(animal.equals(Animal.BEE)){
            return new BeeHappy();
        } else if (animal.equals(Animal.ANT)){
            return new Formiga();
        }
        return null;
    }
}
