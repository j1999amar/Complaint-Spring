package com.example.complaint.UserDao;

import com.example.complaint.UserModel.UserModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.HashMap;
import java.util.List;

public interface UserDao extends CrudRepository<UserModel,String> {

    @Query(value = "SELECT * FROM `users` WHERE `user_login`= :user AND `password`= :pass ",nativeQuery = true)
    List<UserModel> UserLogin(@Param("user")String user, @Param("pass") String pass);

    @Query(value ="SELECT * FROM `users` WHERE `id`= :id",nativeQuery = true)
   List<UserModel> ViewProfile(@Param("id") String id);

}
