package com.example.complaint.UserDao;

import com.example.complaint.UserModel.ComplaintModel;
import org.springframework.data.repository.CrudRepository;

public interface Complaintdao extends CrudRepository<ComplaintModel,Integer> {
}
