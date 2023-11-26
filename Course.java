package University;

import java.util.*;

public class Course {
    private String courseId;
    private String courseTitle;
    private double credit;
    private Student[] studentList;
    private int numberOfStudent;
    private Faculty faculty;

    public Course() {

    }

    public Course(String courseId, String courseTitle, double credit) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.credit = credit;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public Student[] getStudentList() {
        return studentList;
    }

    public void setStudentList(Student[] studentList) {
        this.studentList = studentList;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Course [courseId=" + courseId + ", courseTitle=" + courseTitle + ", credit=" + credit + ", studentList="
                + studentList.toString(studentList) + ", numberOfStudent=" + numberOfStudent + ", faculty=" + faculty
                + "]";
    }

    public void addStudent(Student student) {
        studentList[numberOfStudent] = student;
        numberOfStudent++;
    }

    public void dropStudent(Student student) {
        for (int i = 0; i < numberOfStudent; i++) {
            if (studentList[i].getStudentId() == student.getStudentId()) {
                studentList[i] = null;
                numberOfStudent--;
            }
        }
    }

    public void addFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void dropFaculty(Faculty faculty) {
        this.faculty = null;
    }

    public void printStudentList() {
        for (int i = 0; i < numberOfStudent; i++) {
            System.out.println(studentList[i]);
        }
    }
}
