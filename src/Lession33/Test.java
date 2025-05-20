package Lession33;

public class Test {
    public static void main(String[] args) {
        //Upcasting - восходящее преобразование
        Animal animal = new Dog();
        //or
        Dog dog = new Dog();
        Animal animal1 = dog;

        //Downcasting - нисходящее преобразование
         Dog dog1 = (Dog) animal;

         Animal animal2 = new Animal();
         Dog dog2 = (Dog) animal2; // ошибка при преобразовании
    }
}
