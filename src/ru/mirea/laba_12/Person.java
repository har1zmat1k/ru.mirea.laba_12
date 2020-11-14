package ru.mirea.laba_12;

public class Person {
    public  String firstName;
    public String lastName;
    public String patronymic;

    public Person(String firstName, String lastName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Person: " + firstName  + " " +
                (lastName != null && !lastName.trim().isEmpty()?lastName:"")  + " " +
                (patronymic != null && !patronymic.trim().isEmpty()?patronymic:"");
    }

    public static void main(String[] args) {
        Person personOne = new Person("PersonOneName", "PersonOneLastName", "PersonOnePatronymic");
        Person personTwo = new Person("PersonTwoName", "PersonTwoLastName");
        Person personThree = new Person("PersonThreeName");
        System.out.println(personOne);
        System.out.println(personTwo);
        System.out.println(personThree);
    }
}
