package org.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "myStudents")
public class Student {
    @Id
    private Integer studentId;
    private String studentName;
    private String studentCity;

    public Student(Integer studentId, String studentName, String studentCity) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCity = studentCity;
    }

    public Student() {
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentCity='" + studentCity + '\'' +
                '}';
    }
}
