package Interfaces;

public class Test {
    public static void main(String[] args) {
//         Animal animal1 = new Animal(1);
//         Person person1 = new Person("Bob");
//         animal1.sleep();
//         person1.sayHello();
//
//        animal1.showInfo();
//        person1.showInfo();

        Info info1 = new Animal(3);         //polimorfizm
        Info info2 = new Person("Tom");
//        info1.showInfo();
//        info2.showInfo();
        showInfo(info1);
        showInfo(info2);
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
        showInfo(animal1);
        showInfo(person1);
    }

    public static void showInfo(Info info){
        info.showInfo();
    }
}
