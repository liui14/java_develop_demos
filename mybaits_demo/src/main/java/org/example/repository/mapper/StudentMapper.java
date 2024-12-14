package org.example.repository.mapper;

import org.example.repository.entry.StudentDO;
import java.util.List;

public interface StudentMapper {

    // 查询所有学生
    List<StudentDO> getAllStudents();

    // 根据 ID 查询学生
    StudentDO getStudentById(int id);

    // 插入一个新学生
    void insertStudent(StudentDO student);

    // 更新学生信息
    void updateStudent(StudentDO student);

    // 删除学生
    void deleteStudent(int id);
}
