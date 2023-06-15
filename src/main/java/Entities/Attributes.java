package Entities;

import Enums.Roles;

public class Attributes extends Staff{
    public static void main(String[] args){

    }
    public Attributes(String name, String email, String address, String phoneNumber, String department, String employmentStatus, Roles role) {
        super(name, email, address, phoneNumber, department, employmentStatus);
    }
}
