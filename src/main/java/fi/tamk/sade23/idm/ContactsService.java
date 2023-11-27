package fi.tamk.sade23.idm;

import java.util.HashMap;

public class ContactsService {
    private HashMap<Integer, Contact> contacts = new HashMap<>();
    static private Integer idCounter = 1;

    public Contact createContact(String firstName, String lastName, String email, String phoneNumber) {
        Contact contact = new Contact(firstName, lastName, email, phoneNumber);
        contacts.put(idCounter, contact);

        idCounter++;
        return contact;
    }

    public Contact getContact(Integer id) {
        return contacts.get(id);
    }

    public void modifyContact(Integer id, String firstName, String lastName, String email, String phoneNumber) {
        Contact contact = contacts.get(id);
        if (contact != null) {
            contact.setFirstName(firstName);
            contact.setLastName(lastName);
            contact.setPersonalEmail(email);
            contact.setPhoneNumber(phoneNumber);
        }
    }
}