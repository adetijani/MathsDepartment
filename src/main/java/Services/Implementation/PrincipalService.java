package Services.Implementation;

import Entities.Applicant;
import Entities.Students;
import Entities.School;
import Enums.Roles;


public class PrincipalService {
    public int admitStudent(Applicant applicant){
        if (applicant.getAge() >= 16) {
            System.out.println("You have been admitted!");
        }else System.out.println("Admission Denied!");
        return 0;
    }
    public int expelStudent(Students student){
        student.setBehaviouralRatings(1, "Principal");
        if (student.getBehaviouralRatings() == 1){
            System.out.println("Due to behavioural misconduct you have been expelled from school");
        }
        return 1;
    }

}
