package Services;

import Entities.*;
import Enums.Roles;
import Services.Implementation.PrincipalService;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        PrincipalService principalService = new PrincipalService();
        Applicant applicant = new Applicant("Debo","debo@gmail.com","lagos","66666",25);
        Students student = new Students();
        principalService.admitStudent(applicant);

        principalService.expelStudent(student);

        //    Staff Teacher = new Staff("Ade","ade@gmail.com","Burma Road","99999","Maths","Employed", Roles.Teacher);
//   Staff Principal = new Staff("Ayo","Ayo@gmail.com","Brick Road","88888","Admin","Employed", Roles.Principal);
//    Staff Driver = new Staff("Ola","ola@gmail.com","Kan Road","77777","Services","Interviewed",  Roles.NonAcademicStaff);
//
//        ArrayList<Applicant> applicantList = new ArrayList<>();
//    Applicant applicant = new Applicant("Debo","debo@gmail.com","lagos","66666",25,5);
//    Principal principal = new Principal("Bode","bode@gmail.com","Abuja", "5555",new ArrayList);
//    Teacher teacher = new Teacher("Ode","ode@gmail.com","kwara","44444","Physics", "Employed",Roles.Teacher);
//    Courses courses = new Courses("Maths",2);
//    School school = new School( new ArrayList, principal, Teacher);

    }
}





    //Implementation


