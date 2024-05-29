package com.hei.vaikastoreapi.endpoint.rest;

import com.hei.vaikastoreapi.model.User;
import com.hei.vaikastoreapi.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private UserService service;

    @GetMapping
    public List<User> findAll(){
        return service.findAll();
    }
    @PostMapping
    public User saveUser(@RequestBody User toSave){
        return service.save(toSave);
    }
    @GetMapping("/{id}")
    public User getById(String id){
        return service.getByIdUser(id);
    }


}
