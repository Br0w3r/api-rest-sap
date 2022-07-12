package com.apirestsap.apirestsap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("/users/{userId}")
    public UsersModel getUser(@PathVariable int userId) {
        UsersModel user = userService.findById(userId);

        if(user == null) {
            throw new RuntimeException("Usuario no encontrado - " + userId);
        }
        
        return user;
    }

    @PostMapping("/users")
    public UsersModel addUser(@RequestBody UsersModel user) {
        user.setId(0);

        //Este metodo guardará al usuario enviado
        userService.save(user);

        return user;
    }

     @DeleteMapping("users/{userId}")
    public String deteteUser(@PathVariable int userId) {

        UsersModel user = userService.findById(userId);

        if(user == null) {
            throw new RuntimeException("Usuario no encontrado - "+userId);
        }

        userService.deleteById(userId);

        //Esto método, recibira el id de un usuario por URL y se borrará de la bd.
        return "Usuario - " + userId + " eliminado con exito";
    }
}
