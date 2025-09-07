package Task3;

import java.io.*;

public class Enrollment implements Serializable {
    private String enrollmentDate;
    private Student student;
    private Course course;

    public Enrollment(Student student, Course course, String enrollmentDate){
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }
    public String getEnrollmentDate(){
        return enrollmentDate;
    }
    public Student getStudent(){
        return student;
    }
    public Course getCourse(){
        return course;
    }// Setters
    public void setStudent(Student student) {
        this.student = student;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    @Override
    public String toString() {
        return "Enrollment{student=" + student + ", course=" + course + ", enrollmentDate='" + enrollmentDate + "'}";
    }

}
