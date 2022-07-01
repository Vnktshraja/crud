package com.candid.crud.dao;

import com.candid.crud.model.Student;
import org.springframework.data.repository.CrudRepository;


public interface Repo extends CrudRepository<Student,Integer> {

}
