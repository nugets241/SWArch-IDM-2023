package fi.tamk.sade23.idm;

public class Student extends Identity {
    private String studentSpecificAttribute;

    public Student(String firstName, String lastName, String userType, String institution, String contractEndDate, String personalEmail, String studentSpecificAttribute) {
        super(firstName, lastName, userType, institution, contractEndDate, personalEmail);
        this.studentSpecificAttribute = studentSpecificAttribute;
    }

    public String getStudentSpecificAttribute() {
        return studentSpecificAttribute;
    }

    public void setStudentSpecificAttribute(String studentSpecificAttribute) {
        this.studentSpecificAttribute = studentSpecificAttribute;
    }
}
