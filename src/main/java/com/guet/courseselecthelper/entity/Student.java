package com.guet.courseselecthelper.entity;

import com.guet.courseselecthelper.entity.vo.StudentDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    public sinfo sinfo;
    public Student.studies studies;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class sinfo extends StudentDto.sinfo {
        private String studentId;
        private String sname;
        private String sgender;
        private String sage;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class studies extends StudentDto.studies {
        private String sdepartment;
        private String smajor;
    }
}
