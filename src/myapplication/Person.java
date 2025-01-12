package myapplication;

public class Person {
    // private access modifier is the base for encapsulation
    // why? because then the data stored when creating an object can't be altered
    private String name;
    private String surname;
    private int age;
    private String favColor;
    // the variables here: name, surname, age, favColor are what we call attributes of an object created from a class

    // a constructor is used to create objects or instances of a class
    // the following constructor would create a instance of a person
    public Person (String name, String surname, int age, String favColor) {
        this.name = name;
        this.surname = surname;
        this.age= age;
        this.favColor = favColor;
    }

    // there can be more than one constructor for different situations
    public Person (String name) {
        this.name = name;
    }

    // the following method is what we call a behaviour of an object
    /* so when we ask this "Person" for his name using the following
    behaviour, it would be called to reply the name back */
    public void displayName() {
        System.out.println(name);
    }

    /* getters and setters are used as part of encapsulation
     if needed to alter data of an object, but in a secure manner*/
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getFavColor() {
        return favColor;
    }
}
