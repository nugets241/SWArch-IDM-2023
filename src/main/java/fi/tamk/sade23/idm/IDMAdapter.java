package fi.tamk.sade23.idm;

public class IDMAdapter implements ContactAttributeStrategy {
    private Identity identity;

    public IDMAdapter(Identity identity) {
        this.identity = identity;
    }

    @Override
    public void setAttributes(Contact contact) {
        contact.setFirstName(identity.getFirstName());
        contact.setLastName(identity.getLastName());
        contact.setPersonalEmail(identity.getPersonalEmail());
    }
}
