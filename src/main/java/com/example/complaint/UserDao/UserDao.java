package com.example.complaint.UserDao;

import com.example.complaint.UserModel.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<UserModel,String> {

}
