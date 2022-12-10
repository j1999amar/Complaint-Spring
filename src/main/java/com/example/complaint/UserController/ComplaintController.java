package com.example.complaint.UserController;

import com.example.complaint.UserDao.Complaintdao;
import com.example.complaint.UserModel.ComplaintModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class ComplaintController {
    @Autowired
    private Complaintdao complaintdao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addComplaint",consumes = "application/json",produces = "application/json")
    HashMap<String,String > AddComplaint(@RequestBody ComplaintModel complaintModel){
        HashMap<String,String > map =new HashMap<>();
        map.put("status","success");
        complaintdao.save(complaintModel);


    return map ;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/viewComplaint",consumes = "application/json",produces = "application/json")
    List<ComplaintModel> ViewComplaint(@RequestBody ComplaintModel complaintModel){
        return (List<ComplaintModel>) complaintdao.ViewComplaint(String.valueOf(complaintModel.getUserId()));
    }


}
