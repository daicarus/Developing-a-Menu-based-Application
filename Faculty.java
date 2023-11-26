package University;

public class Faculty {
    private int facultyId;
    private String facultyName;
    private String facultyposition;

    public faculty (int facultyId, String facultyName, String facultyPosition){
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.facultyposition = facultyPosition;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyposition() {
        return facultyposition;
    }

    public void setFacultyposition(String facultyposition) {
        this.facultyposition = facultyposition;
    }

    @Override
    public String toString() {
        return "Faculty [facultyId=" + facultyId + ", facultyName=" + facultyName + ", facultyposition="
                + facultyposition + "]";
    }

}
