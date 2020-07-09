package com.example.brw.proj.controllers;

import com.example.brw.proj.model.Users;
import com.example.brw.proj.repositories.MyEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class MyEntityController {

    @Autowired
    private final MyEntityRepository myEntityRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
//    @GetMapping(value = "/", produces = "application/json")
    public Users getMyEntity(@RequestParam("userID") long userId) {

        Optional<Users> byId = myEntityRepository.findById(userId);

        System.out.println(byId);
        return byId.get();
    }


}
