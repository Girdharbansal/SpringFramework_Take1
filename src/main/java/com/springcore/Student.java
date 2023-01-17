package com.springcore;

public class Student {
    private int studentId;
    private String studentAddress;
    private String studentName;
//
//    public Student(int studentId, String studentAddress, String studentName) {
//        this.studentId = studentId;
//        this.studentAddress = studentAddress;
//        this.studentName = studentName;
//    }
//
//    public Student() {
//        super();
//    }
//
//    public int getStudentId() {
//        return studentId;
//    }
//
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
//
//    public String getStudentAddress() {
//        return studentAddress;
//    }
//
    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

//    public String getStudentName() {
//        return studentName;
//    }
//
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
