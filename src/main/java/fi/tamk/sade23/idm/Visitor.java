package fi.tamk.sade23.idm;

public class Visitor extends SadeIdentity {
    public Visitor(String firstName, String lastName, String org) {
        super(firstName, lastName, org);
    }

    @Override
    public String getDisplayName() {
        // Return the display name in a different format for visitor members
        return "Visitor: " + super.getDisplayName();
    }
}
