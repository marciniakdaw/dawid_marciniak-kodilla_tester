package StructureCode;

public class ComparePerson {

    public static void main(String[] args) {

        Person firstPerson = new Person("Adam", 40.5, 178);
        Person secondPerson = new Person("Ewa", 38.5, 159);

        System.out.println(firstPerson);
        System.out.println(secondPerson);

        System.out.println(firstPerson.checkPerson());
        System.out.println(secondPerson.checkPerson());
    }
}
