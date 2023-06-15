package Entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    @Test
    void getDepartment() {
        Staff staff = new Staff("bola","bola@gmail.com","abuja","88888","math","employed","");
        assertEquals("math",staff.getDepartment());
    }

//    @Test
//    void setDepartment() {
//    }
//
//    @Test
//    void getEmploymentStatus() {
//    }
//
//    @Test
//    void setEmploymentStatus() {
//    }
//
//    @Test
//    void getRole() {
//    }
//
//    @Test
//    void setRole() {
//    }
}