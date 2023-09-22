package com.allspark.students.pojo;


import com.sun.istack.internal.NotNull;
import lombok.Data;
import org.springframework.lang.Nullable;

@Data
public class Student {
    @NotNull
    private String name;
    @NotNull
    private String major;
    @NotNull
    private String sclass;
    @Nullable
    private String qqNumber;
    @Nullable
    private String phoneNumber;
    @NotNull
    private String direction;
    @NotNull
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
