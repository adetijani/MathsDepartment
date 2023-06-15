package Entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoursesTest {

    @org.junit.jupiter.api.Test
    void getName() {
        Courses courses = new Courses("Maths",12);
        assertEquals("Maths",courses.getName());
    }


    @org.junit.jupiter.api.Test
    void setName() {
        Courses courses = new Courses("Maths",12);
        courses.setName("English");
        assertEquals("English", courses.getName());
    }

    @org.junit.jupiter.api.Test
    void getUnits() {
        Courses courses = new Courses("Maths",12);
        assertEquals(12,courses.getUnits());

    }

    @org.junit.jupiter.api.Test
    void setUnits() {
        Courses courses = new Courses("Maths",12);
        courses.setUnits(11);
        assertEquals(11,courses.getUnits());
    }

    @Test
    void testGetName() {
        Courses courses = new Courses("English",12);
        assertEquals("English",courses.getName());
    }

    @Test
    void testSetName() {
        Courses courses = new Courses("Maths",12);
        courses.setName("English");
        assertEquals("English",courses.getName());
    }

    @Test
    void testGetUnits() {
        Courses courses = new Courses("Maths",12);
        assertEquals(12,courses.getUnits());
    }

    @Test
    void testSetUnits() {
        Courses courses = new Courses("Maths",12);
        courses.setUnits(11);
        assertEquals(11,courses.getUnits());
    }
}