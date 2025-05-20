public class Lession20 {
    public static void main(String[] args) {
        Human.description = "Nice";
        Human.getDescription();
        Human h1 = new Human("Bob",23);
        h1.description = "bad";

        System.out.println(h1);
    }
}
class Human{
    String name;
    int age;
    public static String description;

    public Human(String name, int age) {
        System.out.println("Привет из третьего конструктора");
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name+","+age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void speak(){
        System.out.println(name+","+age);
    }

    public static void getDescription(){
        System.out.println(description);
    }
}