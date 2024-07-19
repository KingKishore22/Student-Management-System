package com.kishoreb.Student.Management.System.service;

import java.util.List;
import java.util.Optional;

import com.kishoreb.Student.Management.System.entity.Student_database;

public interface Student_Datas {
public List<Student_database>getAllStudents();
public Student_database saveData(Student_database sb);
public void deleteStudent(int id);
public Student_database getStudentDatas(int id);
public Student_database updateStudentDatas(Student_database db, int id);

}
