package Entities;

import Enums.Roles;

public class Students  extends Person {

    private int age;
    private double behaviouralRatings;


    public Students(){}
    public Students(String name, String email, String address, String phoneNumber, int age, double behaviouralRatings) {
        super(name, email, address, phoneNumber);
        this.age = age;
        this.behaviouralRatings = behaviouralRatings;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getBehaviouralRatings() {
        return behaviouralRatings;
    }

    public void setBehaviouralRatings(double ratings, String staffName) {
        if (staffName == String.valueOf(Roles.Principal))
            behaviouralRatings = ratings;
    }
}
