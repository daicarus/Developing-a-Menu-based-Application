package University;

public class Student {
    private int studentId;
    private String name;
    private double CGPA;

    public Student() {
    }

    public Student(int studentId, String name, double CGPA) {
        this.studentId = studentId;
        this.name = name;
        this.CGPA = CGPA;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", name=" + name + ", CGPA=" + CGPA + "]";
    }

}
