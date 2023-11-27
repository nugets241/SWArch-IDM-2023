package fi.tamk.sade23;

import fi.tamk.sade23.idm.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Staff staff = new Staff("Bob", "Marley", "Staff", "Reggae University", "2023-12-31", "bob.marley@example.com", "Professor");
        staff.setStrategy(new StaffAttributeStrategy());
        staff.applyStrategy();
        System.out.println("Staff: " + staff.getFirstName() + " " + staff.getLastName() + ", " + staff.getStaffSpecificAttribute());

        Student student = new Student("Alice", "Cooper", "Student", "Rock University", "2023-06-30", "alice.cooper@example.com", "Undergraduate");
        student.setStrategy(new StudentAttributeStrategy());
        student.applyStrategy();
        System.out.println("Student: " + student.getFirstName() + " " + student.getLastName() + ", " + student.getStudentSpecificAttribute());

        Visitor visitor = new Visitor("Jimmy", "Page", "Visitor", "Blues College", "2023-03-31", "jimmy.page@example.com", "Guest Lecturer");
        visitor.setStrategy(new VisitorAttributeStrategy());
        visitor.applyStrategy();
        System.out.println("Visitor: " + visitor.getFirstName() + " " + visitor.getLastName() + ", " + visitor.getVisitorSpecificAttribute());
    }
}
