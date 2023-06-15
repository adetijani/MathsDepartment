package Services.Implementation;

import Entities.Applicant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalServiceTest {

    @Test
    void admitStudent() {
        PrincipalService p1 = new PrincipalService();
        Applicant applicant = new Applicant("Debo","debo@gmail.com","lagos","66666",25);
        assertEquals(0, p1.admitStudent(applicant));
    }

//    @Test
//    void expelStudent() {
//    }
}