package Entities;

import Enums.Roles;

import javax.management.relation.Role;
import java.util.ArrayList;

public class Staff extends Person{
    private String Department;
    private String EmploymentStatus;


    public String Roles;

    public Staff(String name, String email, String address, String phoneNumber, String department, String employmentStatus) {
        super(name, email, address, phoneNumber);
        Department = department;
        EmploymentStatus = employmentStatus;
    }

    public String getDepartment() {
        return
                Department;
    }

    public String setDepartment(){
        return
                Department;
    }

    public String getEmploymentStatus() {
        return
                EmploymentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {

        EmploymentStatus = employmentStatus;
    }


}
