package Lession36;
//class Animal {
//    public void eat(){
//        System.out.println("Animal am eating");
//    }
//}

//class OtherAnimal extends Animal{
//    public void eat() {
//        System.out.println("Other animal is eating");
//    }
//}

interface AbleToEat {
    public void eat();
}

//class Animal implements AbleToEat{
//    @Override
//    public void eat() {
//        System.out.println("jdsdnks");
//    }
//}
public class Test {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.eat();
//
////        OtherAnimal otherAnimal = new OtherAnimal();
////        otherAnimal.eat();
//
//        Animal animal2 = new Animal(){
//            public void eat(){
//                System.out.println("Other animal is eating");
//            }
//        };
//        //animal2.eat();
//        AbleToEat ableToEat = new Animal();
//        ableToEat.eat();
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating");
            }
        };
        ableToEat.eat();
    }
}
