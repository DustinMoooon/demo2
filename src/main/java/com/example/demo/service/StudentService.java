package com.example.demo.service;

import com.example.demo.DAO.StudentRepo;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo){
        this.studentRepo=studentRepo;
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepo.findById(id);
    }

    public Student createOrUpdateStudent(Student student) {
        return studentRepo.save(student);
    }

    public void deleteStudentById(Long id) {
        studentRepo.deleteById(id);
    }


}
