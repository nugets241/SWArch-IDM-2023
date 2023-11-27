package fi.tamk.sade23.idm;

public class StaffAttributeStrategy implements IdentityAttributeStrategy {
    @Override
    public void setAttributes(Identity identity) {
        identity.setUserType("Staff");
        identity.setFirstName("StaffFirstName");
        identity.setLastName("StaffLastName");
        identity.setInstitution("StaffInstitution");
        identity.setContractEndDate("StaffContractEndDate");
        identity.setPersonalEmail("StaffPersonalEmail");
    }
}
