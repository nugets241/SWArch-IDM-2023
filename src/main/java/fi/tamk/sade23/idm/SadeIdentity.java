package fi.tamk.sade23.idm;

public class SadeIdentity {
    private String displayName;
    private Integer id;
    private String first;
    private String last;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        // TODO: Save the password not as plain text but A) encrypted or B) hashed <- recommended
        // TODO: find some Java library for hashing and save as hashed
        this.password = password; // BAD ... has to be changed
    }

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SadeIdentity(String firstName, String lastName, String org) {
        first = firstName;
        last = lastName;

        displayName = first + " " + last;
        if (! "".equals(org)) {
            displayName = displayName + " (" + org + ")";
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
