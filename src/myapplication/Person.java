package myapplication;

public class Person {
    // private access modifier is the base for encapsulation
    // why? because then the data stored when creating an object can't be altered
    private String name;
    private String surname;
    private int age;
    // the variables here: name, surname, age are what we call attributes of an object created from a class

    // a constructor is used to create objects or instances of a class
    // the following constructor would create a instance of a person
    public Person (String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age= age;
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

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
