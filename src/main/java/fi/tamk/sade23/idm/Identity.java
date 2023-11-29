package fi.tamk.sade23.idm;

public abstract class Identity implements IdentityObserver {
    protected String firstName;
    protected String lastName;
    protected String userType;
    protected String institution;
    protected String contractEndDate;
    protected String personalEmail;

    public Identity(String firstName, String lastName, String userType, String institution, String contractEndDate, String personalEmail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userType = userType;
        this.institution = institution;
        this.contractEndDate = contractEndDate;
        this.personalEmail = personalEmail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(String contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    private IdentityAttributeStrategy strategy;

    public void setStrategy(IdentityAttributeStrategy strategy) {
        this.strategy = strategy;
    }

    public void applyStrategy(String password) {
        strategy.setAttributes(this, password);
    }

    @Override
    public void update(Identity identity) {
        System.out.println("Observer notified. New first name: " + this.firstName);
    }
}
