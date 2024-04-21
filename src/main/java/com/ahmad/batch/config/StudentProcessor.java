package com.ahmad.batch.config;

import com.ahmad.batch.student.Student;
import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Student , Student>{

    @Override
    public Student process(Student student) throws Exception {
        // Business Logic
        student.setId(null);
        return student;
    }
}
