package com.microservice.student.controller;

import com.microservice.student.entities.Student;
import com.microservice.student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/save")
    public ResponseEntity<?> saveStudent(@RequestBody Student student){
        studentService.save(student);
        return ResponseEntity.ok("Estudiante Creado");
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(studentService.findAll());
    }

    @GetMapping("/findId/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        Optional<Student> student = studentService.findById(id);
        return ResponseEntity.ok(student);
    }


    @GetMapping("search-by-course/{courseId}")
    public ResponseEntity<?> findByIdCourse(@PathVariable Long courseId){
        return ResponseEntity.ok(studentService.findByIdCourse(courseId));
    }


}
