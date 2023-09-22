package com.allspark.students.controller;

import com.allspark.students.pojo.Student;
import com.allspark.students.service.StudentService;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
@Component
@Aspect
@RestController
@RequestMapping("student")
@Transactional
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/insertStudent")
    public String insertStudent(@Validated @RequestBody Student student, BindingResult result){
        System.out.println("student = " + student + ", result = " + result);
        if(result.hasErrors()){
            return "baomingshibai";
        }
        int rows = studentService.saveStudent(student);
        if(rows>0){
            return "报名成功啦！10月7日不见不散！";
        }
        return "shibai";
        }
}
