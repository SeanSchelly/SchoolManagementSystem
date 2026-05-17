package SchoolMembersPackage;
import java.util.Scanner;
public class Teachers extends Member{
    String subjectDepartment;
    private double baseSalary = 1700.20;
    int defaultLeaveDays;
    boolean getInsuranceBenefits;
    String interviewStatus;

    //getter and setter methods
    //Makes the teacher's salary read-only
    public double getBaseSalary() {
        return baseSalary;
    }
    //Makes the teacher's salary write-only
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public Teachers(String name, int age, int id, String gender, String subjectDepartment, boolean getInsuranceBenefits, String interviewStatus) {
        super(name, age, id, gender, "teacher");
        this.subjectDepartment = subjectDepartment;
        this.getInsuranceBenefits = getInsuranceBenefits;
        this.interviewStatus = interviewStatus;
        this.defaultLeaveDays = 3;
    }

    public void insuranceCheck() {
        if (getInsuranceBenefits) {
            System.out.println("Teacher has insurance benefit provided by school.");
        } else {
            System.out.println("Teacher has no insurance contract with school");
        }

    }
    public void setLeaveDays() {
        Scanner obtainLeaveDays = new Scanner(System.in);
        System.out.println("Enter length of semester in days:");
        int leave_Days = obtainLeaveDays.nextInt();
        System.out.println("This "+role+" will have "+((leave_Days+defaultLeaveDays)/2)+" leave days");
    }

    public void displayInfo() {
        System.out.println("This ".concat(role).concat(" is a ")+subjectDepartment);
    }

    public void applicantDetect() {
        System.out.println("New teacher Applicant detected: "+name);
    }

}

