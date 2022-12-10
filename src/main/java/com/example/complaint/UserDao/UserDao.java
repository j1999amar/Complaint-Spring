package com.example.complaint.UserDao;

import com.example.complaint.UserModel.UserModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserDao extends CrudRepository<UserModel,String> {
    @Query(value = "SELECT   u.name,u.`email`,u.`phone`,c.add_complaint  FROM `users`AS u JOIN complaints AS c on c.user_id=u.id",nativeQuery = true)
    List<Map<String, String>> ViewAllComplaints();

    @Query(value = "SELECT * FROM `users` WHERE `user_login`= :user AND `password`= :pass ",nativeQuery = true)
    List<UserModel> UserLogin(@Param("user")String user, @Param("pass") String pass);

    @Query(value ="SELECT * FROM `users` WHERE `id`= :id",nativeQuery = true)
   List<UserModel> ViewProfile(@Param("id") String id);

}
