package org.example.service;

import org.example.repository.mapper.StudentMapper;
import org.example.repository.entry.StudentDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public List<StudentDO> getAllStudents() {
        return studentMapper.getAllStudents();
    }

    public StudentDO getStudentById(int id) {
        return studentMapper.getStudentById(id);
    }

    public void addStudent(StudentDO student) {
        studentMapper.insertStudent(student);
    }

    public void updateStudent(StudentDO student) {
        studentMapper.updateStudent(student);
    }

    public void deleteStudent(int id) {
        studentMapper.deleteStudent(id);
    }
}
