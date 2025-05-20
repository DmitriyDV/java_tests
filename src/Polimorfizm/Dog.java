package Polimorfizm;

public class Dog extends Animal{
    @Override
    public void eat() {
        //super.eat();
        System.out.println("Dog is eating");
    }

    public void bark(){
        System.out.println("Dor is barking");
    }
}
