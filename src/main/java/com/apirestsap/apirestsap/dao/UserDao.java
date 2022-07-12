package com.apirestsap.apirestsap.dao;

import java.util.List;

import com.apirestsap.apirestsap.entitys.UsersModel;

public interface UserDao {
    public List<UsersModel> findAll();
    public UsersModel findById(int id);
    public void save(UsersModel user);
    public void deleteById(int id);
}
