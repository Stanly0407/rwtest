package com.example.brw.proj.repositories;


import com.example.brw.proj.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface MyEntityRepository extends CrudRepository<Users, Long> {

   Users getBySurnameAndEmail(String surname, String email);
}
