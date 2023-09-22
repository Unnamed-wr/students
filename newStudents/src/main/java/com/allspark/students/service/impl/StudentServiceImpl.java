package com.allspark.students.service.impl;

import com.allspark.students.mapper.StudentMapper;
import com.allspark.students.pojo.Student;
import com.allspark.students.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;
    public int saveStudent(Student student){
        int rows = studentMapper.insertStudent(student);
        if(rows>0){
            return 1;
        }
        return -1;
    }
}
