package com.example.complaint.UserDao;

import com.example.complaint.UserModel.ComplaintModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Complaintdao extends CrudRepository<ComplaintModel,Integer> {
    @Query(value = "SELECT  * FROM `complaints` WHERE `user_id`= :userId",nativeQuery = true)
    List<ComplaintModel> ViewComplaint(@Param("userId") String userId);
}
