package com.demo.studentmanagement.service.impl;

import com.demo.studentmanagement.entity.Student;

import java.util.List;

public interface StudentService {

   public default List<Student> getAllStudent(){
       return null;
   }

   Student saveStudent(Student student);
}
