package fi.tamk.sade23.idm;

public class Staff extends SadeIdentity {
    public Staff(String firstName, String lastName, String org) {
        super(firstName, lastName, org);
    }

    @Override
    public String getDisplayName() {
        // Return the display name in a different format for staff members
        return "Staff: " + super.getDisplayName();
    }
}

