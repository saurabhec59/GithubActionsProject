package com.project.GithubActions.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
class UserController {

    @GetMapping("/home")
    public ResponseEntity<String> home(){
        return ResponseEntity.status(HttpStatus.OK).body("Welcome to Project");
    }
}