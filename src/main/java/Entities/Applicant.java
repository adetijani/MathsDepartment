package Entities;

public class Applicant extends Person{
    private int age;

    public Applicant(String name, String email, String address, String phoneNumber, int age) {
        super(name, email, address, phoneNumber);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSubmittedApplication() {

    }

    public void setAge(int age) {
        age = age;
    }
}
