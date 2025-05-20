package Polimorfizm;

public class Test {
    public static void main(String[] args) {
//        Animal animal1 = new Animal();
//        Dog dog1 = new Dog();
//        animal1.eat();
//        dog1.eat();
//        Animal animal1 = new Dog();
//        Dog dog = new Dog();
//        Animal animal1 = new Dog();
//        animal1.eat();
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal);
        test(dog);
        test(cat);

    }

    public static void test(Animal animal){
        animal.eat();
    }
}
