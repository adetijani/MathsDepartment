package Entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentsTest {

    @Test
    void getAge() {
        Students students = new Students("Debo","debo@gmail.com","lagos","66666",25, 3.0);
        assertEquals(25,students.getAge());
    }

    @Test
    void setAge() {
        Students students = new Students("Debo","debo@gmail.com","lagos","66666",25,3.0);
        students.setAge(14);
        assertEquals(14,students.getAge());
    }

    @Test
    void getBehaviouralRatings() {
        Students students = new Students("Debo","debo@gmail.com","lagos","66666",25,3.0);
        assertEquals(3.0, students.getBehaviouralRatings());

    }

    @Test
    void setBehaviouralRatings() {
        Students students = new Students("Debo","debo@gmail.com","lagos","66666",25,3.0);
        students.setBehaviouralRatings(3.0,"bola");
        assertEquals(3.0, students.getBehaviouralRatings());
    }

}