package br.edu.univas.design;

import br.edu.univas.vo.Elefante;
import br.edu.univas.vo.BabyShark;

public class Vertebrados implements AbstractFactory{

    @Override
    public Comida getAnimal(Animal animal) {
        if(animal.equals(Animal.ELEPHANT)){
            return new Elefante();
        } else if (animal.equals(Animal.SHARK)){
            return new BabyShark();
        }
        return null;
    }
}
