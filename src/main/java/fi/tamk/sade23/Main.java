package fi.tamk.sade23;

import fi.tamk.sade23.idm.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ContactsService contactsService = new ContactsService();

        Staff staff = new Staff("Bob", "Marley", "Staff", "Reggae University", "2023-12-31", "bob.marley@example.com", "Professor");
        Contact bob = contactsService.createContact(staff.getFirstName(), staff.getLastName(), staff.getPersonalEmail(), "+123456789");
        bob.setStrategy(new IDMAdapter(staff));
        bob.applyStrategy();
        System.out.println("Contact: " + bob.getFirstName() + " " + bob.getLastName() + ", " + bob.getEmail());

        Student student = new Student("Alice", "Cooper", "Student", "Rock University", "2023-06-30", "alice.cooper@example.com", "Undergraduate");
        Contact alice = contactsService.createContact(student.getFirstName(), student.getLastName(), student.getPersonalEmail(), "+987654321");
        alice.setStrategy(new IDMAdapter(student));
        alice.applyStrategy();
        System.out.println("Contact: " + alice.getFirstName() + " " + alice.getLastName() + ", " + alice.getEmail());

        Visitor visitor = new Visitor("Jimmy", "Page", "Visitor", "Blues College", "2023-03-31", "jimmy.page@example.com", "Guest Lecturer");
        Contact jimmy = contactsService.createContact(visitor.getFirstName(), visitor.getLastName(), visitor.getPersonalEmail(), "+123987456");
        jimmy.setStrategy(new IDMAdapter(visitor));
        jimmy.applyStrategy();
        System.out.println("Contact: " + jimmy.getFirstName() + " " + jimmy.getLastName() + ", " + jimmy.getEmail());
    }
}
