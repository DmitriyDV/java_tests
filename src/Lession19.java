public class Lession19 {
    public static void main(String[] args) {
        Human2 human1 = new Human2();
        human1.setAge(11);
        human1.setName("Tom");
        human1.speak();
    }
}
class Human2{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void speak(){
        System.out.println("I am "+getName()+", "+getAge());
    }
}