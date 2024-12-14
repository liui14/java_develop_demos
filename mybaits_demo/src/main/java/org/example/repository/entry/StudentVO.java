package org.example.repository.entry;

public class StudentVO {

    private int id;
    private String name;
    private String gender;
    private int grade;
    private String dept;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "StudentVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", grade=" + grade +
                ", dept='" + dept + '\'' +
                '}';
    }


}
