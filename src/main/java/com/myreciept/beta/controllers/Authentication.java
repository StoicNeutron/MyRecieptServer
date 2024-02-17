package com.myreciept.beta.controllers;

import com.myreciept.beta.DTO.LoginRequestDTO;
import com.myreciept.beta.DTO.SignUpRequestDTO;
import com.myreciept.beta.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

/**
 * @author Samnang Thorn
 */
@RestController
public class Authentication {

    private UserService userService;

    @Autowired
    public void UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/v1/signup", consumes = "application/json")
    public ResponseEntity<String> signup(@RequestBody SignUpRequestDTO signUpRequestDTO){
        this.userService.registerNewUser(signUpRequestDTO.getUserName(), signUpRequestDTO.getPassword(), signUpRequestDTO.getEmail());
        return new ResponseEntity<>("User Created Successfully!", HttpStatus.CREATED);
    }

    @PostMapping(value = "/v1/login", consumes = "application/json")
    public ResponseEntity<String> login(@RequestBody LoginRequestDTO loginRequestDTO){
        if(this.userService.authenticateUser(loginRequestDTO)){
            return new ResponseEntity<>("Success: Logging in!", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Incorrect Password!", HttpStatus.BAD_REQUEST);
        }
    }
}
