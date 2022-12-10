package com.example.complaint.UserController;

import com.example.complaint.UserDao.UserDao;
import com.example.complaint.UserModel.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class UserController {
    @Autowired
    private UserDao userDao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/userRegistration",consumes = "application/json",produces = "application/json")
    HashMap<String,String> UserRegistration(@RequestBody UserModel userModel ){
        HashMap<String,String> map =new HashMap<>();
        userDao.save(userModel);

        map.put("status","success");
        return map;

    }
}
