package com.example.complaint.UserController;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/userRegistration",consumes = "application/json",produces = "application/json")
    String UserRegistration( ){
        return "hi";

    }
}
