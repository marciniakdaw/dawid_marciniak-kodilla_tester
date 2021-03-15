package StructureCode;

public class Person {

    private String name;
    private double age;
    private int height;



    public Person (String name, double age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public boolean checkPerson() {

        if(name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User " + name + " is older than 30 and higher than 160cm");
            } else {
                System.out.println("User " + name + " is 30 (or younger) or 160cm (or shorter)");
            }
        }
        return true;
    }
}
