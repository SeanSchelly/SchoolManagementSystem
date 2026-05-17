package SchoolMembersPackage;
import java.util.Scanner;
public class Students extends Member {
    char previousLetterGrade;
    boolean entryExamPassed = true;

    public Students(String name, int age, int id, String gender, char previousLetterGrade, boolean entryExamPassed) {
        super(name, age, id, gender, "student");
        this.entryExamPassed = entryExamPassed;
        this.previousLetterGrade = previousLetterGrade;
    }

    public void displayInfo() {
        System.out.println("This "+ role +" is ".concat(name).concat(" with id: ")+id+" and has passed last year's batch with grade: "+previousLetterGrade);
    }
    public void applicantDetect() {
        System.out.println("Student Applicant detected: "+name);
    }
    public void paymentCheck() {
        Scanner payment = new Scanner(System.in);
        System.out.println("Has student completed outstanding payment? enter bool value(true/false)");
        boolean payment_Check = payment.nextBoolean();

            if (payment_Check) {
                System.out.println("Student will be added to batch list");
            } else {
                System.out.println("Student has outstanding payment, can not add to batch list until finalized.");
            }
        }
    }


