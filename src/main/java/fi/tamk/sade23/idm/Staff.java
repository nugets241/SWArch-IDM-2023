package fi.tamk.sade23.idm;

public class Staff extends Identity {
    private String staffSpecificAttribute;

    public Staff(String firstName, String lastName, String userType, String institution, String contractEndDate, String personalEmail, String staffSpecificAttribute) {
        super(firstName, lastName, userType, institution, contractEndDate, personalEmail);
        this.staffSpecificAttribute = staffSpecificAttribute;
    }

    public String getStaffSpecificAttribute() {
        return staffSpecificAttribute;
    }

    public void setStaffSpecificAttribute(String staffSpecificAttribute) {
        this.staffSpecificAttribute = staffSpecificAttribute;
    }
}