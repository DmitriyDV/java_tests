package Lession48;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 3160294443839886427L;
    private int id;
    private String userName;
    private int age;
    private byte type;

    public Person(int id, String name) {
        this.id = id;
        this.userName = name;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String toString(){
        return id+" : "+ userName;
    }
}
