package fi.tamk.sade23.idm;

public class Student extends SadeIdentity {
    public Student(String firstName, String lastName, String org) {
        super(firstName, lastName, org);
    }

    @Override
    public String getDisplayName() {
        // Return the display name in a different format for student members
        return "Student: " + super.getDisplayName();
    }
}
