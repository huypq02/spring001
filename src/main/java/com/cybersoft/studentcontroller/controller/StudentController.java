package com.cybersoft.studentcontroller.controller;

import com.cybersoft.studentcontroller.entity.StudentEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    List<StudentEntity> students = new ArrayList<>();
    @PostMapping("/v1")
    public ResponseEntity<List<StudentEntity>>AddStudentByReqParam(@RequestParam String name, @RequestParam int age){
        StudentEntity student = new StudentEntity();
        student.setName(name);
        student.setAge(age);
        students.add(student);
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
    @PostMapping("/v2/{name}/age/{age}")
    public ResponseEntity<?>AddStudentByPathVar(@PathVariable String name, @PathVariable int age){
        StudentEntity student = new StudentEntity();
        student.setName(name);
        student.setAge(age);
        students.add(student);
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
    @PostMapping("/v3")
    public ResponseEntity<List<StudentEntity>>AddStudentByReqBody(@RequestBody StudentEntity student){
        students.add(student);
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
}