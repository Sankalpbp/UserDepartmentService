package io.sankalp.userservice.controller;

import io.sankalp.userservice.dto.ResponseObject;
import io.sankalp.userservice.entity.User;
import io.sankalp.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ( "/users" )
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping ( "/" )
    public User saveUser ( @RequestBody User user ) {
        return service.saveUser ( user );
    }

    @GetMapping ( "/{id}" )
    public User findUserById ( @PathVariable ( "id" ) Long userId ) {
        return service.findUserById ( userId );
    }

    @GetMapping ( "/fullDetails/{id}" )
    public ResponseObject findUserDetails (@PathVariable ( "id" ) Long userId ) {
        return service.findUserDetail ( userId );
    }
}
