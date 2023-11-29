package fi.tamk.sade23.idm;

public class StudentAttributeStrategy implements IdentityAttributeStrategy {
    private String userType;
    private String firstName;
    private String lastName;
    private String institution;
    private String contractEndDate;
    private String personalEmail;

    public StudentAttributeStrategy(String userType, String firstName, String lastName, String institution, String contractEndDate, String personalEmail) {
        this.userType = userType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.institution = institution;
        this.contractEndDate = contractEndDate;
        this.personalEmail = personalEmail;
    }

    @Override
    public void setAttributes(Identity identity, String password) {
        identity.setUserType(userType);
        identity.setFirstName(firstName);
        identity.setLastName(lastName);
        identity.setInstitution(institution);
        identity.setContractEndDate(contractEndDate);
        identity.setPersonalEmail(personalEmail);
    }
}