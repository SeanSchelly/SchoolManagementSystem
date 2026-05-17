import SchoolMembersPackage.Students;
import SchoolMembersPackage.Teachers;

import java.util.Scanner;

public class MainApp {
    public static void main(String[]args) {
        Students student1 = new Students("Berhanu", 17, 77, "Male", 'A', true);
        student1.applicantDetect();
        student1.displayInfo();
        student1.paymentCheck();
        //
        Students student2 = new Students("kebede", 10, 20, "Male", 'A', true);
        student2.applicantDetect();
        student2.displayInfo();
        student2.paymentCheck();
        //
        Teachers teacher1 = new Teachers("Abebe", 25, 22, "male", "Math", true,  "Passed");
        teacher1.applicantDetect();
        teacher1.displayInfo();
        teacher1.insuranceCheck();
        teacher1.setLeaveDays();
        //
            Scanner salObtain = new Scanner(System.in);
            System.out.println("which teacher's salary would you like to obtain and update? Enter int value:");
            int responseSalObtain = salObtain.nextInt();
            switch (responseSalObtain){
                case 1:
                System.out.println(teacher1.getBaseSalary());
                Scanner salChange = new Scanner(System.in);
                System.out.println("Enter updated value:");
                double responseSalChange = salChange.nextDouble();
                teacher1.setBaseSalary(responseSalChange);
                System.out.println("New salary is: "+ teacher1.getBaseSalary());
                break;

                default:
                    System.out.println("Invalid teacher number");
            }
        //
    }
}