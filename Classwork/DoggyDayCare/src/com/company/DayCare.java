package com.company;
import javax.xml.namespace.QName;
import java.util.List;


public class DayCare {
    public static void addAnimal(Animal animal, List<Animal> animalList){
        animalList.add(animal);
    }

}
public static void displayAnimals(List<Animal> animals){
    for (Animal animal : animals){
        System.out.println(
                animal.name + "has" + animal.legs + "legs, and weight"+ animal.weight+
        );
    }
    public static void removeAnimal(List<Animal> animals, String name){
        animals.removeIf(animal -> animal.name.equals(name))
    }
    for (Animal animal : animals){
        if (animal.name.equals(name)){
            animal.remove(animal);
            return;
        }
    }
    for (int i = 0; 1 < animals.size(); i++){
        if (animals.get(i).name.equals(name)){
            animals.remove(i--);
        }
    }
}
}

