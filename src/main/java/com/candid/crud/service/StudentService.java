package com.candid.crud.service;

import com.candid.crud.dao.Repo;
import com.candid.crud.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@Transactional
public class StudentService {

    @Autowired
    Repo repo;

    //ArrayList<Student> arrayList = new ArrayList<>();

    public void create(Student student){
        repo.save(student);
    }

    public List<Student> getAll(){

        List<Student> list2 = (List<Student>) repo.findAll();
         return list2;
    }

    public Student getStudentById(int id) throws NoSuchElementException{

        return repo.findById(id).get();

    }

    public void update(Student student){

        repo.save(student);

    }

    public void delete(int id){
        repo.deleteById(id);
    }
}
