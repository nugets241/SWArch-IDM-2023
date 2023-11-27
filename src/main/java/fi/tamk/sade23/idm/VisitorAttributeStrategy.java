package fi.tamk.sade23.idm;

public class VisitorAttributeStrategy implements IdentityAttributeStrategy {
    @Override
    public void setAttributes(Identity identity) {
        identity.setUserType("Visitor");
        identity.setFirstName("VisitorFirstName");
        identity.setLastName("VisitorLastName");
        identity.setInstitution("VisitorInstitution");
        identity.setContractEndDate("VisitorContractEndDate");
        identity.setPersonalEmail("VisitorPersonalEmail");
    }
}
