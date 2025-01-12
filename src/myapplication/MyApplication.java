package myapplication;

public class MyApplication {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Person p = new Person("Ben");
        p.displayName();
        p.setSurname("Hilfenhaus");
        p.setAge(34);
        p.setFavColor("Blue");

        p.displayName();
        System.out.println(p.getSurname());
        System.out.println(p.getAge());
        System.out.println(p.getFavColor());
    }
}
