package com.candid.crud.controller;

import com.candid.crud.model.Student;
import com.candid.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    StudentService service;


    @GetMapping("/check")
    public String practice(){

        return "hello";
    }

    @PostMapping("/student")
    public String create(@RequestBody Student student){

        service.create(student);

        return "Data Saved Successfully..!";
    }

    @GetMapping("/getAll")
    public List<Student> getStudent(){
        List<Student> lst = service.getAll();
        return lst;
    }

    @GetMapping("/student/{id}")
    public Student getById(@PathVariable int id) throws NoSuchElementException {
        return service.getStudentById(id);
    }

    @PutMapping("/update")
    public String update(@RequestBody Student student)
    {

        service.update(student);
        return "updated Successfully";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){

        service.delete(id);
        return "Deleted successfully..!";
    }
}

