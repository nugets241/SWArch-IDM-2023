package fi.tamk.sade23;

import fi.tamk.sade23.idm.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Create an IdentityData object to manage and notify observers
        IdentityData identityData = new IdentityData();

        // Create a ContactService object
        ContactsService contactsService = new ContactsService();

        // Create a Staff object and a corresponding IdentityProxy
        Staff staff = new Staff("Bob", "Marley", "Staff", "Reggae University", "2023-12-31", "bob.marley@example.com", "Professor");
        IdentityProxy staffProxy = new IdentityProxy(new StaffAttributeStrategy("Staff", "Charles", "Downey", "Reggae University", "2023-12-31", "bob.marley@example.com"), "password123");

        // Use the proxy to set the attributes of the Staff object
        staffProxy.setAttributes(staff, "password123");

        // Register the Staff object with the IdentityData object
        identityData.registerObserver(staff);

        // Create a Contact object for the Staff object
        Contact bob = contactsService.createContact(staff.getFirstName(), staff.getLastName(), staff.getPersonalEmail(), "+123456789");

        // Set and apply the strategy for the Contact object
        bob.setStrategy(new IDMAdapter(staff));
        bob.applyStrategy();

        // Print the contact information
        System.out.println("Contact: " + bob.getFirstName() + " " + bob.getLastName() + ", " + bob.getEmail());

        System.out.println("Staff: " + staff.getFirstName() + " " + staff.getLastName());

        // Change an attribute of the Staff object and notify observers
        staff.setFirstName("Robert");
        identityData.setIdentity(staff);

        System.out.println("Staff: " + staff.getFirstName() + " " + staff.getLastName());
    }
}
