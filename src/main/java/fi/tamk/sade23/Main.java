package fi.tamk.sade23;

import fi.tamk.sade23.idm.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        IdmService idmService = new IdmService();
        SadeIdentity identity1 = idmService.createIdentity("Bob", "Marley","Reggae");
        System.out.println("First: " + identity1.getDisplayName());

        // Create instances of Staff, Student, and Visitor
        SadeIdentity staffIdentity = new Staff("Bob", "Marley", "Reggae");
        SadeIdentity studentIdentity = new Student("Alice", "Cooper", "Rock");
        SadeIdentity visitorIdentity = new Visitor("Elvis", "Presley", "RocknRoll");

        System.out.println(staffIdentity.getDisplayName());
        System.out.println(studentIdentity.getDisplayName());
        System.out.println(visitorIdentity.getDisplayName());
    }
}