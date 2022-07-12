package com.apirestsap.apirestsap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.apirestsap.apirestsap.entitys.UsersModel;
import com.apirestsap.apirestsap.services.UserServiceImpl;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.PUT,RequestMethod.POST})
@RequestMapping("/api")
public class UsersRest {

    //Inyeccion de servicio
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/users")
    public List<UsersModel> findAll() {

        return userService.findAll();
    }
    
}
