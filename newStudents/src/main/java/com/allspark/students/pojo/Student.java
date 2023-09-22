package com.allspark.students.pojo;


import com.sun.istack.internal.NotNull;
import lombok.Data;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotBlank;

@Data
public class Student {
    @NotBlank
    private String name;
    @NotBlank
    private String major;
    @NotBlank
    private String sclass;
    @Nullable
    private String qqNumber;
    @Nullable
    private String phoneNumber;
    @NotBlank
    private String direction;
    @NotBlank
    private String learned;
    @Nullable
    private String level="无";
    @Nullable
    private String notes="无";

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", sclass='" + sclass + '\'' +
                ", qqNumber='" + qqNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", direction='" + direction + '\'' +
                ", learned='" + learned + '\'' +
                ", level='" + level + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
