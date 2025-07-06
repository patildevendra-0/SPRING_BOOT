package com.example.RestDemo.container;

import com.example.RestDemo.entity.StudentEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;


@RestController
@RequestMapping("/students")
public class StudentContainer
{
    private HashMap<Integer, StudentEntity>StudentMap = new HashMap<>();

    @GetMapping("student")
    public Collection<StudentEntity> Get_Students()
    {
        return StudentMap.values();
    }

    @GetMapping("test")
    public String HealthCheck()
    {
        return "app running.....";
    }

    @PostMapping("create")
    public String create_student(@RequestBody StudentEntity student)
    {
        StudentMap.put(student.getId(),student);
        return "Student added with Id : "+student.getId();
    }
}
