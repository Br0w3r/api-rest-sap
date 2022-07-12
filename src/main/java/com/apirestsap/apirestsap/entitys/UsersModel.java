package com.apirestsap.apirestsap.entitys;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "OUSR")

public class UsersModel {
    @Id
    @GeneratedValue
    @Column(name = "USERID")
    private int id;

    @Column(name = "USER_CODE")
    private String password;

    @Column(name = "U_NAME")
    private String user;

    public UsersModel() {
    }

    public UsersModel(int id, String password, String user) {
        this.id = id;
        this.password = password;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UsersModel [id=" + id + ", password=" + password + ", user=" + user + "]";
    }
}
