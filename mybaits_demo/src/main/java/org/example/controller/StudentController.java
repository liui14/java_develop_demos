package org.example.controller;

import org.example.repository.entry.StudentDO;
import org.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // 获取所有学生信息
    @GetMapping
    public ResponseEntity<List<StudentDO>> getAllStudents() {
        List<StudentDO> students = studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    // 获取特定学生信息
    @GetMapping("/{id}")
    public ResponseEntity<StudentDO> getStudentById(@PathVariable int id) {
        StudentDO student = studentService.getStudentById(id);
        if (student != null) {
            return new ResponseEntity<>(student, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // 新增学生信息
    @PostMapping
    public ResponseEntity<StudentDO> addStudent(@RequestBody StudentDO student) {
        studentService.addStudent(student);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    // 更新学生信息
    @PutMapping("/{id}")
    public ResponseEntity<StudentDO> updateStudent(@PathVariable int id, @RequestBody StudentDO student) {
        student.setId(id);  // 设置 ID 确保更新的是正确的学生
        studentService.updateStudent(student);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    // 删除学生信息
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
