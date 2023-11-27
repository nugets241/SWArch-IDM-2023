package fi.tamk.sade23;

import fi.tamk.sade23.idm.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ContactsService contactsService = new ContactsService();

        Contact bob = contactsService.createContact("Bob", "Marley", "bob.marley@example.com", "+123456789");
        System.out.println("Contact: " + bob.getFirstName() + " " + bob.getLastName() + ", " + bob.getEmail());

        Contact alice = contactsService.createContact("Alice", "Cooper", "alice.cooper@example.com", "+987654321");
        System.out.println("Contact: " + alice.getFirstName() + " " + alice.getLastName() + ", " + alice.getEmail());

        Contact jimmy = contactsService.createContact("Jimmy", "Page", "jimmy.page@example.com", "+123987456");
        System.out.println("Contact: " + jimmy.getFirstName() + " " + jimmy.getLastName() + ", " + jimmy.getEmail());
    }
}
