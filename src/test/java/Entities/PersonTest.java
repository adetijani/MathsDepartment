package Entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        Person person = new Person("ade","ade@gmail.com","lagos","88888");
        assertEquals("ade", person.getName());
    }

    @Test
    void setName() {
        Person person = new Person("ade","ade@gmail.com","lagos","88888");
        person.setName("ade");
        assertEquals("ade", person.getName());
    }

    @Test
    void getEmail() {
        Person person = new Person("ade","ade@gmail.com","lagos","88888");
        assertEquals("ade@gmail.com", person.getEmail());
    }

    @Test
    void setEmail() {
        Person person = new Person("ade","ade@gmail.com","lagos","88888");
        person.setEmail("dudu");
        assertEquals("dudu",person.getEmail());
    }

    @Test
    void getAddress() {
        Person person = new Person("ade","ade@gmail.com","lagos","88888");
        assertEquals("lagos", person.getAddress());
    }

    @Test
    void setAddress() {
        Person person = new Person("ade","ade@gmail.com","lagos","88888");
        person.setAddress("abuja");
        assertEquals("abuja", person.getAddress());
    }

    @Test
    void getPhoneNumber() {
        Person person = new Person("ade","ade@gmail.com","lagos","88888");
        person.setPhoneNumber("88888");
        assertEquals("88888", person.getPhoneNumber());
    }

    @Test
    void setPhoneNumber() {
        Person person = new Person("ade","ade@gmail.com","lagos","88888");
        person.setPhoneNumber("99999");
        assertEquals("99999",person.getPhoneNumber());
    }

//    @Test
//    void testToString() {
//        Person person = new Person("ade","ade@gmail.com","lagos","88888");
//
//    }
}