package com.example.complaint.UserController;

import com.example.complaint.UserDao.UserDao;
import com.example.complaint.UserModel.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

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
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/userLogin",consumes = "application/json",produces = "application/json")
    HashMap<String,String> UserLogin(@RequestBody UserModel userModel ){
        String user=userModel.getUserLogin();
        String pwd=userModel.getPassword();
        List<UserModel> result=(List<UserModel>) userDao.UserLogin(user,pwd);
        HashMap<String,String> st=new HashMap<>();
        if(result.size()==0)
        {
            st.put("status","failed");
            st.put("message","user doesn't exist");
        }
        else{
            int id =result.get(0).getId();
            st.put("userid",String.valueOf(id));
            st.put("status","success");
            st.put("message","user login success");
        }
        return st;


    }


}
