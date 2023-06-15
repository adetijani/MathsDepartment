package Entities;

import java.util.ArrayList;

public class School {

    ArrayList<Students> StudentList = new ArrayList<>();

    public School(ArrayList<Students> studentList) {
        StudentList = studentList;
    }



    public ArrayList<Students> getStudentList() {
        return StudentList;
    }

    public void setApplicant(){

    }

    public void setStudentList(ArrayList<Students> studentList) {
        StudentList = studentList;
    }

}
