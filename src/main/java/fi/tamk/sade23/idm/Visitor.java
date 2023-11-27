package fi.tamk.sade23.idm;

public class Visitor extends Identity {
    private String visitorSpecificAttribute;

    public Visitor(String firstName, String lastName, String userType, String institution, String contractEndDate, String personalEmail, String visitorSpecificAttribute) {
        super(firstName, lastName, userType, institution, contractEndDate, personalEmail);
        this.visitorSpecificAttribute = visitorSpecificAttribute;
    }

    public String getVisitorSpecificAttribute() {
        return visitorSpecificAttribute;
    }

    public void setVisitorSpecificAttribute(String visitorSpecificAttribute) {
        this.visitorSpecificAttribute = visitorSpecificAttribute;
    }
}
