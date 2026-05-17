package SchoolMembersPackage;

import java.util.Scanner;

abstract class Member {
    String role;
    String name;
    int age;
    int id;
    String gender;

    public Member(String name, int age, int id, String gender, String role) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.gender = gender;
        this.role = role;
    }

    abstract public void applicantDetect();
    abstract public void displayInfo();

}
