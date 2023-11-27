package fi.tamk.sade23.idm;

public class StudentAttributeStrategy implements IdentityAttributeStrategy {
    @Override
    public void setAttributes(Identity identity) {
        identity.setUserType("Student");
        identity.setFirstName("StudentFirstName");
        identity.setLastName("StudentLastName");
        identity.setInstitution("StudentInstitution");
        identity.setContractEndDate("StudentContractEndDate");
        identity.setPersonalEmail("StudentPersonalEmail");
    }
}
