package com.allspark.students.mapper;

import com.allspark.students.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

public interface StudentMapper {
    @Mapper
    int insertStudent(Student student);
}
