package Entities;

public class Person {
    private String Name;
    private String Email;
    private String Address;
    private String PhoneNumber;

    public Person(){}

    public Person(String name, String email, String address, String phoneNumber) {
        Name = name;
        Email = email;
        Address = address;
        PhoneNumber = phoneNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + getName() + '\'' +
                ", Email='" + getEmail() + '\'' +
                ", Address='" + getAddress() + '\'' +
                ", PhoneNumber='" + getPhoneNumber() + '\'' +
                '}';
    }
}
