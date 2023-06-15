package Entities;

import Enums.Roles;

import javax.management.relation.Role;
import java.util.ArrayList;

public class Staff extends Person{
    private String Department;
    private String EmploymentStatus;
    private Roles role;

    public String Roles;

    public Staff(String name, String email, String address, String phoneNumber, String department, String employmentStatus, Roles role) {
        super(name, email, address, phoneNumber);
        Department = department;
        EmploymentStatus = employmentStatus;
        this.role = role;
    }

    public String getDepartment() {
        return
                Department;
    }

    public void setDepartment(String department) {

        Department = department;
    }

    public String getEmploymentStatus() {
        return
                EmploymentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {

        EmploymentStatus = employmentStatus;
    }

    public Roles getRole()
    {
        return role;
    }

    public void setRole(Roles role) {

        this.role = role;
    }

}
