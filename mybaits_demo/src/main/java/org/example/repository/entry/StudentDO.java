package org.example.repository.entry;




public class StudentDO {

    private int id;
    private String name;
    private String gender;
    private int grade;
    private String dept;

    public String getDept() {
        return dept;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getGrade() {
        return grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
