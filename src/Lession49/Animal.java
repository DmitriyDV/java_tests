package Lession49;

public enum Animal {
    DOG("собака"), CAT("кошка"), FROG("лягушка");

    public String getTranslation() {
        return translation;
    }

    private String translation;

    Animal(String translation) {
        this.translation = translation;
    }
    public String toString(){
        return "Перевод на русский язык - "+translation;
    }
}
