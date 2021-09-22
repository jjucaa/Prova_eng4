package br.edu.univas.design;

import static br.edu.univas.design.Tipo.INVERTEBRADO;
import static br.edu.univas.design.Tipo.VERTEBRADO;

public class Provider {
    public static AbstractFactory getAnimalType(Tipo animalType) {
        if (animalType.equals(INVERTEBRADO)) {
            return new Invertebrados();
        } else if (animalType.equals(VERTEBRADO)){
            return new Vertebrados();
        }
        return null;
    }
}
