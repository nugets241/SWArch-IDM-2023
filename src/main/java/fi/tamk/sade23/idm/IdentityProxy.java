package fi.tamk.sade23.idm;

public class IdentityProxy implements IdentityAttributeStrategy {
    private IdentityAttributeStrategy realIdentity;
    private String password;

    public IdentityProxy(IdentityAttributeStrategy realIdentity, String password) {
        this.realIdentity = realIdentity;
        this.password = password;
    }

    private boolean authenticate(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public void setAttributes(Identity identity, String password) {
        if (authenticate(password)) {
            realIdentity.setAttributes(identity, password);
            System.out.println("Password: " + password);
        } else {
            System.out.println("Authentication failed. Access denied.");
        }
    }
}