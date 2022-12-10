package com.example.complaint.UserModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Complaints")
public class ComplaintModel {
    @Id
    @GeneratedValue
    private int id;
    private int userId;
    private String addComplaint;

    public ComplaintModel() {
    }

    public ComplaintModel(int id, int userId, String addComplaint) {
        this.id = id;
        this.userId = userId;
        this.addComplaint = addComplaint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAddComplaint() {
        return addComplaint;
    }

    public void setAddComplaint(String addComplaint) {
        this.addComplaint = addComplaint;
    }
}
