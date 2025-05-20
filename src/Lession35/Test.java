package Lession35;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimal);
        test(listOfDogs);
    }
    private static void test(List<? extends Animal> list){ //extends - текущий класс(Animal) и его потомки, super - только родители класса
        for (Animal animal: list) {
            //System.out.println(animal);
            animal.eat();
        }
    }
}
