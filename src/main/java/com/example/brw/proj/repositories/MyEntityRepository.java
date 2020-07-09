package com.example.brw.proj.repositories;


import com.example.brw.proj.model.MyEntity;
import org.springframework.data.repository.CrudRepository;

public interface MyEntityRepository extends CrudRepository<MyEntity, Long> {
    
    MyEntity getByNameAndBoolIsFalse(String name);
}
