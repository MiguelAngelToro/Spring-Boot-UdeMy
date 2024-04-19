package com.miguel.webapp.springbootweb.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miguel.webapp.springbootweb.models.User;
import com.miguel.webapp.springbootweb.models.UserDto;

@RestController //Convierte el contenido en json rest
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details(){
        User user = new User("Miguel", "Toro");

        UserDto userDto = new UserDto();
        userDto.setTitle("Hola Mundo");
        userDto.setUser(user);
    
        return userDto;
    }
    
    @GetMapping("/details-map")
    public Map<String, Object> detailsMap(){
        User user = new User("Miguel", "Toro");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola Mundo");
        body.put("user",user);
    
        return body;
    }
}
