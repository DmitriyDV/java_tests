public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Какое то имя");
        person1.setAge(33);
        person1.speak();

    }
}

class Person{
    private String name;
    private int age;

    public void setName(String name) {
        if (name.isEmpty()){
            System.out.println("You input empty name");
        } else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age<0){
            System.out.println(" You not input age");
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void setNameandAge(String username, int userage){
        name=username;
        age=userage;
    }

    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
    }

    void speak(){
        for (int i=0;i<3;i++) {
            System.out.println("Меня зовут " + name + ", мне " + age + " лет");
        }
    }
    void sayHello(){
        System.out.println("Hello");
    }
}
